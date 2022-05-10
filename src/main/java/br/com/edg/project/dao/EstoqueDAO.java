package br.com.edg.project.dao;

import br.com.edg.project.model.Estoque;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elvis - PC
 */
public class EstoqueDAO {
    
    private static final String base = "edg";
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3306/" + base + "?useTimezone=true&serverTimezone=UTC";
    
    private static Connection conexao;
    
    public static ArrayList<Estoque> consultar(int codProduto) {
        ArrayList<Estoque> listaRetorno = new ArrayList<>();
        
        String scriptSql = "SELECT * FROM ESTOQUE WHERE ID_PRODUTO = ?";
        
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            PreparedStatement stmt = conexao.prepareStatement(scriptSql);
            
            stmt.setInt(1, codProduto);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Estoque produto = new Estoque();
                    produto.setCodProduto(rs.getInt("ID_PRODUTO"));
                    produto.setNomeProduto(rs.getString("NOME"));                    
                    produto.setQtdeProduto(rs.getInt("QUANTIDADE"));
                    produto.setValidade(rs.getString("VALIDADE"));
                    
                    listaRetorno.add(produto);
                }
            } else {
                throw new SQLException();
            }
        } catch (SQLException e) {
            listaRetorno = null;
        } catch (ClassNotFoundException e) {
            listaRetorno = null;
        }
        
    return listaRetorno;
    
    }
}
