package Model;

public class Administrador extends Pessoa{
    private int Departamento;
    private int Funcionarios;

    public Administrador() {
        this.Departamento = 0;
        this.Funcionarios = 0;
    }

    public int getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(int Departamento) {
        this.Departamento = Departamento;
    }
    public int getFuncionarios() {
        return Funcionarios;
    }

    public void setFuncionarios(int Funcionarios) {
        this.Funcionarios = Funcionarios;
    }
}