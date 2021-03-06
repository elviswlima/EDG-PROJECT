package br.com.edg.project.dao;

import br.com.edg.project.model.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO para realizar Login
 * 
 * @author elvis.wlima
 */
public class LoginDAO {
    
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/edg";
    private static final String user = "root";
    private static final String password = "";
    private static Connection connection;
    
    /**
     * Método retorna uma variável booleana para informar que os dados inseridos existem ou não
     * @param login - objeto a ser recebido para verificação
     * @return true se os dados existirem no registro / false se os dados não existirem no registro
     */
    public static boolean login (Login login) {

        try {
            Class.forName(Driver);
            
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = 
                    connection.prepareStatement("SELECT * FROM FUNCIONARIOS WHERE EMAIL = ? AND SENHA = ?");
            
            stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                return true;
            } else {
                return false;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
    
}
