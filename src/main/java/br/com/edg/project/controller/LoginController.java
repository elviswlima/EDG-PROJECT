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
        
        Login user = new Login();
        
        user.setUsuario(login);
        user.setSenha(senha);

        if(!LoginDAO.login(user)) {
            retorno = false;
        }
        
        return retorno;
        
    }
    
}
