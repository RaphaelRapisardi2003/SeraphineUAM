package Service;

import DTO.InserirDTO;
import DTO.ResgatarDTO;
import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class AtendenteService {
    private String codigoDeErro;
   
    public AtendenteService () {
        codigoDeErro = "";
    }
    
    public String getCodigoDeErro() {
        return this.codigoDeErro;
    }
    
    public boolean adicionarFuncionario (Funcionario funcionario) {
        InserirDTO dto = new InserirDTO();
        if (dto.adicionarFuncionario(funcionario.getNome(), funcionario.getNomeDeUsuario(), funcionario.getSenha(), funcionario.getIdade(), funcionario.getCategoria()) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    public List<Funcionario> listarFuncionarios(Funcionario funcionario) {
        ResgatarDTO dto = new ResgatarDTO();
        try {
            return dto.listarFuncionarios();
        } catch (Exception e) {
            codigoDeErro = dto.getCodigoDeErro();
            return null;
        }
    }
}
