package Controller;

import Model.Produto;
import Model.Produto;
import javax.swing.*;
import java.sql.Struct;

public class    TelaADMController {
    private String codigoDeErro;
    
    public TelaADMController () {
        this.codigoDeErro = "";
    }
    
    public Object[] AdicionarItem(Produto produto){
        return new Object[]{ 
            produto.getId(), 
            produto.getDescricao(), 
            produto.getQtdEstoque(), 
            produto.getPreco() 
        };
    }
    
    public void RemoverItem(Produto produto) {
        System.out.print(produto);
    }
    
    public void CancelarCompra() {
        
    }
    
    public void FinalizarCompra() {
        
    }
    
    public void EncessarSessão() {
        
    }
    
    public void AtualizarValor (JTextField CampoDeTexto, String Valor) {
        CampoDeTexto.setText(Valor);
    }

    public Produto RetornarDadosDaLinhaSelecionada(JTable jtable) {
        Produto produto = new Produto();

        produto.setId(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),0).toString())
        );

        produto.setDescricao(
                jtable.getValueAt(jtable.getSelectedRow(),1).toString()
        );

        produto.setPreco(
                Float.parseFloat(jtable.getValueAt(jtable.getSelectedRow(),2).toString())
        );

        produto.setVendedor(
                jtable.getValueAt(jtable.getSelectedRow(),3).toString()
        );

        return produto;
    }
    
    public float CalcularValorTotal(JTable jtable) {
        float ValorTotal = 0;

        for (int i = 0; i < jtable.getRowCount(); i++) {
            ValorTotal += Float.parseFloat(
                    jtable.getValueAt(i, 2).toString()
            );
        }

        return ValorTotal;
    }
}

