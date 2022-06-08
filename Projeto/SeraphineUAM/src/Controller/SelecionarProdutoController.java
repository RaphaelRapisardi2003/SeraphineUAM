package Controller;

import DTO.ResgatarDTO;
import Model.Produto;
import java.util.List;

import javax.swing.*;

public class SelecionarProdutoController {
    
    private String codigoDeErro;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }
    
    public SelecionarProdutoController () {}
    
    public Object[] AdicionarItem(Produto produto){
        return new Object[]{ 
            produto.getId(), 
            produto.getDescricao(), 
            produto.getPreco(),
            produto.getQtdEstoque()
        };
    }

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

        produto.setQtdEstoque(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),3).toString())
        );

        return produto;
    }
    
    public List<Produto> AtualizarTabelaDeProdutos() {
        ResgatarDTO dto = new ResgatarDTO();
        return dto.listarProdutos();
    }
}