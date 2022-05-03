
package br.com.edg.project.dao;
    

import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme.mlsilva1
 */
public class CaixaDAO {
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3307/EDG?useTimezone=true&serverTimezone=UTC";
    private static Connection connection;
        
        public static int consulta(String cpf){
            
         int retorno = 0;
            
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url,"root", "");
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
                stmt.setString(1, cpf);
                ResultSet rs = stmt.executeQuery();
                
                
                while (rs.next()) {
                    retorno = rs.getInt("");
                }
                
                
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
        }
        
        
        public static boolean registrar(Caixa caixaFinalizar){
            boolean retorno = false;
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
        }
    }
