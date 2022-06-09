package DTO;

import java.sql.*;
import DAO.DAO;
import Model.Produto;
import Model.Venda;
import java.util.ArrayList;
import java.util.List;

public class VendaDTO {

    private Connection connect;
    private String codigoDeErro = null;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public boolean registrarVenda(Venda venda, List<Produto> produto) {
        boolean confirmaVenda;
        int lastID = 0;
        ArrayList produtos = new ArrayList(produto);

        DAO dao = new DAO();
        try {
            connect = dao.conectarSemConfirmacao();
        } catch (Exception erro) {
            codigoDeErro = dao.getCodigoDeErroConn();
            return false;
        }
        try {
            String sql = "INSERT INTO venda(`ID_VENDEDOR`, `TOTAL_PRECO`, `DATA_DE_VENDA`, `ID_CLIENTE`, `FORMA_DE_PAGAMENTO`) VALUES (?,?,NOW(),?,?)";
            PreparedStatement st = connect.prepareStatement(sql);

            st.setInt(1, venda.getIDVendedor());
            st.setDouble(2, (double) venda.getValorTotal());
            st.setInt(3, venda.getIDCliente());
            st.setString(4, venda.getFormaDePagamento());

            st.execute();

            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                lastID = rs.getInt("ID_VENDA");
            }
            confirmaVenda = true;
        } catch (SQLException erro) {
            codigoDeErro = "ERRO AO INSERIR VENDA\nCódigo de erro: " + String.valueOf(erro);
            return false;
        }
        if (confirmaVenda == true) {

            try {
                String sql = "INSERT INTO relVenda(`ID_REL_VENDA`, `ID_REL_PRODUTO`) VALUES (?,?)";
                PreparedStatement st = connect.prepareStatement(sql);

                for (int i = 0; i < produtos.size(); i++) {
                    Produto product = (Produto) produtos.get(i);
                    st.setInt(1, lastID);
                    st.setInt(2, product.getId());
                    st.execute();
                }
                return true;
            } catch (SQLException erro) {
                codigoDeErro = "ERRO AO INSERIR VENDA\nCódigo de erro: " + String.valueOf(erro);
                return false;
            }
        } else {
            return false;
        }
    }
}
