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

/**
 *
 * @author Danilo
 */
public class ClienteController {
    
    public static boolean inserirCliente(Cliente cliente) {
        /* Valida se gravou corretamente no banco de dados */
        return ClienteDAO.inserirCliente(cliente);
    }
    
    public static Cliente consultaClientes(Cliente cliente) {
        return ClienteDAO.consultarClientes(cliente);
    }
    
    public static Cep consultarCep(String cep) throws IOException {
        CepService cepService = new CepService();
        
        return cepService.consultaCep(cep);
    }
    
}
