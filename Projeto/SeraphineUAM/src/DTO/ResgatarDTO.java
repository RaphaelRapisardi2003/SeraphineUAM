/**
 * REGRAS PARA USAR OS MÉTODOS
 * 
 * Lembrar de usar o getID();
 * 
 * Parametro 'atributo' deve ser 'String' e estar em MAIUSCULO e só pode ser os seguintes:
 *     - ID
 *     - NOME
 *     - NOME_DE_USUARIO
 *     - SENHA
 *     - IDADE
 *     - DEPARTAMENTO (administrador)
 *     - FUNCIONARIOS (administrador)
 *     - CATEGORIA (funcionario)
 *     - ENDERECO (cliente)
 *     - TELEFONE (cliente)
 *     - CELULAR (cliente)
 *     - CPF (cliente)
 *     - DESCRICAO (produto)
 *     - QTDESTOQUE (produto)
 *     - PRECO (produto)
 * 
 * Tipos de erros de retorno para identificação:
 *     - int: 000
 *     - String: null
 *     - double: 000
 */

package DTO;

import java.sql.*;
import DAO.DAO;

public class ResgatarDTO {

    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public int getID(String nomeDeUsuario, String senha, String cargo) {
        int fkId = 0;
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return 000;
        }
        try {
            String sql = "SELECT `ID` FROM `" + cargo + "` WHERE NOME_DE_USUARIO='" + nomeDeUsuario + "' AND SENHA='" + senha + "'";
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                fkId = rs.getInt("ID");
            }
            return fkId;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO RESGATAR VALOR 'ID'\nCódigo de erro: " + String.valueOf(erro);
            return 000;
        }
    }
    
    //(1, "NOME", "String")

    public Object getDataAdministrador(int id, String atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                int fkInt = getDataInt(id, atributo, "administrador");
                if (fkInt != 000) {
                    return fkInt;
                } else {
                    return 000;
                }
            }
            case "String" -> {
                String fkString = getDataString(id, atributo, "administrador");
                if (fkString != null) {
                    return fkString;
                } else {
                    return null;
                }
            }
            case "double" -> {
                double fkDouble = getDataDouble(id, atributo, "administrador");
                if (fkDouble != 000) {
                    return fkDouble;
                } else {
                    return 000;
                }
            }
        }
        return null;
    }
    public Object getDataFuncionario(int id, String atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                int fkInt = getDataInt(id, atributo, "funcionario");
                if (fkInt != 000) {
                    return fkInt;
                } else {
                    return 000;
                }
            }
            case "String" -> {
                String fkString = getDataString(id, atributo, "funcionario");
                if (fkString != null) {
                    return fkString;
                } else {
                    return null;
                }
            }
            case "double" -> {
                double fkDouble = getDataDouble(id, atributo, "funcionario");
                if (fkDouble != 000) {
                    return fkDouble;
                } else {
                    return 000;
                }
            }
        }
        return null;
    }
    public Object getDataCliente(int id, String atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                int fkInt = getDataInt(id, atributo, "cliente");
                if (fkInt != 000) {
                    return fkInt;
                } else {
                    return 000;
                }
            }
            case "String" -> {
                String fkString = getDataString(id, atributo, "cliente");
                if (fkString != null) {
                    return fkString;
                } else {
                    return null;
                }
            }
            case "double" -> {
                double fkDouble = getDataDouble(id, atributo, "cliente");
                if (fkDouble != 000) {
                    return fkDouble;
                } else {
                    return 000;
                }
            }
        }
        return null;
    }
    public Object getDataProduto(int id, String atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                int fkInt = getDataInt(id, atributo, "produto");
                if (fkInt != 000) {
                    return fkInt;
                } else {
                    return 000;
                }
            }
            case "String" -> {
                String fkString = getDataString(id, atributo, "produto");
                if (fkString != null) {
                    return fkString;
                } else {
                    return null;
                }
            }
            case "double" -> {
                double fkDouble = getDataDouble(id, atributo, "produto");
                if (fkDouble != 000) {
                    return fkDouble;
                } else {
                    return 000;
                }
            }
        }
        return null;
    }

    private int getDataInt(int id, String atributo, String tipo) {
        int dataInt = 0;
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return 000;
        }
        try {
            String sql = "SELECT `" + atributo + "` FROM `" + tipo + "` WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                dataInt = rs.getInt(atributo);
            }
            return dataInt;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO RESGATAR VALOR '" + atributo + "'\nCódigo de erro: " + String.valueOf(erro);
            return 000;
        }
    }
    private String getDataString(int id, String atributo, String tipo) {
        String dataString = null;
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return null;
        }
        try {
            String sql = "SELECT `" + atributo + "` FROM `" + tipo + "` WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                dataString = rs.getString(atributo);
            }
            return dataString;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO RESGATAR VALOR '" + atributo + "'\nCódigo de erro: " + String.valueOf(erro);
            return null;
        }
    }
    private double getDataDouble(int id, String atributo, String tipo) {
        double dataDouble = 000;
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return 000;
        }
        try {
            String sql = "SELECT `" + atributo + "` FROM `" + tipo + "` WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                dataDouble = rs.getDouble(atributo);
            }
            return dataDouble;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO RESGATAR VALOR '" + atributo + "'\nCódigo de erro: " + String.valueOf(erro);
            return 000;
        }
    }
}
