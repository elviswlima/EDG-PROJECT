package br.com.edg.project.dao;

import br.com.edg.project.model.VendaProduto;

import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO para fazer consultas e cadastros de vendas
 *
 * @author Danilo Almeida
 * @author guilherme.mlsilva1
 */
public class CaixaDAO {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static Connection connection;

    /**
     * Consulta no banco de dados o cliente que fará a compra
     *
     * @param cpf - Cpf do cliente cadastrado no banco de dados
     * @return
     */
    public static int consultaCliente(String cpf) {
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ?");
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return rs.getInt("ID_CLIENTE");
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

        return 0;
    }

    /**
     * Consulta no banco de dados produto que será adicionado a lista de compras
     *
     * @param idProduto - Indentificador do produto que será realizada consulta
     * @return
     */
    public static Produto consultaProduto(int idProduto) {
        try {
            Produto p = new Produto();
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM PRODUTOS WHERE ID_PRODUTO = ?");
            stmt.setInt(1, idProduto);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                p.setCodProduto(rs.getInt("ID_PRODUTO"));
                p.setNomeProduto(rs.getString("NOME_PRODUTO"));
                p.setValorProduto(rs.getDouble("VALOR"));
                p.setQtdePorKg(rs.getDouble("KG"));
                p.setQtdeProduto(rs.getInt("QUANTIDADE"));
            }
            return p;

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

        return null;
    }

    /**
     * Registra venda no banco de dados
     *
     * @param caixa - Objeto caixa com as registrar a venda no banco de dados
     * @param produtos Objeto com a indentificação do produto que será realizada
     * a venda
     * @param isSelected
     * @return
     */
    public static boolean registrarVenda(Caixa caixa, ArrayList<Produto> produtos) {
        try {
            PreparedStatement stmt;
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");

            stmt = connection.prepareStatement(
                    "INSERT INTO CAIXA (ID_CLIENTE, QUANTIDADE, KG, VALOR_TOTAL) VALUES (?, ?, ?, ?);",
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, caixa.getIdCliente());
            stmt.setInt(2, caixa.getQtde());
            stmt.setDouble(3, caixa.getKg());
            stmt.setDouble(4, caixa.getValorTotal());

            if (stmt.executeUpdate() > 0) {
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()) {

                    for (Produto p : produtos) {
                        if (p.getQtdePorKg() > 0) {
                            stmt = connection.prepareStatement(
                                    "INSERT INTO VENDA_PRODUTO (ID_CAIXA, ID_PRODUTO, KG, VALOR_TOTAL, QTDE) VALUES (?, ?, ?, ?, ?);");
                            stmt.setInt(1, rs.getInt(1));
                            stmt.setInt(2, p.getCodProduto());
                            stmt.setDouble(3, p.getQtdePorKg());
                            stmt.setDouble(4, p.getValorProduto());
                            stmt.setInt(5, 0);
                            stmt.executeUpdate();
                        } else {
                            stmt = connection.prepareStatement(
                                    "INSERT INTO VENDA_PRODUTO (ID_CAIXA, ID_PRODUTO, QTDE, VALOR_TOTAL, KG) VALUES (?, ?, ?, ?, ?);");
                            stmt.setInt(1, rs.getInt(1));
                            stmt.setInt(2, p.getCodProduto());
                            stmt.setInt(3, p.getQtdeProduto());
                            stmt.setDouble(4, p.getValorProduto());
                            stmt.setDouble(5, 0);
                            stmt.executeUpdate();
                        }
                    }

                    stmt = connection.prepareStatement(
                            "INSERT INTO NOTA_FISCAL(ID_CAIXA_NF, ID_CLIENTE_NF, VALOR_TOTAL) VALUES (?, ?, ?);");
                    stmt.setInt(1, rs.getInt(1));
                    stmt.setInt(2, caixa.getIdCliente());
                    stmt.setDouble(3, caixa.getValorTotal());

                    return stmt.executeUpdate() > 0;
                }
            }

            return false;
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

        return false;
    }
}
