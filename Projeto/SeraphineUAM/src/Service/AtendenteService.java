package Service;

import DAO.DAO;

public class AtendenteService {
    private DAO Connect;
    private String CodigoDeErro;
   
    public AtendenteService () {
        Connect = new DAO();
        CodigoDeErro = "";
    }
    
    public String getCodigoDeErro() {
        return this.CodigoDeErro;
    }
}
