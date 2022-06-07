package Controller;

import Model.Produto;

import javax.swing.*;

public class SelecionarProdutoController {
    public SelecionarProdutoController () {}

    public Produto SelecionarProduto(JTable jtable) {
        return RetornarDadosDaLinhaSelecionada(jtable);
    }

    private Produto RetornarDadosDaLinhaSelecionada(JTable jtable) {
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
}
