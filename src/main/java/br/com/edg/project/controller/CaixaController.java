/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.controller;

import br.com.edg.project.dao.CaixaDAO;
import br.com.edg.project.model.Caixa;
import java.util.ArrayList;

/**
 *
 * @author Danilo
 */
public class CaixaController {
    
    public static int consultaCliente(String cpf) {
        return CaixaDAO.consultaCliente(cpf);
    }


    public static Produto consultaProduto(int idProduto, boolean isKg) {
        // isKg será utilizado na Controller para validação
        // SELECT * FROM PRODUTOS WHERE ID_PRODUTO = ?; 
        //CaixaDAO.consultaProduto(idProduto) Não foi criado, tem que criar
        Produto p = new Produto(); // Produto que tem ser retornado
        Produto pRetornadoNaDAO = CaixaDAO.consultaProduto(); // NullPointer Exception, provável que dê
        if (isKg) {
            p.setNome(pRetornadoNaDAO.getNome());
            p.setValor(/**/);
            p.setKg(pRetornadoNaDAO.getKg());
        } else {
            p.setNome(pRetornadoNaDAO.getNome());
            p.setValor(/**/);
            p.setQtde(pRetornadoNaDAO.getQtde());
        }
    }
    
}
