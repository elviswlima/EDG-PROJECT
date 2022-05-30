/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.NotaFiscalDAO;
import br.com.edg.project.model.Cliente;

/**
 * Classe Nota fiscal
 * 
 * @author Danilo
 */
public class NotaFiscalController {
    
    /**
     * Método findByCliente vai buscar o cliente que está comprando para gerar a nota fiscal
     * @param cliente - Objeto que irá referenciar o Id do cliente para gerar a nota
     * @return Variável Int como Id da nota fiscal
     */
    public static int findByCliente(Cliente cliente) {
        return NotaFiscalDAO.findByCliente(cliente.getId());
    }
}
