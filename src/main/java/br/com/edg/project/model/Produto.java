package br.com.edg.project.model;

/**
 *
 * @author Danilo
 */
public class Produto {
    
    private String nomeProduto;
    private int codProduto;
    private double valorProduto;
    private double qtdeProduto;
    private double qtdePorKg;
    
    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(double qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }
    
    
    
}
