
package br.com.edg.project.dao;
    

import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guilherme.mlsilva1
 */
public class CaixaDAO {
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static Connection connection;
        
    public static int consultaCliente(String cpf){
        try {
            Class.forName(Driver);
            connection = DriverManager.getConnection(url,"root", "");
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ?");
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return rs.getInt("ID_CLIENTE");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public static Produto consultaProduto(int idProduto) {
        /* 
            * 1) Usar executeQuery e nem ResultSet
            * 2) Não utilizar executeUpdate para fazer 
            * 3) Retornar um novo Produto do package Model
            * 4) Lembrar que o rs.getAlgumaCoisa(); tem que respeitar o tipo de dado no Banco de dados
            * 5) Lembrar que no rs.getAlgumaCoisa(); precisa colocar uma String referenciando o campo cadastrado no BD, exemplo:
            * rs.getStrin("NOME_PRODUTO");
            * produto.setKg(rs.getDouble("KG") == null ? 0 : rs.getDouble("KG"));
         */
    }
        
        
    public static boolean registrar(Caixa caixaFinalizar){
        boolean retorno = false;
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return retorno;
    }
}
