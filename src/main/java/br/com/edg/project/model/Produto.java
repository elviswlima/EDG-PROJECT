package br.com.edg.project.model;

/**
 *
 * @author Danilo
 */
public class Produto {
    
    private String nomeProduto;
    private int codProduto;
    private double valorProduto;
    private int qtdeProduto;
    private double qtdePorKg;
    
    public Produto() {
    }
    
    public Produto(String nomeProduto, double valor, int qtdeProduto, double qtdePorKg) {
        this.nomeProduto = nomeProduto;
        this.valorProduto =  valor;
        this.qtdeProduto = qtdeProduto;
        this.qtdePorKg = qtdePorKg;
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

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public double getQtdePorKg() {
        return qtdePorKg;
    }

    public void setQtdePorKg(double qtdePorKg) {
        this.qtdePorKg = qtdePorKg;
    }
}
