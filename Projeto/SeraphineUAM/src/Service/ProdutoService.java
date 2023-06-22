package Service;

import DTO.EditarDTO;
import Model.Produto;
import DTO.ResgatarDTO;
import DTO.InserirDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        // create regex
        Pattern patternPreco = Pattern.compile("^\\d{1,9}\\.\\d+$");
        Pattern patternQtdEstoque = Pattern.compile("^\\d{1,6}$");
        Pattern patternDescricao = Pattern.compile("^[\\p{L}\\p{M}\\p{N}\\s]{1,200}$");
        Matcher matcherPreco = patternPreco.matcher(String.valueOf(produto.getPreco()));
        Matcher matcherQtdEstoque = patternQtdEstoque.matcher(String.valueOf(produto.getQtdEstoque()));
        Matcher matcherDescricao = patternDescricao.matcher(produto.getDescricao());


        // validate length
        if (produto.getPreco() <= 0) { codigoDeErro = "Preço menor ou igual a 0"; return false; }
        if (produto.getQtdEstoque() <= 0) { codigoDeErro = "Estoque menor ou igual a 0"; return false; }
        if ((produto.getDescricao()).length() == 0) { codigoDeErro = "Descrição vazia"; return false; }

        // validate String structure
        if (!matcherPreco.matches()) { codigoDeErro = "Valor de preço Inválido"; return false; }
        if (!matcherQtdEstoque.matches()) { codigoDeErro = "Valor de quantidade Inválido"; return false; }
        if (!matcherDescricao.matches()) { codigoDeErro = "Descrição Inválida"; return false; }

        return true;
    }
    public boolean ValidarId(Integer id) {
        String regex = "^\\d{1,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(id));

        return matcher.matches();
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