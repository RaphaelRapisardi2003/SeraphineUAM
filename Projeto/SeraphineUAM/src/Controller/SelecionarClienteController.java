package Controller;

import DTO.ResgatarDTO;
import Model.Cliente;
import Model.Produto;

import javax.swing.*;
import java.util.List;

public class SelecionarClienteController {

    private String codigoDeErro;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public SelecionarClienteController () {
        codigoDeErro = "";
    }

    public Object[] AdicionarItem(Cliente cliente){
        return new Object[]{
                cliente.getID(),
                cliente.getNomeDeUsuario(),
                cliente.getIdade(),
                cliente.getCelular(),
                cliente.getCpf()
        };
    }

    public Cliente SelecionarCliente(JTable jtable) {
        return RetornarDadosDaLinhaSelecionada(jtable);
    }

    private Cliente RetornarDadosDaLinhaSelecionada(JTable jtable) {
        Cliente cliente = new Cliente();

        cliente.setID(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),0).toString())
        );

        cliente.setNomeDeUsuario(
                jtable.getValueAt(jtable.getSelectedRow(),1).toString()
        );

        cliente.setIdade(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),2).toString())
        );

        cliente.setCelular(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),3).toString())
        );
        cliente.setCpf(
                Integer.parseInt(jtable.getValueAt(jtable.getSelectedRow(),1).toString())
        );

        return cliente;
    }

    public List<Cliente> AtualizarTabelaDeClientes() {
        ResgatarDTO dto = new ResgatarDTO();
        return dto.listarCliente();
    }
}
