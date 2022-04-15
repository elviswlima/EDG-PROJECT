package br.com.edg.project.service;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Danilo
 */
public class Validador {
    
    public static boolean validaString(JTextField text) throws IllegalArgumentException {
         if (text.getText() != null && !text.getText().trim().isEmpty()) {
             return true;
         }
         
         throw new IllegalArgumentException("Favor preencher campo obrigatório: " + text.getName());
    }
    
    public static void validaInteger(JTextField text) {
        try {
            if (text.toString() != null && !text.toString().trim().isEmpty()) {
                Integer.parseInt(text.getText());
            }
            
            throw new IllegalArgumentException("Favor preencher campo obrigatório: " + text.getName());
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + text.getName() + ", valor esperado: Inteiro.");
        }
    }
    
    public static void validaDouble(JTextField text) {
        try {
            if (text.toString() != null && !text.toString().trim().isEmpty()) {
                Double.parseDouble(text.getText());
            }
            
            throw new IllegalArgumentException("Favor preencher campo obrigatório: " + text.getName());
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + text.getName() + ", valor esperado: Decimal.");
        }
    }
    
}
