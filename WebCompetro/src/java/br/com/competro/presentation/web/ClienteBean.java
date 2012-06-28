/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Cliente;
import br.com.competro.domainModel.ClienteRepository;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Ary
 */
@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean implements Serializable {

    @EJB
    ClienteRepository repo;
    
    
    private String nome;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

 
    public ClienteRepository getRepo() {
        return repo;
    }

    public void setRepo(ClienteRepository repo) {
        this.repo = repo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void salvar(){
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setNumero(numero);
        cli.setRua(rua);
        cli.setBairro(bairro);
        cli.setCidade(cidade);
        cli.setCep(cep);
        repo.salvar(cli);
    }

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }
}
