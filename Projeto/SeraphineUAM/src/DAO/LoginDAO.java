package DAO;

import java.sql.*;

public class LoginDAO {
    
    private Connection conn;
    private String codigoDeErro;
    
    public String getCodigoDeErro(){
        return codigoDeErro;
    }
    
    public boolean validarLoginAdmin(String nomeDeUsuario, String senha) {
        try {
            conn = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "SELECT * FROM administrador WHERE NOME_DE_USUARIO = ? AND SENHA = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, nomeDeUsuario);
            st.setString(2, senha);
            
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                codigoDeErro = "Usuario ou senha inválidos.";
                return false;
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean validarLoginFuncionario(String nomeDeUsuario, String senha) {
        try {
            conn = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "SELECT * FROM funcionario WHERE NOME_DE_USUARIO = ? AND SENHA = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, nomeDeUsuario);
            st.setString(2, senha);
            
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                codigoDeErro = "Usuario ou senha inválidos.";
                return false;
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
}
