package Model;

import java.util.Date;

public class Relatorio {
    private int IdVendedor;
    private double PrecoTotal;
    private Date DataDaVenda;
    private int IdCliente;
    private String FormaDePagamento;
    
    public Relatorio () {
        this.IdVendedor = 0;
        this.PrecoTotal = 0;
        this.DataDaVenda = new Date();
        this.IdCliente = 0;
        this.FormaDePagamento = "";

    }

    public int getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(int IdVendedor) {
        this.IdVendedor = IdVendedor;
    }

    public double getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(double PrecoTotal) {
        this.PrecoTotal = PrecoTotal;
    }

    public Date getDataDaVenda() {
        return DataDaVenda;
    }

    public void setDataDaVenda(Date DataDaVenda) {
        this.DataDaVenda = DataDaVenda;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getFormaDePagamento() {
        return FormaDePagamento;
    }

    public void setFormaDePagamento(String FormaDePagamento) {
        this.FormaDePagamento = FormaDePagamento;
    }
    
    
}
