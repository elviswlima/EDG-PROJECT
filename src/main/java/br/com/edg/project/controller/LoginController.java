package br.com.edg.project.controller;

import br.com.edg.project.dao.LoginDAO;
import br.com.edg.project.model.Login;

/**
 * Classe Login do sistema
 * 
 * @author elvis.wlima
 */
public class LoginController {
    
    /**
     * Método que controla acesso ao sistema
     * @param login - Email do funcionário registrado
     * @param senha - Eenha do funcionário registrado
     * @return true - libera acesso / false - não libera o acesso
     */
    public static boolean acessarLogin(String login, String senha) {
        
        Login usuario = new Login();
        
        usuario.setUsuario(login);
        usuario.setSenha(senha);

        return LoginDAO.login(usuario); 
    }
    
}
