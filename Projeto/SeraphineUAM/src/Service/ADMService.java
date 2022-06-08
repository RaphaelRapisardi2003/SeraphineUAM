package Service;

import DTO.InserirDTO;
import DTO.ResgatarDTO;
import Model.Administrador;
import java.util.ArrayList;
import java.util.List;


public class ADMService {
    private String codigoDeErro;
   
    public ADMService () {
        codigoDeErro = "";
    }
    
    public String getCodigoDeErro() {
        return this.codigoDeErro;
    }
    
    public boolean adicionarAdministrador (Administrador administrador) {
        InserirDTO dto = new InserirDTO();
        if (dto.adicionarAdministrador(administrador.getNome(), administrador.getNomeDeUsuario(), administrador.getSenha(), administrador.getIdade(), administrador.getFuncionarios(),administrador.getDepartamento()) == true) {
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
}
