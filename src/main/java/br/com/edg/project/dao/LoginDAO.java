package br.com.edg.project.dao;

import br.com.edg.project.model.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elvis.wlima
 */
public class LoginDAO {
    
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:ysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "";
    private static Connection connection = null;
    
    public static boolean login (Login login) {
        boolean retorno = false;
        
        try {
            Class.forName(Driver);
            
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = 
                    connection.prepareStatement("SELECT * FROM Login WHERE Usuario = 'admin' AND Senha = 'admin'");
            
            stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());
            
            retorno = true;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        } catch (SQLException ex) {
                Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
                retorno = false;
        }
        
        return retorno;
    }
        
    
}
