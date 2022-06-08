package Controller;

import DTO.DeletarDTO;
import DTO.ResgatarDTO;
import Model.Administrador;
import javax.swing.*;
import Model.Funcionario;
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
    
    public Object[] getDadosToTabela(Funcionario funcionario){
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
        
        if (pessoaService.ValidarNome(funcionario.getNome()) == true){
            if (pessoaService.ValidarIdade(funcionario.getIdade()) == true){
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
    public Object[] getDadosToTabelaADM(Administrador administrador){
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

    public boolean validarDados(Administrador administrador) {
        PessoaService pessoaService = new PessoaService();
        
        if (pessoaService.ValidarNome(administrador.getNome()) == true){
            if (pessoaService.ValidarIdade(administrador.getIdade()) == true){
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
    }

