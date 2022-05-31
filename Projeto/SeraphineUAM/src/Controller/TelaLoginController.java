package Controller;

import Model.Pessoa;
import Service.ValidarLogin;

public class TelaLoginController {
    public boolean EfetuarLogin (Pessoa pessoa) {
        ValidarLogin validarLogin = new ValidarLogin();

        if (!validarLogin.ValidarNomeDeUsuario(pessoa.getNomeDeUsuario())) return false;
        
        if (!validarLogin.ValidarSenha(pessoa.getSenha())) return false;

        return Login(pessoa);
    }

    private boolean Login (Pessoa pessoa) {
        return true;
    }
}
