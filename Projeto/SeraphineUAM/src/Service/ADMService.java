package Service;

import DTO.InserirDTO;
import DTO.ResgatarDTO;
import Model.Administrador;
import Model.Cliente;
import java.util.ArrayList;
import java.util.List;


public class ADMService {
    private String codigoDeErro;
   
    public ADMService () {
        codigoDeErro = "";
    }
    
    public String getNameUsuario(int id) {
        ResgatarDTO dto = new ResgatarDTO();
        return (String) dto.getDataAdministrador(id, "NOME", "String");
    }
    
    public String getCodigoDeErro() {
        return this.codigoDeErro;
    }
    
    public boolean adicionarAdministrador (Administrador administrador) {
        InserirDTO dto = new InserirDTO();
        if (dto.adicionarAdministrador(administrador.getNome(), administrador.getNomeDeUsuario(), administrador.getSenha(), administrador.getIdade(), administrador.getDepartamento(),administrador.getFuncionarios()) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    public List<Administrador> listarAdminstrador(Administrador administrador) {
        ResgatarDTO dto = new ResgatarDTO();
        try {
            return dto.listarAdministrador();
        } catch (Exception e) {
            codigoDeErro = dto.getCodigoDeErro();
            return null;
        }
    }
    
    public boolean adicionarCliente (Cliente cliente) {
        InserirDTO dto = new InserirDTO();
        if (dto.adicionarCliente(cliente.getNome(), cliente.getNomeDeUsuario(), cliente.getSenha(), cliente.getIdade(), cliente.getEndereco(),cliente.getTelefone(), cliente.getCelular(), cliente.getCpf()) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    public List<Cliente> listarClientes(Cliente cliente) {
        ResgatarDTO dto = new ResgatarDTO();
        try {
            return dto.listarCliente();
        } catch (Exception e) {
            codigoDeErro = dto.getCodigoDeErro();
            return null;
        }
    }
}
