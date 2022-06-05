package DTO;

import java.sql.*;
import DAO.DAO;

public class EditarDTO {
    
    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }
    
    //(1, "NOME", "Pedro Henrique", "String")
    
    public boolean setDataAdministrador(int id, String atributoSQL, Object atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                if (setDataInt(id, atributoSQL, (int) atributo, "administrador") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "String" -> {
                if (setDataString(id, atributoSQL, (String) atributo, "administrador") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "double" -> {
                if (setDataDouble(id, atributoSQL, (double) atributo, "administrador") == true) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public boolean setDataFuncionario(int id, String atributoSQL, Object atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                if (setDataInt(id, atributoSQL, (int) atributo, "funcionario") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "String" -> {
                if (setDataString(id, atributoSQL, (String) atributo, "funcionario") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "double" -> {
                if (setDataDouble(id, atributoSQL, (double) atributo, "funcionario") == true) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public boolean setDataCliente(int id, String atributoSQL, Object atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                if (setDataInt(id, atributoSQL, (int) atributo, "cliente") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "String" -> {
                if (setDataString(id, atributoSQL, (String) atributo, "cliente") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "double" -> {
                if (setDataDouble(id, atributoSQL, (double) atributo, "cliente") == true) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public boolean setDataProduto(int id, String atributoSQL, Object atributo, String tipo) {
        switch (tipo) {
            case "int" -> {
                if (setDataInt(id, atributoSQL, (int) atributo, "produto") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "String" -> {
                if (setDataString(id, atributoSQL, (String) atributo, "produto") == true) {
                    return true;
                } else {
                    return false;
                }
            }
            case "double" -> {
                if (setDataDouble(id, atributoSQL, (double) atributo, "produto") == true) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private boolean setDataInt(int id, String atributoSQL, int atributo, String tipo) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "UPDATE " + tipo + " SET " + atributoSQL + "=? WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setInt(1, atributo);
            st.setInt(2, id);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO EDITAR VALOR '" + atributoSQL + "'\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    private boolean setDataString(int id, String atributoSQL, String atributo, String tipo) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "UPDATE " + tipo + " SET " + atributoSQL + "=? WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setString(1, atributo);
            st.setInt(2, id);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO EDITAR VALOR '" + atributoSQL + "'\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
    private boolean setDataDouble(int id, String atributoSQL, double atributo, String tipo) {
        try {
            connect = new DAO().conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = new DAO().getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "UPDATE " + tipo + " SET " + atributoSQL + "=? WHERE ID=?";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setDouble(1, atributo);
            st.setInt(2, id);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO EDITAR VALOR '" + atributoSQL + "'\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
    }
}
