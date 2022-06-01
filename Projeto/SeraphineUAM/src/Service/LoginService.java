package Service;

public class LoginService {
    public boolean ValidarSenha(String Senha) {
        if (Senha == null) return false;
        if (Senha.length() < 8) return false;

        return true;
    }   

    public boolean ValidarNomeDeUsuario(String NomeDeUsuario) {
        if (NomeDeUsuario == null) return false;
        if (NomeDeUsuario.length() < 5) return false;

        return true;
    }
}
