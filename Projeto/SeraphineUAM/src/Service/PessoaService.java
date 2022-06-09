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
    
    public boolean ValidarTelefone(int telefone) {
        if (telefone > 0 && telefone < 9999999999L)
            return true;
        
        return false;
    }
    
    public boolean ValidarCelular(int celular) {
        if (celular > 0 && celular < 99999999999L)
            return true;
        
        return false;
    }
    
    public boolean ValidarCPF(long cpf) {
        if (cpf > 0 && cpf < 99999999999L)
            return true;
        
        return false;
    }
}
