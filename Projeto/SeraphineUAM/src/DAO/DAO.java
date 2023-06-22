package DAO;

import java.sql.*;

public class DAO {
    
    private final String URL = "jdbc:mysql://cloudbarueri.duckdns.org:3306/seraphinesat";
    private final String SENHA = "root";
    private final String USUARIO = "root";
    
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
