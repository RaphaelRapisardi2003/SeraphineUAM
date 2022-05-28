package Model;

public class Pessoa {
    private String Nome, Endereco; 
    private int Id, Idade;

    public Pessoa() {
        this.Nome = "";
        this.Endereco = "";
        this.Id = 0;
        this.Idade = 0;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
    
}
