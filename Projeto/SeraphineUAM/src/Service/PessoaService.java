package Service;

import java.util.regex.*;

public class PessoaService {

    // TODAS AS VALIDAÇÕES NESSA PÁGINA SÃO DA MESMA MANEIRA
    // O QUE MUDA É O CÓDIGO DO REGEX
    // NÃO TENTE ENTENDER O REGEX, PEGUEI TUDO DO CHATGPT
    public boolean ValidarNome(String nome) {
        String regex = "^[\\p{L}\\p{M}\\p{N}\\s]{1,100}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nome);
        
        return matcher.matches();
    }
    
    public boolean ValidarNomeDeUsuario(String nomeDeUsuario) {
        if ("".equals(nomeDeUsuario) || " ".equals(nomeDeUsuario)) return true;
        String regex = "^[a-zA-Z0-9!@#$%^&*()_+=-]{1,20}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nomeDeUsuario);
        
        return matcher.matches();
    }
    
    public boolean ValidarSenha(String senha) {
        if ("".equals(senha) || " ".equals(senha)) return true;
        String regex = "^[a-zA-Z0-9!@#$%^&*()_+=-]{1,20}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        
        return matcher.matches();
    }

    public boolean ValidarEndereco(String Endereco) {
        String regex = "^[\\p{L}\\p{M}\\p{N}\\p{P}\\-\\s]{1,200}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Endereco);
        
        return matcher.matches();
    }

    public boolean ValidarIdade(int idade) {
        String regex = "^(?:1[0-1]?[0-9]|120|1?[0-9])$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(idade));
        
        return matcher.matches();
    }
    
    public boolean ValidarTelefone(int telefone) {
        String regex = "^\\d{7,11}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(telefone));
        
        return matcher.matches();
    }
    
    public boolean ValidarCelular(int celular) {
        String regex = "^\\d{1,11}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(celular));
        
        return matcher.matches();
    }
    
    public boolean ValidarCPF(long cpf) {
        String regex = "^\\d{11}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(cpf));
        
        return matcher.matches();
    }
}
