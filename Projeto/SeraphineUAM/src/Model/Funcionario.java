package Model;

public class Funcionario extends Pessoa{
    String Categoria;

    public Funcionario() {
        this.Categoria = "";
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
}
