package Controller;

import DTO.DeletarDTO;
import DTO.ResgatarDTO;
import DTO.VendaDTO;
import Model.Administrador;
import Model.Cliente;
import javax.swing.*;
import Model.Funcionario;
import Model.Produto;
import Model.Venda;
import Service.ADMService;
import Service.AtendenteService;
import Service.PessoaService;
import java.util.ArrayList;
import java.util.List;

public class TelaViewController {

    private String codigoDeErro;

    public String getCodigoDeErro() {
        return codigoDeErro;
    }

    public Object[] getDadosToTabela(Funcionario funcionario) {
        return new Object[]{
            funcionario.getID(),
            funcionario.getNome(),
            funcionario.getNomeDeUsuario(),
            funcionario.getSenha(),
            funcionario.getIdade(),
            funcionario.getCategoria()
        };
    }

    public boolean validarDados(Funcionario funcionario) {
        PessoaService pessoaService = new PessoaService();

        if (pessoaService.ValidarNome(funcionario.getNome()) == true) {
            if (pessoaService.ValidarIdade(funcionario.getIdade()) == true) {
                return true;
            }
        }
        codigoDeErro = "Valores inválidos";
        return false;
    }

    public boolean adicionarFuncionario(Funcionario funcionario) {
        AtendenteService servico = new AtendenteService();
        if (servico.adicionarFuncionario(funcionario) == true) {
            return true;
        } else {
            codigoDeErro = servico.getCodigoDeErro();
            return false;
        }
    }

    public List<Funcionario> listarFuncionarios() {
        return new ResgatarDTO().listarFuncionarios();
    }

    public boolean apagarFuncionario(int ID) {
        DeletarDTO dto = new DeletarDTO();
        if (dto.apagarFuncionario(ID) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }

    //ADM
    public List<Administrador> listarAdministrador() {
        return new ResgatarDTO().listarAdministrador();
    }

    public Object[] getDadosToTabelaADM(Administrador administrador) {
        return new Object[]{
            administrador.getID(),
            administrador.getNome(),
            administrador.getNomeDeUsuario(),
            administrador.getSenha(),
            administrador.getIdade(),
            administrador.getDepartamento(),
            administrador.getFuncionarios()
        };
    }
    
    public Object[] getDadosToTabelaCliente(Cliente cliente) {
        return new Object[]{
            cliente.getID(),
            cliente.getNome(),
            cliente.getNomeDeUsuario(),
            cliente.getSenha(),
            cliente.getIdade(),
            cliente.getEndereco(),
            cliente.getTelefone(),
            cliente.getCelular(),
            cliente.getCpf()
        };
    }

    public boolean validarDados(Administrador administrador) {
        PessoaService pessoaService = new PessoaService();

        if (pessoaService.ValidarNome(administrador.getNome()) == true) {
            if (pessoaService.ValidarIdade(administrador.getIdade()) == true) {
                return true;
            }
        }
        codigoDeErro = "Valores inválidos";
        return false;
    }

    public boolean adicionarAdministrador(Administrador administrador) {
        ADMService servico = new ADMService();
        if (servico.adicionarAdministrador(administrador) == true) {
            return true;
        } else {
            codigoDeErro = servico.getCodigoDeErro();
            return false;
        }
    }

    public boolean apagarAdministrador(int ID) {
        DeletarDTO dto = new DeletarDTO();
        if (dto.apagarAdministrador(ID) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    //Cliente
    
    public List<Cliente> listarClientes() {
        return new ResgatarDTO().listarCliente();
    }
    
    public boolean validarDadosCliente(Cliente cliente) {
        PessoaService pessoaService = new PessoaService();
        
        if (pessoaService.ValidarNome(cliente.getNome()) != true) { codigoDeErro = "Nome Inválido"; return false; }
        if (pessoaService.ValidarNomeDeUsuario(cliente.getNomeDeUsuario()) != true) { codigoDeErro = "Nome de Usuário Inválido"; return false; }
        if (pessoaService.ValidarSenha(cliente.getSenha()) != true) { codigoDeErro = "Senha Inválido"; return false; }
        if (pessoaService.ValidarIdade(cliente.getIdade()) != true) { codigoDeErro = "Idade Inválida"; return false; }
        if (pessoaService.ValidarEndereco(cliente.getEndereco()) != true) { codigoDeErro = "Endereço Inválido"; return false; }
        if (pessoaService.ValidarTelefone(cliente.getTelefone()) != true) { codigoDeErro = "Telefone Inválido"; return false; }
        if (pessoaService.ValidarCelular(cliente.getCelular()) != true) { codigoDeErro = "Celular Inválido"; return false; }
        if (pessoaService.ValidarCPF(cliente.getCpf()) != true) { codigoDeErro = "CPF Inválido"; return false; }
        
        return true;
    }
    
    public boolean adicionarCliente(Cliente cliente) {
        ADMService servico = new ADMService();
        if (servico.adicionarCliente(cliente) == true) {
            return true;
        } else {
            codigoDeErro = servico.getCodigoDeErro();
            return false;
        }
    }
    
    public boolean apagarCliente(int ID) {
        DeletarDTO dto = new DeletarDTO();
        if (dto.apagarCliente(ID) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
    
    public boolean finalizarVenda(Venda venda, List<Produto> produtos) {
        VendaDTO dto = new VendaDTO();
        if (dto.registrarVenda(venda, produtos) == true) {
            return true;
        } else {
            codigoDeErro = dto.getCodigoDeErro();
            return false;
        }
    }
}
