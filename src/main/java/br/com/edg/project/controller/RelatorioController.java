package br.com.edg.project.controller;

import br.com.edg.project.dao.RelatorioDAO;
import br.com.edg.project.model.Produto;
import br.com.edg.project.model.Relatorio;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para conexão de informações com a DAO
 *
 * @author elvis.wlima
 */
public class RelatorioController {

    /**
     * Método consultaSintetica retorna um ArrayList dos dados simples
     *
     * @param dataInicio - Período definido para o incio da busca do relatorio
     * @param dataFim - Período definido para o final da busca do relatorio
     * @return - ArrayList das informações consultadas no banco
     * @throws java.sql.SQLException
     */
    public static List<Relatorio> consultaSintetica(Date dataInicio, Date dataFim) throws SQLException {
        LocalDate dateFinal = dataFim.toLocalDate();
        dateFinal.plusDays(1);

        if (!dateFinal.isAfter(dataInicio.toLocalDate())) {
            throw new IllegalArgumentException("A data de inicio tem que ser maior que a data fim!!");
        }

        Relatorio obj = new Relatorio();
        obj.setDataInicio(dataInicio);
        obj.setDataFim(dataFim);

        return RelatorioDAO.consultaSintetica(obj);
    }

    /**
     * Método consultaSintetica retorna um ArrayList dos dados mais detalhada.
     *
     * @param dataInicio - Nome da variável como referência para consulta
     * @param dataFim - Nome da variável como referência para consulta
     * @return - ArrayList das informações consultadas no banco
     */
    public static ArrayList<Relatorio> consultaAnalitica(Date dataInicio, Date dataFim) throws SQLException {
        LocalDate dateFinal = dataFim.toLocalDate();
        dateFinal.plusDays(1);

        if (!dateFinal.isAfter(dataInicio.toLocalDate())) {
            throw new IllegalArgumentException("A data de inicio tem que ser maior que a data fim!!");
        }

        Relatorio obj = new Relatorio();
        obj.setDataInicio(dataInicio);
        obj.setDataFim(dataFim);

        return RelatorioDAO.consultaAnalitica(obj);
    }

}
