/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edg.project.model;

/**
 * Model VendaProduto
 * 
 * @author guilherme.mlsilva1
 */
public class VendaProduto {

    private int idVendaProduto;
    private int idCaixa;
    private int idProduto;
    private int qtde;
    private Double kg;
    private Double valorUni;

    /**
     * @Constructor Construtor vazio da classe VendaProduto (cria o objeto)
     */
    public VendaProduto() {
        // Empty Constructor
    }
    
    /**
     * Construtor com parâmetros
     * @param idCaixa - Id do caixa
     * @param idProduto - id do produto que sera vendido
     * @param qtde - Quantidade que será vendido, caso não seja por kilo
     * @param kg - Peso do produto que será vendido, caso não seja por quantidade
     * @param valorUni - Valor da venda
     */
    public VendaProduto(int idCaixa, int idProduto, int qtde, Double kg, Double valorUni) {
        this.idCaixa = idCaixa;
        this.idProduto = idProduto;
        this.qtde = qtde;
        this.kg = kg;
        this.valorUni = valorUni;
    }

    /**
     * Métodos Getters e Setters para receber e retornar valores
     * @return valor
     */
    public int getIdVendaProduto() {
        return idVendaProduto;
    }

    public void setIdVendaProduto(int idVendaProduto) {
        this.idVendaProduto = idVendaProduto;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }

    public Double getValorUni() {
        return valorUni;
    }

    public void setValorUni(Double valorUni) {
        this.valorUni = valorUni;
    }

}
