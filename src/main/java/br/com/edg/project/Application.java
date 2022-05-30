/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project;

import br.com.edg.project.views.FrmLogin;
/**
 * Classe para iniciar o sistema
 * 
 * @author Elvis
 */
public class Application {

    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
