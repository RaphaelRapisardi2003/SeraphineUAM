package Controller;

import Model.Pessoa;
import Service.LoginService;

public class TelaLoginController {
    public boolean EfetuarLogin (Pessoa pessoa) {
        LoginService validarLogin = new LoginService();

       if (!validarLogin.ValidarNomeDeUsuario(pessoa.getNomeDeUsuario())) return false;
       
       if (!validarLogin.ValidarSenha(pessoa.getSenha())) return false;

        return Login(pessoa);
    }

    private boolean Login (Pessoa pessoa) {
        return true;
    }
}
