package br.com.edg.project.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Danilo
 */
public class Caixa {

    private int codProduto;
    private int idCliente;
    private int qtde;
    private Double kg;
    private String formaPagamento;
    private Double valorTotal;
    private Date data_venda;
    private ArrayList<VendaProduto> vendaProduto;

    public Caixa() {
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

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<VendaProduto> getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(ArrayList<VendaProduto> vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
