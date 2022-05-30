package br.com.edg.project.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Model Caixa
 * 
 * @author Danilo
 */
public class Caixa {

    private int id;
    private int idCliente;
    private int idFunc;
    private int qtde;
    private Double kg;
    private String formaPagamento;
    private Double valorTotal;
    private Date data_venda;
    private ArrayList<VendaProduto> vendaProduto;

    /**
     * @Constructor Construtor vazio da classe Caixa (cria o objeto)
     */
    public Caixa() {
        // Empty Constructor
    }

    /**
     * Métodos Getters e Setters para receber e retornar valores
     * @return valor
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
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

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public ArrayList<VendaProduto> getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(ArrayList<VendaProduto> vendaProduto) {
        this.vendaProduto = vendaProduto;
    }
    
}
