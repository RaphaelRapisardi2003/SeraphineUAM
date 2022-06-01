package Model;

public class Produto {
    private int Id;
    private String Descricao;
    private double QtdEstoque;
    private float Preco;
    
    public Produto() {
        this.Id = 0;
        this.Descricao = "";
        this.QtdEstoque = 0;
        this.Preco = 0;
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

    public double getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(double QtdEstoque) {
        this.QtdEstoque = QtdEstoque;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }
    
    
}
