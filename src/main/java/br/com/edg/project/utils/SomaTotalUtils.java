/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.utils;

/**
 * Classe para Instanciar o método de soma
 * 
 * @author Danilo
 */
public class SomaTotalUtils {
    
    /**
     * Método para somar valor dos produtos no caixa
     * @param valorTotal - É o valor do produto atual
     * @param valorAdd - É o valor do produto quer for adicionado após o atual
     * @return Soma total dos valores para finalizar venda
     */
    public static Double somaValorTotal(String valorTotal, Double valorAdd) {        
        
        valorTotal = valorTotal == null || valorTotal.isEmpty() ? "0" : valorTotal;
        
        if (valorAdd != null) {
            return Double.parseDouble(valorTotal) + valorAdd;
        } 
        
        throw new IllegalArgumentException("O valor a ser adicionado, não pode ser nulo");
    }
    
}
