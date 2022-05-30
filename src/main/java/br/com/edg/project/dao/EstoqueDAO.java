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
 * Classe para consultar, excluir ou alterar produtos no estoque
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

    /**
     * Método para consultar um produto através do Id do produto
     *
     * @param prod - objeto a ser recebido como referência para consulta
     * (prod.getCodProduto();)
     * @return - ArrayList (Caso exista) dos dados obtidos no banco (id, nome,
     * qtde...)
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static Produto consultar(Produto prod) {
        Produto est = new Produto();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM PRODUTOS WHERE ID_PRODUTO = ?";

        try {

            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);

            stmt.setInt(1, prod.getCodProduto());
            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    est.setCodProduto(rs.getInt("ID_PRODUTO"));
                    est.setNomeProduto(rs.getString("NOME_PRODUTO"));
                    est.setValorProduto(rs.getDouble("VALOR"));
                    est.setQtdePorKg(rs.getDouble("KG"));
                    est.setQtdeProduto(rs.getInt("QUANTIDADE"));
                    est.setValidade(rs.getDate("VALIDADE"));
                }
                return est;
            } else {
                throw new SQLException("Código do produto não existe ou banco de dados vazio.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }

        return null;

    }

    /**
     * Método para deletar um produto através do Id do produto
     *
     * @param prod - Objeto instanciado para referenciar o ID do produto a ser excluído
     * @return - true se os dados forem excluídos / false se não forem excluídos
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static boolean excluir(Produto prod) {

        String query = "DELETE FROM PRODUTOS WHERE ID_PRODUTO = ?";

        PreparedStatement stmt = null;

        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);

            stmt.setInt(1, prod.getCodProduto());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
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
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        return false;
    }

    /**
     * Método para alterar um produto, recebe objeto Id como referência e os
     * demais objetos para alteração
     *
     * @param prod - objeto para referenciar produtos que serão alterados
     * @return - true para alterado e false para não alterado
     * @throws ClassNotFoundException - Não achou o driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static boolean alterar(Produto prod) {

        String query = "UPDATE PRODUTOS SET NOME_PRODUTO = ?, VALOR = ?, QUANTIDADE = ?, KG = ?, VALIDADE = ? WHERE ID_PRODUTO = ?";

        PreparedStatement stmt = null;

        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao.prepareStatement(query);

            stmt.setString(1, prod.getNomeProduto());
            stmt.setDouble(2, prod.getValorProduto());
            stmt.setInt(3, prod.getQtdeProduto());
            stmt.setDouble(4, prod.getQtdePorKg());
            stmt.setDate(5, prod.getValidade());
            stmt.setInt(6, prod.getCodProduto());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
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
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        return false;
    }

}
