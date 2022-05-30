package Model;

public class Administrador extends Pessoa{
    private int Departamento;

    public Administrador() {
        this.Departamento = 0;
    }

    public int getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(int Departamento) {
        this.Departamento = Departamento;
    }
}