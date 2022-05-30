package Model;

import Model.Produto;

public class Venda {
    int IDCompra;
    float ValorTotal;
    Produto Produtos;

    public Venda() {
        this.IDCompra = 0;
        this.ValorTotal = 0;
        this.Produtos = new Produto();
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

    public Produto getProdutos() {
        return Produtos;
    }

    public void setProdutos(Produto Produtos) {
        this.Produtos = Produtos;
    }
    
    
}
