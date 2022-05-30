package br.com.edg.project.model;

/**
 * Classe a ser instanciada para receber e retornar valores
 * @author elvis.wlima
 */
public class Login {
    
    /**
     * @Attributes Atributos criados para armazenar valores
     */
    private String usuario;
    private String senha;
    
    /**
     * @Constructor Construtor vazio da classe Login (cria o objeto)
     */
    public Login() {
        // Empty Constructor
    }
    
    /**
     * Métodos Getters e Setters para receber e retornar valores
     * @return valor
     */
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
