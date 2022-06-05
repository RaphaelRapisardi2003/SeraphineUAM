/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Produto;

/**
 *
 * @author rapha
 */
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
    
    public void AtualizarValorTotal () {
        
    }
    
    public void AtualizarPreco () {
        
    }
}

