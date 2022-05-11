/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.dao;

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
 * @author Danilo
 */
public class ClienteDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3307/EDG?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWD = "";
    private static Connection connection;

    public static Cliente consultarClientes(Cliente cliente) {
        try {
            Cliente rCliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF LIKE ? OR NOME LIKE ?");
            stmt.setString(1, "%" + cliente.getCpf() + "%");
            stmt.setString(2, "%" + cliente.getNome() + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rCliente.setNome(rs.getString("NOME"));
                rCliente.setCpf(rs.getString("CPF"));
                rCliente.setTelefone(rs.getString("TELEFONE"));
                rCliente.setDataNascimento(rs.getDate("DATA_NASC"));
                rCliente.setSexo(rs.getString("SEXO"));
                rCliente.setRg(rs.getString("RG"));
                rCliente.setEmail(rs.getString("EMAIL"));
                rCliente.setCep(rs.getString("CEP"));
                rCliente.setCidade(rs.getString("CIDADE"));
                rCliente.setBairro(rs.getString("BAIRRO"));
                rCliente.setNumEndereco(rs.getString("NUMERO"));
                rCliente.setComplemento(rs.getString("COMPLEMENTO"));
                rCliente.setEstado(rs.getString("ESTADO"));
                rCliente.setCidade(rs.getString("CIDADE"));
            }

            return rCliente;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static Cliente consultarBy(Cliente cliente, boolean isName) {
        try {
            Cliente rCliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            
            PreparedStatement stmt;
            
            if (isName) {
                stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE NOME LIKE ?");
                stmt.setString(1, "%" + cliente.getNome() + "%");
            } else {
                stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF LIKE ?");
                stmt.setString(1, "%" + cliente.getCpf() + "%");
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rCliente.setNome(rs.getString("NOME"));
                rCliente.setCpf(rs.getString("CPF"));
                rCliente.setTelefone(rs.getString("TELEFONE"));
                rCliente.setCidade(rs.getString("CIDADE"));
            }

            return rCliente;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static boolean inserirCliente(Cliente cliente) {
        try {
            Cliente rCliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("INSERT INTO CLIENTES VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getRg());
            stmt.setString(6, cliente.getEmail());
            stmt.setDate(7, cliente.getDataNascimento());
            stmt.setString(8, cliente.getCep());
            stmt.setString(9, cliente.getCidade());
            stmt.setString(10, cliente.getEstado());
            stmt.setString(11, cliente.getRua());
            stmt.setString(12, cliente.getBairro());
            stmt.setString(13, cliente.getNumEndereco());
            stmt.setString(14, cliente.getComplemento());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
