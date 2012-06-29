
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Produto;
import br.com.competro.domainModel.ProdutoRepository;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 * @author Danilo
 * @author Ary
 * @author Hugo
 */
@Named(value = "beanProduto")
@SessionScoped
public class ProdutoBean implements Serializable {
    
    public ProdutoBean() {
    }
    
    @EJB
    ProdutoRepository repo;
    
    private String descricao;
    private float valorUbitario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProdutoRepository getRepo() {
        return repo;
    }

    public void setRepo(ProdutoRepository repo) {
        this.repo = repo;
    }

    public float getValorUbitario() {
        return valorUbitario;
    }

    public void setValorUbitario(float valorUbitario) {
        this.valorUbitario = valorUbitario;
    }
    
    public void salvar(){
        Produto p = new Produto();
        p.setDescricao(descricao);
        p.setValorUnitario(valorUbitario);
        repo.salvar(p);
    }
}
