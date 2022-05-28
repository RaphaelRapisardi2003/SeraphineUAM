package Service;

public class PessoaService {
    public boolean ValidarNome(String Endereco) {
        if (Endereco.length() > 0)
            return true;

        return false;
    }

    public boolean ValidarEndereco(String Endereco) {
        if (Endereco.length() > 0)
            return true;

        return false;
    }

    public boolean ValidarIdade(int Idade) {
        if (Idade > 0 && Idade < 200)
            return true;

        return false;
    }
}
