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
 * Classe CRUD para cadastro de clientes
 * 
 * @author Danilo
 */
public class ClienteController {
    
    /**
     * Método para gravar informações do cliente no banco de dados
     * @param cliente - Objeto Cliente a ser recebido para inserção de dados
     * @return true para inserido e false para não inserido
     * @throws SQLException - Detecção de erro na conexão
     */
    public static boolean inserirCliente(Cliente cliente) throws SQLException {
        /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.inserirCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao cadastrar cliente");
    }
    
    /**
     * Método para consultar clientes
     * @param cliente - Objeto instanciado para referenciar busca
     * @return Informações do cliente gravadas no banco de dados para inserção na FrmCadastroCliente
     * @throws SQLException - Detecção de erro na conexão
     */
    public static Cliente consultaClientes(Cliente cliente) throws SQLException {
        return ClienteDAO.consultarById(cliente);
    }
    
    /**
     * Método para receber o CEP e retornar o endereço através de uma API
     * @param cep - Variável do tipo string com o CEP como referência
     * @return Informações do CEP consultado em "https://viacep.com.br/ws/" + cep + "/json/"
     * @throws IOException 
     */
    public static Cep consultarCep(String cep) throws IOException {
        CepService cepService = new CepService();
        
        return cepService.consultaCep(cep);
    }
    
    /**
     * Método para consultar informações no banco de dados e retornar os dados gravados
     * @param cliente - Objeto para passar nome como referência, caso usuário pesquise por nome
     * @param isCpf - Variável booleana para referênciar se a pesquisa do cliente será por CPF (isCPF == True) ou Nome (isCPF == !true)
     * @return ArrayList de informações do cliente consultadas no banco dados
     * @throws SQLException - Detecção de erro na conexão
     */
    public static ArrayList<Cliente> consultarBy(Cliente cliente, boolean isCpf) throws SQLException {
        ArrayList<Cliente> clientes = ClienteDAO.consultarBy(cliente, isCpf);
        
        if (clientes.isEmpty()) {
            throw new IllegalArgumentException("Nenhum cliente cadastrado com este nome ou cpf na nossa base!");
        }
        
        return clientes;
    }

    /**
     * Método para alterar dados do cliente
     * @param cliente - Objeto para passar atributos a serem alterados
     * @return True para alterado e False para não alterado
     * @throws SQLException - Detecção de erro na conexão
     */
    public static boolean alterarCliente(Cliente cliente) throws SQLException {
         /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.alterarCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao alterar cliente");
    }
    
    /**
     * Método para excluir cliente e suas informações do banco de dados
     * @param cliente - Objeto que irá referenciar um Id do cliente que será excluído
     * @return True para excluído e False para não excluído
     * @throws SQLException - Detecção de erro na conexão
     */
    public static boolean excluirCliente(Cliente cliente) throws SQLException {
        /* Valida se gravou corretamente no banco de dados */
        if (ClienteDAO.excluirCliente(cliente)) {
            return true;
        } 
        
        throw new RuntimeException("Erro ao excluir cliente");
    }
    
}
