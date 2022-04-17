package br.com.edg.project.service;

import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class Validador {
    
    public static boolean validaString(JTextField field) throws IllegalArgumentException {
         if (field.getText() != null && !field.getText().trim().isEmpty()) {
             return true;
         }
         
         throw new IllegalArgumentException("Favor preencher campo obrigatório: " + field.getName());
    }
    
    public static void validaInteger(JTextField field) {
        try {
            if (field.toString() != null && !field.toString().trim().isEmpty()) {
                Integer.parseInt(field.getText());
            } else {
                throw new IllegalArgumentException(
                    "Favor preencher campo obrigatório: " + field.getName());
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + field.getName() + ", valor esperado: Inteiro.");
        }
                    
    }
    
    public static void validaDouble(JTextField field) {
        try {
            if (field.toString() != null && !field.toString().trim().isEmpty()) {
                Double.parseDouble(field.getText());
            } else {
                throw new IllegalArgumentException(
                    "Favor preencher campo obrigatório: " + field.getName());
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + field.getName() + ", valor esperado: Decimal.");
        }
    }
    
    public static boolean validaMultCampos(List<JTextField> fields) {
        for (JTextField field : fields) {
            if (field.getText() == null || field.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Favor preencher campo obrigatório: " + field.getName());
            }
        }
        
        return true;
    }
    
    public static boolean validaFormatedText(JFormattedTextField campo, int tamanho) {
        if (campo.getText().trim().length() < tamanho || campo.getText() == null) {
            throw new IllegalArgumentException("Favor preencher campo obrigatório: " + campo.getName());
        }
        
        return true;
    }
}
