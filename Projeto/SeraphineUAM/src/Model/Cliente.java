package Model;

import java.util.List;

public class Cliente extends Pessoa {    
    private String Endereco;
    private double Telefone, Celular, Cpf; 
    private int Idade;

    public Cliente() {
        this.Endereco = "";
        this.Telefone = 0;
        this.Celular = 0;
        this.Cpf = 0;
        this.Idade = 0;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public double getTelefone() {
        return Telefone;
    }

    public void setTelefone(double Telefone) {
        this.Telefone = Telefone;
    }

    public double getCelular() {
        return Celular;
    }

    public void setCelular(double Celular) {
        this.Celular = Celular;
    }

    public double getCpf() {
        return Cpf;
    }

    public void setCpf(double Cpf) {
        this.Cpf = Cpf;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
}
