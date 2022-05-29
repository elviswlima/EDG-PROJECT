/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edg.project.model;

/**
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

    public VendaProduto() {
    }

    public VendaProduto(int idCaixa, int idProduto, int qtde, Double kg, Double valorUni) {
        this.idCaixa = idCaixa;
        this.idProduto = idProduto;
        this.qtde = qtde;
        this.kg = kg;
        this.valorUni = valorUni;
    }

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
