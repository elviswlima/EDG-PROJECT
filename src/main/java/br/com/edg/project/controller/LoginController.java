package br.com.edg.project.controller;

import br.com.edg.project.dao.LoginDAO;
import br.com.edg.project.model.Login;

/**
 *
 * @author elvis.wlima
 */
public class LoginController {
    
    public static boolean acessarLogin(String login, String senha) {
        
        boolean retorno = false;
        
        Login usuario = new Login();
        
        usuario.setUsuario(login);
        usuario.setSenha(senha);

        if(!LoginDAO.login(usuario)) {
            retorno = false;
        }
        
        return retorno;
        
    }
    
}
