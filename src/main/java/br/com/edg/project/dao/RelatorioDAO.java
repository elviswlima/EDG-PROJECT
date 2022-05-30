package br.com.edg.project.dao;

import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Produto;
import br.com.edg.project.model.Relatorio;
import br.com.edg.project.model.VendaProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para abrir conexão com a base de dados 'edg'
 *
 * @author elvis.wlima
 */
public class RelatorioDAO {

    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String senha = "";
    private static final String url = "jdbc:mysql://localhost:3307/EDG?useTimezone=true&serverTimezone=UTC";

    private static Connection conexao;

    public static List<Relatorio> consultaSintetica(Relatorio relatorio) throws SQLException {
        List<Relatorio> listaRetorno = new ArrayList<>();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String query = "SELECT CLI.NOME CLIENTE, CA.DATA_VENDA VENDA, CA.VALOR_TOTAL VALOR FROM CAIXA CA JOIN CLIENTES CLI ON CA.ID_CLIENTE = CLI.ID_CLIENTE WHERE CA.DATA_VENDA  >= DATE(?) and CA.DATA_VENDA <=  DATE(?)";

        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
            stmt = conexao
                    .prepareStatement(query);
            stmt.setString(1, relatorio.getDataInicio().toString());
            stmt.setString(2, relatorio.getDataFim().toString());

            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Relatorio retorno = new Relatorio();
                retorno.setCliente(rs.getString("CLIENTE"));
                retorno.setValorTotal(rs.getDouble("VALOR"));
                retorno.setDataCompra(rs.getDate("VENDA"));

                listaRetorno.add(retorno);
            }
            
            return listaRetorno;
        } catch (ClassNotFoundException ex) {
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

    public static ArrayList<Produto> consultaAnalitica(Produto venda) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        String query = "SELECT * FROM tabela WHERE SELECT * FROM tabela WHERE Data_Venda BETWEEN ? and ?";

        try {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, senha);
//            stmt.setDate(1, venda./*getDataInicio()*/);
//            stmt.setDate(2, venda./*getDataFim()*/);

            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
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
