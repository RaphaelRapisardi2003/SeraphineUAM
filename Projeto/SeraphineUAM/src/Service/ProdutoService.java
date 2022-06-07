package Service;

import DTO.EditarDTO;
import Model.Produto;
import DTO.ResgatarDTO;
import DTO.InserirDTO;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    
    private String codigoDeErro;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }
    
    public Object[] AdicionarItem(Produto produto){
        return new Object[]{ 
            produto.getId(), 
            produto.getDescricao(), 
            produto.getPreco(),
            produto.getQtdEstoque()
        };
    }
    
    public boolean VerificarSeOProdutoExiste(Produto produto) {
        ResgatarDTO dto = new ResgatarDTO();
        int idProduto = dto.getIDItem(produto.getDescricao());
        if (idProduto == 000) {
            return true;
        } else {
            codigoDeErro = "Produto já existe";
            return false;
        }
    }

    public boolean ValidarProduto(Produto produto) {
        if (produto.getPreco() < 0) {
            codigoDeErro = "Preço menor que 0";
            return false;
        }

        if (produto.getQtdEstoque() < 0) {
            codigoDeErro = "Estoque menor que 0";
            return false;
        }

        if (produto.getDescricao().length() < 0) {
            codigoDeErro = "Descrição vazia";
            return false;
        }

        return true;
    }
    
    public boolean CriarProduto(Produto produto) {
        InserirDTO dto = new InserirDTO();
        if (dto.adicionarProduto(produto.getDescricao(), produto.getQtdEstoque(), (double) produto.getPreco())){
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    public boolean EditarProduto(Produto produto) {
        EditarDTO dto = new EditarDTO();
        if (dto.setDataProduto(produto.getId(), "DESCRICAO", produto.getDescricao(), "String") == true){
            if (dto.setDataProduto(produto.getId(), "QTDESTOQUE", produto.getQtdEstoque(), "int") == true){
                if (dto.setDataProduto(produto.getId(), "PRECO", (double) produto.getPreco(), "double") == true){
                    return true;
                }
            }
        }
        codigoDeErro = dto.getCodigoDeErro();
        return false;
    }
    
    public List<Produto> AtualizarTabelaDeProdutos() {
        ResgatarDTO dto = new ResgatarDTO();
        return dto.listarProdutos();
    }
}