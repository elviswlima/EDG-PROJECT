package br.com.edg.project.controller;

import br.com.edg.project.dao.EstoqueDAO;
import br.com.edg.project.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Elvis - PC
 */
public class EstoqueController {
    
    public static ArrayList<Produto> consultarEstoque(int codProduto) {
                
        Produto obj = new Produto();
        obj.setCodProduto(codProduto);

        return EstoqueDAO.consultar(obj);
    }
    
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
    
}
