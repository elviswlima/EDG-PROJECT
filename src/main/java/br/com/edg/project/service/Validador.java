package br.com.edg.project.service;


import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *Classe de valida��o de obrigatorieadade e tipos de entrada de dados
 * @author Danilo
 */
public class Validador {
    /**
     * Método para validação de String
     * @param field - Dados da JTextField que será validado
     * @return True para String e False caso esteja nulo, vazio, ou com "spaces"
     * @throws IllegalArgumentException - Detecção de erros
     */
    public static boolean validaString(JTextField field) throws IllegalArgumentException {
         if (field.getText() != null && !field.getText().trim().isEmpty()) {
             return true;
         }
         
         throw new IllegalArgumentException("Favor preencher campo obrigat�rio: " + field.getName());
    }
    
    /**
     * Método para validação de Integer
     * @param field  Dados da JTextField que será validado e transformado para inteiros
     * @throws NumberFormatException - Detecta se os dados não forem números Inteiros
     */
    public static void validaInteger(JTextField field) {
        try {
            if (field.toString() != null && !field.toString().trim().isEmpty()) {
                Integer.parseInt(field.getText());
            } else {
                throw new IllegalArgumentException(
                    "Favor preencher campo obrigat�rio: " + field.getName());
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + field.getName() + ", valor esperado: Inteiro.");
        }
                    
    }
    
    /**
     * Método para validação de Double
     * @param field Dados da JTextField que será validado e transformado para decimais
     * @throws NumberFormatException - Detecta se os dados não forem números Decimais
     */
    public static void validaDouble(JTextField field) {
        try {
            if (field.toString() != null && !field.toString().trim().isEmpty()) {
                Double.parseDouble(field.getText());
            } else {
                throw new IllegalArgumentException(
                    "Favor preencher campo obrigat�rio: " + field.getName());
            }
        } catch (NumberFormatException ex) {
            throw new NumberFormatException(
                    "Erro ao converter valor do campo " + field.getName() + ", valor esperado: Decimal.");
        }
    }
    
    public static boolean validaMultCampos(List<JTextField> fields) {
        for (JTextField field : fields) {
            if (field.getText() == null || field.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Favor preencher campo obrigat�rio: " + field.getName());
            }
        }
        
        return true;
    }
    
    public static boolean validaFormatedText(JFormattedTextField campo, int tamanho) {
        if (campo.getText().trim().length() < tamanho || campo.getText() == null) {
            throw new IllegalArgumentException("Favor preencher campo obrigat�rio: " + campo.getName());
        }  
        
        return true;
    }
    
    /**
     * Método para validação de Date
     * @param jDateValProduto - Dados da JDate que será validado
     * @return True para modelo Date correto e False para não correto
     */
    public static boolean validaDate(JDateChooser jDateValProduto){
        LocalDate dataAtual = LocalDate.now();
        LocalDate validade = jDateValProduto
                .getDate()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
                
        if(dataAtual.isAfter(validade)){
            throw new IllegalArgumentException("A validade tem que ser maior a data atual!!");
        }
        
        return true;
    }
  
    public static boolean validaDateRelatorio(JDateChooser jDateValProduto){
       LocalDate dataAtual = LocalDate.now().plusDays(1);
        LocalDate dataRela = jDateValProduto
                .getDate()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
                
        if(!dataAtual.isAfter(dataRela)) {
            throw new IllegalArgumentException("A data fim tem que ser maior a data atual!!");
        }
        
        return true;
    }
}
