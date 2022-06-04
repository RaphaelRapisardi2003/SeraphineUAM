package DTO;

import java.sql.*;
import DAO.DAO;

public class EditarDTO {
    
    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }
}
