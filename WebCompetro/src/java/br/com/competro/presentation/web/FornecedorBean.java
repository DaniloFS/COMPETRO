package br.com.competro.presentation.web;

import br.com.competro.domainModel.Fornecedor;
import br.com.competro.domainModel.FornecedorRepository;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Ary
 */
@Named(value = "fornecedorBean")
@SessionScoped
public class FornecedorBean implements Serializable {
    
    public FornecedorBean() {
    }
    
    @EJB
    FornecedorRepository repo;
    
    private String nome;
    private String cnpj;
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
        Fornecedor f = new Fornecedor();
        f.setNome(nome);
        f.setCnpj(cnpj);
        f.setRua(rua);
        f.setNumero(numero);
        f.setBairro(bairro);
        f.setCidade(cidade);
        f.setCep(cep);
        repo.salvar(f);
    }
}
