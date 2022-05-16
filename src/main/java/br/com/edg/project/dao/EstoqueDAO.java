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
 * Classe para abrir conexão com a base de dados 'edg'
 * @author Elvis - PC
 */
public class EstoqueDAO {

    private static final String base = "edg";
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3306/" + base + "?useTimezone=true&serverTimezone=UTC";

    private static Connection conexao;
    
    /**
     * Método para consultar um produto através do Id do produto
     * @param prod - objeto a ser recebido como referência para consulta (prod.getCodProduto();)
     * @return - ArrayList (Caso exista) dos dados obtidos no banco (id, nome, qtde...)
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */ 
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
        } catch (NullPointerException ex) {
            throw new IllegalArgumentException("Falha na execução ou resultado da query.");
        } finally {
            try {
                if(rs != null)
                    rs.close();
                if(stmt != null)
                    stmt.close();
                if(conexao != null)
                    conexao.close();
            } catch (SQLException e) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        
    return listaRetorno;
    
    }
    
    /**
     * Método para deletar um produto através do Id do produto
     * @param prod - objeto a ser recebido como referência para exclusão (prod.getCodProduto();)
     * @return - true se os dados forem excluídos / false se não forem excluídos
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static boolean excluir(Produto prod) {
       
        String query = "DELETE FROM ESTOQUE WHERE ID_PRODUTO = ?";
        
        PreparedStatement stmt = null;
        
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);
            
            stmt.setInt(1, prod.getCodProduto());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if(linhasAfetadas > 0) {
                return true;
            } else {
                return false;
            }
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
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        return false;
    }
    
    /**
     * Método para alterar um produto, recebe objeto Id como referência e os demais objetos para alteração
     * @param prod - objeto para referenciar produtos que serão alterados
     * @return - true para alterado e false para não alterado
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static boolean alterar(Produto prod){
        
        String query = "UPDATE PRODUTO SET NOME_PRODUTO = ?, VALOR = ?, KG = ?, QUANTIDADE = ? WHERE ID_PRODUTO = ?";
        
        PreparedStatement stmt = null;
        
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);
            
            stmt.setString(1, prod.getNomeProduto());
            stmt.setDouble(2, prod.getValorProduto());
            stmt.setDouble(3, prod.getQtdePorKg());
            stmt.setInt(4, prod.getQtdeProduto());
            stmt.setInt(5, prod.getCodProduto());
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if(linhasAfetadas > 0) {
                return true;
            } else {
                return false;
            }
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
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        
        return false;
        }
    }
    
}
