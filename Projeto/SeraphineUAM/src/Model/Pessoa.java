package Model;

public class Pessoa {
    private String Nome, Cargo, NomeDeUsuario, Senha;
    private int ID, Idade;

    public Pessoa() {
        this.Nome = "";
        this.Cargo = "";
        this.NomeDeUsuario = "";
        this.Senha = "";
        this.ID = 0;
        this.Idade = 0;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getNomeDeUsuario() {
        return NomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        NomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}
