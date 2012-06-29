/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Cliente;
import br.com.competro.domainModel.Produto;
import br.com.competro.domainModel.Venda;
import br.com.competro.domainModel.VendaRepository;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Hugo Santos
 */
@Named(value = "vendaBean")
@SessionScoped
public class vendaBean implements Serializable {

    @EJB
    VendaRepository repo;
    
    private Date data;
    private Cliente cliente;
    private Produto produto;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public VendaRepository getRepo() {
        return repo;
    }

    public void setRepo(VendaRepository repo) {
        this.repo = repo;
    }
    
    public void salvar(){
        Venda ven = new Venda();
        
        ven.setData(data);
        ven.setCliente(cliente);
        
        repo.salvar(ven);
    }
    /**
     * Creates a new instance of vendaBean
     */
    public vendaBean() {
    }
}
