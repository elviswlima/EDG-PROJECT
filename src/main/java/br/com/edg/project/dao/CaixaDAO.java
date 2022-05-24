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
 *
 * @author guilherme.mlsilva1
 */
public class CaixaDAO {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static Connection connection;

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

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

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

        } catch (Exception e) {

        }
        return null;
    }

    public static boolean registrarVenda(Caixa caixa, Produto produto, boolean isKg) {
        try {
            PreparedStatement stmt;
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");

            stmt = connection.prepareStatement(
                    "INSERT INTO CAIXA (ID_CLIENTE, QUANTIDADE, KG, VALOR_TOTAL) VALUES (?, ?, ?, ?);",
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, caixa.getIdCliente());
            stmt.setInt(2, caixa.getQtde());
            stmt.setDouble(3, 0);
            stmt.setDouble(4, caixa.getValorTotal());

            if (stmt.executeUpdate() > 0) {
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()) {
                    VendaProduto vp = new VendaProduto(
                            rs.getInt(1),
                            produto.getCodProduto(),
                            produto.getQtdeProduto(),
                            produto.getQtdePorKg(),
                            produto.getValorProduto()
                    );

                    stmt = connection.prepareStatement(
                                    "INSERT INTO VENDA_PRODUTO (ID_CAIXA, ID_PRODUTO, QTDE, KG, VALOR_TOTAL) VALUES (?, ?, ?, ?, ?);");
                    stmt.setInt(1, vp.getIdCaixa());
                    stmt.setInt(2, vp.getIdProduto());
                    stmt.setInt(3, vp.getQtde());
                    stmt.setDouble(4, vp.getKg());
                    stmt.setDouble(5, vp.getValorUni());

                    return stmt.executeUpdate() > 0;
                }
            }

            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean atualizarEstoque(VendaProduto caixaFinalizar) {
        try {
            Class.forName(Driver);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
