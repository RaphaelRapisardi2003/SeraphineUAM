package DAO;

import java.sql.*;

public class DAO {
    
    private final String URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10498653";
    private final String SENHA = "pSG6rMrZlY";
    private final String USUARIO = "sql10498653";
    
    private Connection connect;
    
    private String codigoDeErroConn;
    
    public boolean conectarComConfirmacao() {
        try {
            connect = DriverManager.getConnection(URL, USUARIO, SENHA);
            return true;
        } catch (SQLException erro) {
            codigoDeErroConn = "ERRO DE CONEXÃO\nCódigo do erro: " + String.valueOf(erro);
        }
        return false;
    }
    public Connection conectarSemConfirmacao() {
        try {
            connect = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException erro) {
            codigoDeErroConn = "ERRO DE CONEXÃO\nCódigo do erro: " + String.valueOf(erro);
        }
        return connect;
    }
    
    public String getCodigoDeErroConn(){
        return this.codigoDeErroConn;
    }
}
