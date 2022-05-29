/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.NotaFiscalDAO;
import br.com.edg.project.model.Cliente;

/**
 *
 * @author Danilo
 */
public class NotaFiscalController {
    
    public static int findByCliente(Cliente cliente) {
        return NotaFiscalDAO.findByCliente(cliente.getId());
    }
}
