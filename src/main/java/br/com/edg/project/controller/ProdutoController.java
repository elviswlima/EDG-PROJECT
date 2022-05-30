/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.ProdutoDAO;
import br.com.edg.project.model.Produto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class ProdutoController {
    
    /**
     * Método para gravar informações do produto no banco de dados
     * @param produtos - ArrayList criada para registro dos dados em lista
     * @return true para registrado e false para não registrado
     */
    public static boolean registrarProdutos(ArrayList<Produto> produtos) {
        for (Produto p : produtos) {
            if (!ProdutoDAO.registrar(p)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Método para consultar produtos utilizada pela FrmCaixa
     * @param id - nome da variável como referência para consulta do produto
     * @return Informações do produto gravados no banco de dados para inserção no caixa
     */
    public static Produto findById(int id) {
        try {
           return ProdutoDAO.findById(id);
        } catch (Exception e) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, e);
             throw new RuntimeException("Error: " + e.getMessage());
        }
    }

}
