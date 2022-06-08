package Model;

import java.util.List;

public class Cliente extends Pessoa {    
    private String Endereco, nome, nomeDeUsuario, senha;
    private int Telefone, Celular, Cpf; 
    private int Idade, ID;

    public Cliente() {
        this.Endereco = "";
        this.Telefone = 0;
        this.Celular = 0;
        this.Cpf = 0;
        this.Idade = 0;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID(int id) {
        this.ID = id;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }
    
    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
}
