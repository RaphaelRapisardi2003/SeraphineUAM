package Model;

public class Administrador extends Pessoa{
    private String Departamento;
    private int Funcionarios;

    public Administrador() {
        this.Departamento = null;
        this.Funcionarios = 0;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    public int getFuncionarios() {
        return Funcionarios;
    }

    public void setFuncionarios(int Funcionarios) {
        this.Funcionarios = Funcionarios;
    }
}