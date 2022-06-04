package Controller;

import Model.Produto;

public class TelaAtendenteController {
    
    private String codigoDeErro;
    
    public TelaAtendenteController () {
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
    
    public void AtualizarValorTotal () {
        
    }
    
    public void AtualizarPreco () {
        
    }
}