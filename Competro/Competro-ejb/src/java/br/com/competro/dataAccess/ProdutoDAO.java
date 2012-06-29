/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Produto;
import br.com.competro.domainModel.ProdutoRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Hugo Santos
 */
@Stateless
public class ProdutoDAO extends DAOGenerico<Produto> implements ProdutoRepository {

    public ProdutoDAO(){
        super(Class.class);
    }
    @Override
    public List<Produto> listarProdutoEstocado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Produto> listarTodos() {
        Query sql = maneger.createQuery("SELECT p FROM Produto");
        return sql.getResultList();
    }
    
}
