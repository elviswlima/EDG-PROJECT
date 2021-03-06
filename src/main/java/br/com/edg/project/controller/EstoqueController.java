package br.com.edg.project.controller;

import br.com.edg.project.dao.EstoqueDAO;
import br.com.edg.project.model.Produto;

/**
 * Classe CRUD do estoque de produtos
 * 
 * @author Elvis - PC
 */
public class EstoqueController {
    
    /**
     * Método para consultar informações no banco de dados e retornar as informações que foram gravadas
     * @param codProduto - Código do produto como referência para consulta
     * @return - Informações do produto gravados no banco de dados
     */
    public static Produto consultarEstoque(int codProduto) {
                
        Produto obj = new Produto();
        obj.setCodProduto(codProduto);

        return EstoqueDAO.consultar(obj);
    }
    
    /**
     * Método excluirProduto para excluir dados
     * @param codProduto - Código do produto como referência para excluir informações
     * @return true para excluído e false para não excluído
     */
    public static boolean excluirProduto(int codProduto) {
        
        boolean retorno = false;

        try {
            Produto prod = new Produto();
        
            prod.setCodProduto(codProduto);
        
            retorno = EstoqueDAO.excluir(prod);
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao excluir dados.");
        }
        
        return retorno;
    }
    
    /**
     * Método alterarProduto para alterar dados
     * @param prod - Objeto a ser recebido para alteração
     * @return true para alterado e false para não alterado
     */
    public static boolean alterarProduto(Produto prod) {
        
        try {
            return EstoqueDAO.alterar(prod);
        } catch (Exception e) {
            throw new IllegalArgumentException("Não foi possível alterar dados.");
        }

    }
    
}
