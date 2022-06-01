package Service;

import Model.Produto;

public class ProdutoService {
    public boolean VerificarSeOProdutoExiste(Produto produto) {
        return false;
    }

    public boolean ValidarProduto(Produto produto) {
        if (produto.getPreco() < 0) return false;

        if (produto.getQtdEstoque() < 0) return false;

        if (produto.getDescricao().length() < 0) return false;

        return true;
    }
}