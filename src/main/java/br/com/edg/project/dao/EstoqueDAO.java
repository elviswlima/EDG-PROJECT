package br.com.edg.project.dao;

import br.com.edg.project.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
    public static ArrayList<Produto> consultar(Produto prod) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM PRODUTO WHERE ID_PRODUTO = ?";
        
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);
            
            stmt.setInt(1, prod.getCodProduto());
            rs = stmt.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Produto est = new Produto();
                    est.setCodProduto(rs.getInt("ID_PRODUTO"));
                    est.setNomeProduto(rs.getString("NOME_PRODUTO"));                    
                    est.setQtdeProduto(rs.getInt("QUANTIDADE"));
                    est.setQtdePorKg(rs.getDouble("KG"));
                    //est.setValidade(rs.getString("VALIDADE"));
                    
                    listaRetorno.add(est);
                }
            } else {
                throw new SQLException("Código do produto não existe ou banco de dados vazio.");
            }
        } catch (SQLException ex) {
            listaRetorno = null;
        } catch (ClassNotFoundException ex) {
            listaRetorno = null;
        } finally {
            try {
                if(rs != null)
                    rs.close();
                if(stmt != null)
                    stmt.close();
                if(conexao != null)
                    conexao.close();
            } catch (SQLException ex) {
            }
        }
        
    return listaRetorno;
    
    }
    
    public static boolean excluir(Produto prod) {
        
        boolean retorno = false;
        
        String query = "DELETE FROM ESTOQUE WHERE ID_PRODUTO = ?";
        
        PreparedStatement stmt = null;
        
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);
            
            stmt.setInt(1, prod.getCodProduto());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if(linhasAfetadas > 0)
                retorno = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(stmt != null)
                    stmt.close();
                if(conexao != null)
                    conexao.close();
            } catch (SQLException ex) {
            }
        }
        return retorno;
    }
    
}
