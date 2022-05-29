/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.utils;

/**
 *
 * @author Danilo
 */
public class SomaTotalUtils {
    
    public static Double somaValorTotal(String valorTotal, Double valorAdd) {        
        
        valorTotal = valorTotal == null || valorTotal.isEmpty() ? "0" : valorTotal;
        
        if (valorAdd != null) {
            return Double.parseDouble(valorTotal) + valorAdd;
        } 
        
        throw new IllegalArgumentException("O valor a ser adicionado, não pode ser nulo");
    }
    
}
