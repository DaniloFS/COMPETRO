
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
@Named(value = "produtoBean")
@SessionScoped
public class ProdutoBean implements Serializable {
    
    public ProdutoBean() {
    }
    
    @EJB
    ProdutoRepository repo;
    
    private String descricao;
    private float valor;

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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public void salvar(){
        Produto pro = new Produto();
        pro.setDescricao(descricao);
        pro.setValorUnitario(valor);
        repo.salvar(pro);
    }
    
}
