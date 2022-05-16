package br.com.edg.project.controller;

import br.com.edg.project.dao.LoginDAO;
import br.com.edg.project.model.Login;

/**
 * Classe para conexão de informações com a DAO
 * @author elvis.wlima
 */
public class LoginController {
    
    /**
     * Método que controla acesso ao sistema
     * @param login - nome do usuário registrado
     * @param senha - senha do usuário registrado
     * @return true - libera acesso / false - não libera o acesso
     */
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