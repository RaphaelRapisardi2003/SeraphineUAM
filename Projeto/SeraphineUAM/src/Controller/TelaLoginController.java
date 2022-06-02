package Controller;

import Model.Pessoa;
import Service.LoginService;

public class TelaLoginController {

    private String codigoDeErro;

    public boolean EfetuarLogin(Pessoa pessoa, String cargo) {
        LoginService validarCharLogin = new LoginService();
        LoginService validarLogin = new LoginService();

        if (!validarCharLogin.ValidarNomeDeUsuario(pessoa.getNomeDeUsuario())) {
            codigoDeErro = validarCharLogin.getCodigoDeErroLogin();
            return false;
        }

        if (!validarCharLogin.ValidarSenha(pessoa.getSenha())) {
            codigoDeErro = validarCharLogin.getCodigoDeErroLogin();
            return false;
        }

        if ("Admin".equals(cargo)) {

            if (!validarLogin.ValidarLoginAdmin(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
                codigoDeErro = validarLogin.getCodigoDeErroLogin();
                return false;
            }
        } else if ("Funcionario".equals(cargo)) {
            if (!validarLogin.ValidarLoginFuncionario(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
                codigoDeErro = validarLogin.getCodigoDeErroLogin();
                return false;
            }
        }

        return Login(pessoa);
    }

    public String getCogidoDeErro() {
        return this.codigoDeErro;
    }

    private boolean Login(Pessoa pessoa) {
        return true;
    }
}
