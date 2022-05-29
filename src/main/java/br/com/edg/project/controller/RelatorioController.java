package br.com.edg.project.controller;

import br.com.edg.project.dao.RelatorioDAO;
import br.com.edg.project.model.Produto;

/**
 * Classe para conexão de informações com a DAO
 * @author elvis.wlima
 */
public class RelatorioController {
    
    /**
     * Método consultaSintetica retorna um ArrayList dos dados simples
     * @param dataInicio - Nome da variável como referência para consulta
     * @param dataFim - Nome da variável como referência para consulta
     * @return - ArrayList das informações consultadas no banco
     */
    public static ArrayList<Produto> consultaSintetica(String dataInicio, String dataFim) {
        
        Produto obj = new Produto();
        obj./*setDataInicio*/(dataInicio);
        obj./*setDataFim*/(dataFim);
        
        return RelatorioDAO.consultaSintetica(obj);
    }
    
    /**
     * Método consultaSintetica retorna um ArrayList dos dados mais detalhada.
     * @param dataInicio - Nome da variável como referência para consulta
     * @param dataFim - Nome da variável como referência para consulta
     * @return - ArrayList das informações consultadas no banco
     */
    public static ArrayList<Produto> consultaAnalitica(String dataInicio, String dataFim) {
        
        Produto obj = new Produto();
        obj./*setDataInicio*/(dataInicio);
        obj./*setDataFim*/(dataFim);
        
        return RelatorioDAO.consultaAnalitica(obj);
    }
    
}
