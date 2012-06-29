/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Fornecedor;
import br.com.competro.domainModel.FornecedorRepository;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Hugo Santos
 */
@Named(value = "fornecedorBean")
@SessionScoped
public class fornecedorBean implements Serializable {

    @EJB
    FornecedorRepository repo;
    
    private Long id;
    private String nome;
    private String cnpj;
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public FornecedorRepository getRepo() {
        return repo;
    }

    public void setRepo(FornecedorRepository repo) {
        this.repo = repo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void salvar(){
        Fornecedor forn = new Fornecedor();
        
        forn.setNome(nome);
        forn.setCnpj(cnpj);
        forn.setNumero(numero);
        forn.setRua(rua);
        forn.setBairro(bairro);
        forn.setCidade(cidade);
        forn.setCep(cep);
        repo.salvar(forn);
    }
     public void listar(){
        Fornecedor f = new Fornecedor();
        id = f.getId();
        nome = f.getNome();
        cnpj = f.getCnpj();
        rua = f.getRua();
        numero = f.getNumero();
        bairro = f.getBairro();
        cidade = f.getCidade();
        cep = f.getCep();
        repo.listarTodos();
     }
    
    /**
     * Creates a new instance of fornecedorBean
     */
    public fornecedorBean() {
    }
}
