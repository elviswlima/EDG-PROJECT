/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.ClienteDAO;
import br.com.edg.project.model.Cep;
import br.com.edg.project.model.Cliente;
import br.com.edg.project.service.CepService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class ClienteController {
    
    public static boolean inserirCliente(Cliente cliente) throws SQLException {
        /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.inserirCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao cadastrar cliente");
    }
    
    public static Cliente consultaClientes(Cliente cliente) throws SQLException {
        return ClienteDAO.consultarById(cliente);
    }
    
    public static Cep consultarCep(String cep) throws IOException {
        CepService cepService = new CepService();
        
        return cepService.consultaCep(cep);
    }
    
    public static ArrayList<Cliente> consultarBy(Cliente cliente, boolean isCpf) throws SQLException {
        ArrayList<Cliente> clientes = ClienteDAO.consultarBy(cliente, isCpf);
        
        if (clientes.isEmpty()) {
            throw new IllegalArgumentException("Nenhum cliente cadastrado com este nome ou cpf na nossa base!");
        }
        
        return clientes;
    }

    public static boolean alterarCliente(Cliente cliente) throws SQLException {
         /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.alterarCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao alterar cliente");
    }
    
    public static boolean excluirCliente(Cliente cliente) throws SQLException {
        /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.excluirCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao excluir cliente");
    }
    
}
