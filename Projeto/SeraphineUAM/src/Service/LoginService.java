package Service;

import DAO.DAO;
import DAO.LoginDAO;
import DTO.ResgatarDTO;
import Model.Pessoa;

public class LoginService {

    private DAO connect;
    private LoginDAO loginDAO;
    private String CodigoDeErro;

    public LoginService () {
        connect = new DAO();
        loginDAO = new LoginDAO();
        CodigoDeErro = "";
    }
    
    public int getLoginInt(Pessoa pessoa, String cargo) {
        ResgatarDTO dto = new ResgatarDTO();
        return dto.getIDPessoa(pessoa.getNomeDeUsuario(), pessoa.getSenha(), cargo);
    }
    
    public String getCodigoDeErro() {
        return this.CodigoDeErro;
    }

    public boolean ValidarSenha(String Senha) {
        if (Senha == null) {
            return false;
        }
        if (Senha.length() < 8) {
            return false;
        }

        return true;
    }

    public boolean ValidarNomeDeUsuario(String NomeDeUsuario) {
        if (NomeDeUsuario == null) {
            return false;
        }
        if (NomeDeUsuario.length() < 5) {
            return false;
        }

        return true;
    }

    public boolean ValidarLoginAdmin(String NomeDeUsuario, String Senha) {
        if (connect.conectarComConfirmacao() == true) {
            boolean login = loginDAO.validarLoginAdmin(NomeDeUsuario, Senha);
            if (login == true) {
                return true;
            } else {
                CodigoDeErro = loginDAO.getCodigoDeErro();
                return false;
            }
        } else {
            CodigoDeErro = connect.getCodigoDeErroConn();
            return false;

        }
    }
    public boolean ValidarLoginFuncionario(String NomeDeUsuario, String Senha) {
        if (connect.conectarComConfirmacao() == true) {
            boolean login = loginDAO.validarLoginFuncionario(NomeDeUsuario, Senha);
            if (login == true) {
                return true;
            } else {
                CodigoDeErro = loginDAO.getCodigoDeErro();
                return false;
            }
        } else {
            CodigoDeErro = connect.getCodigoDeErroConn();
            return false;

        }
    }
}
