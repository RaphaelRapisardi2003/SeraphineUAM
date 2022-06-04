package DTO;

import java.sql.*;
import DAO.DAO;

public class DeletarDTO {

    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public boolean apagarProduto(int id) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        String sql = "DELETE FROM produto WHERE ID=?";
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            st.setInt(1, id);

            st.executeUpdate();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO APAGAR PRODUTO\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean apagarFuncionario(int id) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        String sql = "DELETE FROM funcionario WHERE ID=?";
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            st.setInt(1, id);

            st.executeUpdate();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO APAGAR FUNCIONÁRIO\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean apagarAdministrador(int id) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        String sql = "DELETE FROM administrador WHERE ID=?";
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            st.setInt(1, id);

            st.executeUpdate();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO APAGAR ADMINISTRADOR\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean apagarCliente(int id) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        String sql = "DELETE FROM cliente WHERE ID=?";
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            st.setInt(1, id);

            st.executeUpdate();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO APAGAR CLIENTE\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
}
