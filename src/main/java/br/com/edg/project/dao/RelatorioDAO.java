package br.com.edg.project.dao;

import br.com.edg.project.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para abrir conexão com a base de dados 'edg'
 * @author elvis.wlima
 */
public class RelatorioDAO {
    
    private static final String base = "edg";
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3306/" + base + "?useTimezone=true&serverTimezone=UTC";

    private static Connection conexao;
    
    /**
     * Método consulta sintética para a entrega de um relatório simples
     * @param venda - objeto a ser recebido como referência para consulta (venda.getDataInicio() e venda.getDataFim())
     * @return - ArrayList (caso exista) dos dados obtidos no banco (Id Cliente, datacompra, valorTotal)
     * @throws ClassNotFoundException - Não achou driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static ArrayList<Produto> consultaSintetica(Produto venda) {
            ArrayList<Produto> listaRetorno = new ArrayList<>();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            String query = "SELECT * FROM CAIXA WHERE Data_Venda BETWEEN ? and ?";
            
        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
//            stmt.setDate(1, new java.sql.Date(/*venda.getDataInicio().getTime()*/));
//            stmt.setDate(2, /*venda.getDataFim()*/);
            
            rs = stmt.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Produto relatorio = new Produto();
//                    relatorio./*setCliente*/(rs.getInt("ID_CLIENTE"));
//                    relatorio./*setData*/(rs.getString("DATA_VENDA"));
//                    relatorio./*setValorTotal*/(rs.getDouble("VALOR_VENDA"));
                    
                    listaRetorno.add(relatorio);
                }
            } else {
                throw new SQLException("Data não existe ou banco de dados vazio.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                throw new IllegalArgumentException("Erro ao fechar conexão");
            }
        }
        return null;
    }
    
    /**
     * Método consulta analítica para a entrega de um relatório mais detalhado
     * @param venda - objeto a ser recebido como referência para consulta (venda.getDataInicio() e venda.getDataFim())
     * @return  - ArrayList (caso existe) dos dados obtidos no banco (Id cliente, datacompra, valorTotal)
     * @throws ClassNotFoundException - Não achou driver
     * @throws SQLException - Erro ao tentar conectar-se à base de dados
     */
    public static ArrayList<Produto> consultaAnalitica(Produto venda) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM tabela WHERE SELECT * FROM tabela WHERE Data_Venda BETWEEN ? and ?";
        
        try{
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
//            stmt.setDate(1, venda./*getDataInicio()*/);
//            stmt.setDate(2, venda./*getDataFim()*/);
            
            rs = stmt.executeQuery();
            
            if(rs != null) {
                while(rs.next()) {
                    Produto relatorio = new Produto();
//                    relatorio./*setCliente*/(rs.getInt("ID_CLIENTE"));
//                    relatorio./*setData*/(rs.getString("DATA_VENDA"));
//                    relatorio./*setValorTotal*/(rs.getDouble("VALOR_VENDA"));
//                    relatorio./*setProduto*/(rs.getInt("PRODUTO_VENDA"));
//                    relatorio./*setQuantidade*/(rs.getInt("QTDE_PRODUTO"));
//                    
//                    listaRetorno.Add(relatorio);
                }
            } else {
                throw new IllegalArgumentException("Data não existe ou banco de dados vazio.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sQLException) {
                throw new IllegalArgumentException("Erro ao fechar conexão.");
            }
        }
        return null;
        
    }
    
}
