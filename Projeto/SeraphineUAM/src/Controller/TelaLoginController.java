package Controller;

import Model.Pessoa;
import Service.ValidarLogin;

public class TelaLoginController {
    public boolean EfetuarLogin (Pessoa pessoa) {
        ValidarLogin validarLogin = new ValidarLogin();

        if (validarLogin.ValidarNomeDeUsuario(pessoa.getNomeDeUsuario())) return true;
        
        if (validarLogin.ValidarSenha(pessoa.getSenha())) return true;

        return Login(pessoa);
    }

    private boolean Login (Pessoa pessoa) {
        return false;
    }
}
