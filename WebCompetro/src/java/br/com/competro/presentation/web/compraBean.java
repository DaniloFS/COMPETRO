/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Cliente;
import br.com.competro.domainModel.Compra;
import br.com.competro.domainModel.CompraRepository;
import br.com.competro.domainModel.Fornecedor;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Hugo Santos
 */
@Named(value = "compraBean")
@SessionScoped
public class compraBean implements Serializable {

    @EJB
    CompraRepository repo;
    
    private Date data;
    private Cliente cliente;
    private Fornecedor fornecedor;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CompraRepository getRepo() {
        return repo;
    }

    public void setRepo(CompraRepository repo) {
        this.repo = repo;
    }
    
    public void salvar(){
        Compra com = new Compra();
        
        com.setData(data);
        com.setFornecedor(fornecedor);
        repo.salvar(com);
    }
    
    /**
     * Creates a new instance of compraBean
     */
    public compraBean() {
    }
}
