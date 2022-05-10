/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.ProdutoDAO;
import br.com.edg.project.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Danilo
 */
public class ProdutoController {
    
    public static boolean registrarProdutos(ArrayList<Produto> produtos){
        for (Produto p : produtos) {
            if (!ProdutoDAO.registrar(p)) {
                return false;
            }
        }
        
        return true;
    }
    
}