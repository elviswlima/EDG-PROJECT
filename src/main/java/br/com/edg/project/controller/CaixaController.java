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
 * Classe de CRUD de vendas de produtos
 * 
 * @author Danilo Almeida dos Santos
 * @author Guilherme
 */
public class CaixaController {

    /**
     * Consulta o cliente que está realizando a compra
     * 
     * @param cpf - CPF do cliente
     * @return - return o id do cliente
     */
    public static int consultaCliente(String cpf) {
        return CaixaDAO.consultaCliente(cpf);
    }


    /**
     * Consulta o produto com intenção de compra
     * 
     * @param idProduto - Indentificação do produto
     * @param isKg - verifica o produto é por quilo ou unidade
     * @return 
     */
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
    
    public static boolean registrarVenda(Caixa caixa, ArrayList<Produto> produto) {
           return CaixaDAO.registrarVenda(caixa, produto);
    }

}
