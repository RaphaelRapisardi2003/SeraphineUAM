/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author wvxbs
 */
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
