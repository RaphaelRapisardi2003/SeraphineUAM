package Controller;

import Model.Produto;

public class TelaAtendenteController {
    public Object[] AdicionarItem(Produto produto){
        return new Object[]{ produto.getId(), produto.getDescricao(), produto.getQtdEstoque(), produto.getPreco() };
    }
    
    public void RemoverItem(Produto produto) {
        
    }
}