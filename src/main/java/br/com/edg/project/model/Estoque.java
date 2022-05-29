/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.edg.project.model;

/**
 * Classe a ser instanciada para receber e retornar valores
 * @author Danilo
 */
public class Estoque {
    /**
     * @Attributes Atributos criados para armazenar valores
     */
    private int codProduto;
    private String nomeProduto;
    private int qtdeProduto;
    private String validade;
    
    /**
     * @Constructor Construtor da classe Estoque (cria o objeto)
     */
    public Estoque() {
    }
    
    /**
     * Métodos Getters e Setters para receber e retornar valores
     * @return valor
     */
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    
}
