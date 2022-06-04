package DTO;

import java.sql.*;
import DAO.DAO;

public class InserirDTO {

    private Connection connect;
    private String codigoDeErro = null;
    
    public String getCodigoDeErro(){
        return codigoDeErro;
    }
    
    public boolean adicionarProduto(String descricao, int qtdEstoque, double preco) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "INSERT INTO produto(`DESCRICAO`, `QTDESTOQUE`, `PRECO`) VALUES (?,?,?)";
            PreparedStatement st = connect.prepareStatement(sql);
            
            st.setString(1, descricao);
            st.setInt(2, qtdEstoque);
            st.setDouble(3, preco);
            
            st.execute();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean adicionarFuncionario(String nome, String nomeDeUsuario, String senha, int idade, String categoria){
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "INSERT INTO funcionario(`NOME`, `NOME_DE_USUARIO`, `SENHA`, `IDADE`, `CATEGORIA`) VALUES (?,?,?,?,?)";
            PreparedStatement st = connect.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, nomeDeUsuario);
            st.setString(3, senha);
            st.setInt(4, idade);
            st.setString(5, categoria);
            
            st.execute();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean adicionarAdministrador(String nome, String nomeDeUsuario, String senha, int idade, String departamento, int funcionarios) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "INSERT INTO administrador(`NOME`, `NOME_DE_USUARIO`, `SENHA`, `IDADE`, `DEPARTAMENTO`, `FUNCIONARIOS`) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = connect.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, nomeDeUsuario);
            st.setString(3, senha);
            st.setInt(4, idade);
            st.setString(5, departamento);
            st.setInt(6, funcionarios);
            
            st.execute();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    
    public boolean adicionarCliente(String nome, String nomeDeUsuario, String senha, int idade, String endereco, int telefone, int celular, int cpf){
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "INSERT INTO cliente(`NOME`, `NOME_DE_USUARIO`, `SENHA`, `IDADE`, `ENDERECO`, `TELEFONE`, `CELULAR`, `CPF`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement st = connect.prepareStatement(sql);
            
            st.setString(1, nome);
            st.setString(2, nomeDeUsuario);
            st.setString(3, senha);
            st.setInt(4, idade);
            st.setString(5, endereco);
            st.setInt(6, telefone);
            st.setInt(7, celular);
            st.setInt(8, cpf);
            
            st.execute();
            return true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO DE ACESSO AO BANCO DE DADOS\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }

    public InserirDTO() {}
}
