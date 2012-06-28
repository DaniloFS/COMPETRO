
package br.com.competro.presentation.web;

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
}
