/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.dao;

import br.com.edg.project.dao.config.ConfigDB;
import br.com.edg.project.model.Produto;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class ProdutoDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/EDG?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWD = "";
    private static Connection connection;

    public static boolean registrar(Produto produto) {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt = connection
                    .prepareStatement("INSERT INTO PRODUTOS (NOME_PRODUTO, VALOR, KG, QUANTIDADE, VALIDADE) VALUES (?,?,?,?,?);");
            stmt.setString(1, produto.getNomeProduto());
            stmt.setDouble(2, produto.getValorProduto());
            stmt.setDouble(3, produto.getQtdePorKg());
            stmt.setDouble(4, produto.getQtdeProduto());
            stmt.setDate(5, produto.getValidade());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            } else {
                return false;
            }
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
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

    public static Produto findById(int id) {
        Produto produto = new Produto();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM PRODUTOS WHERE ID_PRODUTO = ?";

        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url, "root", "");
            stmt = connection.prepareStatement(query);

            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    double kg = rs.getDouble("KG");
                    int qtde = rs.getInt("QUANTIDADE");

                    if (kg > 0 || qtde > 0) {
                        produto.setCodProduto(rs.getInt("ID_PRODUTO"));
                        produto.setNomeProduto(rs.getString("NOME_PRODUTO"));
                        produto.setValorProduto(rs.getDouble("VALOR"));
                        produto.setQtdeProduto(rs.getInt("QUANTIDADE"));
                        produto.setQtdePorKg(rs.getDouble("KG"));
                        produto.setValidade(rs.getDate("VALIDADE"));

                        return produto;
                    } else {
                        throw new RuntimeException("Produto esgotado!");
                    }
                }

            } else {
                throw new SQLException("Código do produto não existe ou banco de dados vazio.");
            }
        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        return null;
    }
}
