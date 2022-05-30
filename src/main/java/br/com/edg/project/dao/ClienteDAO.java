/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.dao;

import br.com.edg.project.model.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class ClienteDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWD = "";
    private static Connection connection;

    public static Cliente consultarById(Cliente cliente) throws SQLException {
        try {
            Cliente rCliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF LIKE ? OR NOME LIKE ? ORDER BY NOME DESC");
            stmt.setString(1, "%" + cliente.getCpf() + "%");
            stmt.setString(2, "%" + cliente.getNome() + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rCliente.setId(rs.getInt("ID_CLIENTE"));
                rCliente.setNome(rs.getString("NOME"));
                rCliente.setCpf(rs.getString("CPF"));
                rCliente.setTelefone(rs.getString("TELEFONE"));
                rCliente.setDataNascimento(Date.valueOf(rs.getDate("DATA_NASC").toString()));
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static List<Cliente> TodosClientes() {
        try {
            List<Cliente> clientes = new ArrayList<>();
            Cliente cliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("SELECT * FROM CLIENTES WHERE ORDER BY NOME DESC");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                cliente.setId(rs.getInt("ID_CLIENTE"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setDataNascimento(Date.valueOf(rs.getDate("DATA_NASC").toString()));
                cliente.setSexo(rs.getString("SEXO"));
                cliente.setRg(rs.getString("RG"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setNumEndereco(rs.getString("NUMERO"));
                cliente.setComplemento(rs.getString("COMPLEMENTO"));
                cliente.setEstado(rs.getString("ESTADO"));
                cliente.setCidade(rs.getString("CIDADE"));

                clientes.add(cliente);
            }

            return clientes;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static ArrayList<Cliente> consultarBy(Cliente cliente, boolean isCpf) throws SQLException {
        try {
            ArrayList<Cliente> clientes = new ArrayList<>();
            Cliente rCliente = new Cliente();
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);

            PreparedStatement stmt;

            if (isCpf) {
                stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ?");
                stmt.setString(1, cliente.getCpf());
            } else {
                stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE NOME LIKE ?");
                stmt.setString(1, "%" + cliente.getNome() + "%");
            }

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rCliente.setId(rs.getInt("ID_CLIENTE"));
                rCliente.setNome(rs.getString("NOME"));
                rCliente.setCpf(rs.getString("CPF"));
                rCliente.setTelefone(rs.getString("TELEFONE"));
                rCliente.setDataNascimento(Date.valueOf(rs.getDate("DATA_NASC").toString()));
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
                rCliente.setRua(rs.getString("LOGRADOURO"));

                clientes.add(rCliente);
            }

            return clientes;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static boolean inserirCliente(Cliente cliente) throws SQLException {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("INSERT INTO CLIENTES (NOME, CPF, TELEFONE, SEXO, RG, EMAIL, DATA_NASC, CEP, CIDADE, ESTADO, LOGRADOURO, BAIRRO, NUMERO, COMPLEMENTO)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error: " + ex);
        }
    }

    public static boolean alterarCliente(Cliente cliente) throws SQLException {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("UPDATE CLIENTES SET NOME = ?, CPF = ?, TELEFONE = ?, SEXO = ?, RG = ?, EMAIL = ?, DATA_NASC = ?, CEP = ?, CIDADE = ?, ESTADO = ?, LOGRADOURO = ?, BAIRRO = ?, NUMERO = ?, COMPLEMENTO = ? WHERE ID_CLIENTE = ?");
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
            stmt.setInt(15, cliente.getId());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error: " + ex);
        }
    }

    public static boolean excluirCliente(Cliente cliente) throws SQLException {
         try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWD);
            PreparedStatement stmt
                    = connection.prepareStatement("DELETE FROM CLIENTES  WHERE ID_CLIENTE = ?");
            stmt.setInt(1, cliente.getId());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error: " + ex);
        }
    }
}
