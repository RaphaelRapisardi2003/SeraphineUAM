package Controller;

import Model.Pessoa;
import Service.LoginService;

public class TelaLoginController {

    private String codigoDeErro;

    public TelaLoginController() {
        this.codigoDeErro = "";
    }
    
    public int getLoginID(Pessoa pessoa, String cargo) {
        LoginService service = new LoginService();
        
        return service.getLoginInt(pessoa, cargo);
    }

    public boolean EfetuarLogin(Pessoa pessoa, String cargo) {
        LoginService validarLogin = new LoginService();

        if (!validarLogin.ValidarNomeDeUsuario(pessoa.getNomeDeUsuario())) {
            codigoDeErro = validarLogin.getCodigoDeErro();
            return false;
        }

        if (!validarLogin.ValidarSenha(pessoa.getSenha())) {
            codigoDeErro = validarLogin.getCodigoDeErro();
            return false;
        }

        if ("Administrador".equals(cargo)) {
            if (!EfetuarLoginAdministrador(pessoa)) {
                return false;
            }
        }

        if ("Funcionário".equals(cargo)) {
            if (!EfetuarLoginFuncionario(pessoa)) {
                return false;
            }
        }

        return Login(pessoa);
    }

    private boolean EfetuarLoginFuncionario(Pessoa pessoa) {
        LoginService validarLogin = new LoginService();

        if (!validarLogin.ValidarLoginFuncionario(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
            codigoDeErro = validarLogin.getCodigoDeErro();
            return false;
        }

        return true;
    }

    private boolean EfetuarLoginAdministrador(Pessoa pessoa) {
        LoginService validarLogin = new LoginService();

        if (!validarLogin.ValidarLoginAdmin(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
            codigoDeErro = validarLogin.getCodigoDeErro();
            return false;
        }

        return true;
    }

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    private boolean Login(Pessoa pessoa) {
        return true;
    }
}
