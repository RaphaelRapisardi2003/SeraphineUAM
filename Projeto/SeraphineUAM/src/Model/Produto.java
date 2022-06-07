package Model;

public class Produto {
    private int Id;
    private String Descricao;
    private int QtdEstoque;
    private float Preco;
    private String vendedor;
    
    public Produto() {
        this.Id = 0;
        this.Descricao = "";
        this.QtdEstoque = 0;
        this.Preco = 0;
        this.vendedor = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(int QtdEstoque) {
        this.QtdEstoque = QtdEstoque;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
}
