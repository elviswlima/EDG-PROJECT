/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.dao;

import br.com.edg.project.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO para consultar nota fiscal
 * 
 * @author Danilo
 */
public class NotaFiscalDAO {
    
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static Connection connection;

    /**
     * Método para consultar nota fiscal de determinado cliente
     * @param id - Id do cliente para referenciar busca
     * @return Int - ID da nota fiscal
     */
    public static int findByCliente(int id) {
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = connection.prepareStatement("SELECT ID_NOTA_FISCAL FROM NOTA_FISCAL WHERE ID_CLIENTE_NF = ? ORDER BY DATA_VENDA DESC LIMIT 1");
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
               return rs.getInt("ID_NOTA_FISCAL");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return -1;
    }
    
}
