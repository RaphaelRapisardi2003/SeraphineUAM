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
import Model.Funcionario;
import Model.Produto;
import Model.Administrador;
import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ResgatarDTO {

    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public int getIDPessoa(String nomeDeUsuario, String senha, String cargo) {
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
    
    public int getIDItem(String descricao) {
        int fkId = 0;
        DAO dao = new DAO();
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return 000;
        }
        try {
            String sql = "SELECT `ID` FROM produto WHERE DESCRICAO=?";
            PreparedStatement st = connect.prepareStatement(sql);
            
            st.setString(1, descricao);
            
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
    
    public List<Produto> listarProdutos() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        DAO dao = new DAO();
        
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return null;
        }
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Produto p;
            
            while(rs.next()) {
                p = new Produto();
                p.setId(rs.getInt("ID"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setQtdEstoque(rs.getInt("QTDESTOQUE"));
                p.setPreco((float) rs.getDouble("PRECO"));
                
                lista.add(p);
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO LISTAR PRODUTOS\nCódigo do erro: " + String.valueOf(erro);
            return null;
        }
        return lista;
    }
    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        DAO dao = new DAO();
        
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return null;
        }
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Funcionario f;
            
            while(rs.next()) {
                f = new Funcionario();
                f.setID(rs.getInt("ID"));
                f.setNome(rs.getString("NOME"));
                f.setNomeDeUsuario(rs.getString("NOME_DE_USUARIO"));
                f.setSenha(rs.getString("SENHA"));
                f.setIdade(rs.getInt("IDADE"));
                f.setCategoria(rs.getString("CATEGORIA"));
                
                lista.add(f);
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO LISTAR PRODUTOS\nCódigo do erro: " + String.valueOf(erro);
            return null;
        }
        return lista;
    }
     public List<Administrador> listarAdministrador() {
        List<Administrador> lista = new ArrayList<>();
        String sql = "SELECT * FROM administrador";
        DAO dao = new DAO();
        
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return null;
        }
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Administrador d;
            
            while(rs.next()) {
                d = new Administrador();
                d.setID(rs.getInt("ID"));
                d.setNome(rs.getString("NOME"));
                d.setNomeDeUsuario(rs.getString("NOME_DE_USUARIO"));
                d.setSenha(rs.getString("SENHA"));
                d.setIdade(rs.getInt("IDADE"));
                d.setDepartamento(rs.getString("DEPARTAMENTO"));
                d.setFuncionarios(rs.getInt("FUNCIONARIOS"));
                
                lista.add(d);
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO LISTAR PRODUTOS\nCódigo do erro: " + String.valueOf(erro);
            return null;
        }
        return lista;
     }
     public List<Cliente> listarCliente() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        DAO dao = new DAO();
        
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return null;
        }
        try {
            PreparedStatement st = connect.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Cliente c;
            
            while(rs.next()) {
                c = new Cliente();
                c.setID(rs.getInt("ID"));
                c.setNome(rs.getString("NOME"));
                c.setNomeDeUsuario(rs.getString("NOME_DE_USUARIO"));
                c.setSenha(rs.getString("SENHA"));
                c.setIdade(rs.getInt("IDADE"));
                c.setEndereco(rs.getString("ENDERECO"));
                c.setTelefone(rs.getInt("TELEFONE"));
                c.setCelular(rs.getInt("CELULAR"));
                c.setCpf(rs.getInt("CPF"));
                
                lista.add(c);
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO LISTAR PRODUTOS\nCódigo do erro: " + String.valueOf(erro);
            return null;
        }
        return lista;
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
