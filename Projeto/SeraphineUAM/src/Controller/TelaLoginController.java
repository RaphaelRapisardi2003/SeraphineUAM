package Controller;

import Model.Pessoa;
import Service.LoginService;
import View.TelaDeLoading;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLoginController {

    private String codigoDeErro;

    public TelaLoginController() {
        this.codigoDeErro = "";
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
        try {
            TelaDeLoading telaDeLoading = new TelaDeLoading("Carregando");
            telaDeLoading.setVisible(true);
            LoginService validarLogin = new LoginService();

            if (!validarLogin.ValidarLoginFuncionario(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
                codigoDeErro = validarLogin.getCodigoDeErro();
                telaDeLoading.pararContagem();
                telaDeLoading.setVisible(false);
                return false;
            }
            telaDeLoading.setVisible(false);
            telaDeLoading.pararContagem();
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    private boolean EfetuarLoginAdministrador(Pessoa pessoa) {
        try {
            TelaDeLoading telaDeLoading = new TelaDeLoading("Carregando");
            telaDeLoading.setVisible(true);
            LoginService validarLogin = new LoginService();

            if (!validarLogin.ValidarLoginAdmin(pessoa.getNomeDeUsuario(), pessoa.getSenha())) {
                codigoDeErro = validarLogin.getCodigoDeErro();
                telaDeLoading.pararContagem();
                telaDeLoading.setVisible(false);
                return false;
            }
            telaDeLoading.setVisible(false);
            telaDeLoading.pararContagem();
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
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
