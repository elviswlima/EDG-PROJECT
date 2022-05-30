/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.dao.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para abrir conexão
 * 
 * @author Danilo
 */
public class ConfigDB {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/EDG?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWD = "";

    /**
     * Método para abrir conexão
     * @param connection - Objeto instanciado para iniciar uma conexão
     * @return conexão com o banco de dados
     * @throws ClassNotFoundException - Detecção de erro
     * @throws SQLException - Detecção de erro na conexão
     */
    public static Connection abrirConexao(Connection connection) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWD);
    }

}
