package br.com.edg.project.controller;

import br.com.edg.project.dao.EstoqueDAO;
import br.com.edg.project.model.Produto;
import java.util.ArrayList;

/**
 * Classe para conexão de informações com a DAO
 * @author Elvis - PC
 */
public class EstoqueController {
    
    /**
     * Método consultarEstoque para retornar um ArrayList dos dados
     * @param codProduto - nome da variável como referência para consulta
     * @return - ArrayList das informações consultadas no banco
     */
    public static ArrayList<Produto> consultarEstoque(int codProduto) {
                
        Produto obj = new Produto();
        obj.setCodProduto(codProduto);

        return EstoqueDAO.consultar(obj);
    }
    
    /**
     * Método excluirProduto para excluir dados
     * @param codProduto - nome da variável como referência para excluir informações
     * @return true para excluído e false para não excluído
     */
    public static boolean excluirProduto(int codProduto) {
        
        boolean retorno = false;

        try {
            Produto prod = new Produto();
        
            prod.setCodProduto(codProduto);
        
            retorno = EstoqueDAO.excluir(prod);
            
        } catch (Exception e) {
        }
        
        return retorno;
    }
    
    /**
     * Método alterarProduto para alterar dados
     * @param prod - objeto a ser recebido para alteração
     * @return true para alterado e false para não alterado
     */
    public static boolean alterarProduto(Produto prod) {
        try {
            EstoqueDAO.alterar(prod);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
