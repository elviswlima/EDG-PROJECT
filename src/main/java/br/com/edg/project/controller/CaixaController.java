/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.CaixaDAO;
import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class CaixaController {

    public static int consultaCliente(String cpf) {
        return CaixaDAO.consultaCliente(cpf);
    }


    public static Produto consultaProduto(int idProduto, boolean isKg) {

        Produto p = new Produto(); 
        Produto pCaixaDAO = CaixaDAO.consultaProduto(idProduto);
        try {
            if (isKg) {
                p.setNomeProduto(pCaixaDAO.getNomeProduto());
                p.setValorProduto(pCaixaDAO.getValorProduto());
                p.setQtdePorKg(pCaixaDAO.getQtdePorKg());

            } else {
                p.setNomeProduto(pCaixaDAO.getNomeProduto());
                p.setValorProduto(pCaixaDAO.getValorProduto());
                p.setQtdeProduto((int) pCaixaDAO.getQtdeProduto());
            }

        } catch (Exception e) {
        }
        return p;
    }
    
    public static boolean registrarVenda(Caixa caixa, Produto produto) {
//        , boolean isKg
           return CaixaDAO.registrarVenda(caixa, produto, true);
    }

}
