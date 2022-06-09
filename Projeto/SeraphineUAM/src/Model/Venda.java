package Model;

import java.util.ArrayList;

import Model.Produto;

public class Venda {
    private int IDCompra;
    private float ValorTotal;
    private ArrayList<Produto> Produtos;
    private int IDVendedor;
    private int IDCliente;
    private String FormaDePagamento;

    public Venda() {
        this.IDCompra = 0;
        this.ValorTotal = 0;
        this.Produtos = new ArrayList<Produto>();
        this.IDVendedor = 0;
        this.IDCliente = 0;
    }

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(Produto Produto) {
        this.Produtos.add(Produto);
    }
    
    public void setIDVendedor(int id) {
        this.IDVendedor = id;
    }
    
    public int getIDVendedor() {
        return IDVendedor;
    }
    
    public void setIDCliente(int id) {
        this.IDCliente = id;
    }
    
    public int getIDCliente() {
        return IDCliente;
    }
    
    public void setFormaDePagamento(String FormaDePagamento) {
        this.FormaDePagamento = FormaDePagamento;
    }
    
    public String getFormaDePagamento() {
        return FormaDePagamento;
    }
    
    
}
