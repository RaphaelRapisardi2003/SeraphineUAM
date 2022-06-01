package Controller;

import Model.Produto;

public class TelaAtendenteController {
    public Object[] AdicionarItem(Produto produto, double QtdCompra){
        int Id = produto.getId();
        double QtdEstoque = produto.getQtdEstoque();
        float Preco = produto.getPreco();
        float ValorTotal = CalcularValorTotalDoItem(QtdCompra, Preco);

        return new Object[]{ produto.getId(), produto.getQtdEstoque(), produto.getPreco() };
    }
    
    public void RemoverItem(Produto produto, double Qtd) {}

    private float CalcularValorTotalDoItem(double QtdCompra, float Preco) {
        return (Preco * (float) QtdCompra);
    }
}