/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.ProdutoDAO;
import br.com.edg.project.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
   public static Produto findById(int id) {
       return ProdutoDAO.findById(id);
   }
    
}
