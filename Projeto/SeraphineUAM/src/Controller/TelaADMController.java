package Controller;

import Model.Produto;
import Model.Produto;
import Service.ADMService;
import javax.swing.*;
import java.sql.Struct;

public class    TelaADMController {
    private String codigoDeErro;
    
    public TelaADMController () {
        this.codigoDeErro = "";
    }
    
    public String getNameUsuario(int id) {
        ADMService service = new ADMService();
        return service.getNameUsuario(id);
    }
    
    public Object[] AdicionarItem(Produto produto){
        return new Object[]{ 
            produto.getId(), 
            produto.getDescricao(), 
            produto.getPreco(),
            produto.getQtdEstoque() 
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

        return produto;
    }
    
    public Produto RetornarDadosDaLinhaIndicadaPorIndex(JTable jtable, int i) {
        Produto produto = new Produto();

        produto.setId(
                Integer.parseInt(jtable.getValueAt(i,0).toString())
        );

        produto.setDescricao(
                jtable.getValueAt(i,1).toString()
        );

        produto.setPreco(
                Float.parseFloat(jtable.getValueAt(i,2).toString())
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

