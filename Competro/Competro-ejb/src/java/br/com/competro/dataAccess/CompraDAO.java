/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Compra;
import br.com.competro.domainModel.CompraRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Hugo Santos
 */
@Stateless
public class CompraDAO extends DAOGenerico<Compra> implements CompraRepository {

    public CompraDAO(){
        super(Class.class);
    }
    @Override
    public List<Compra> listarCompra() {
                        
        Query sql = (Query) maneger.createQuery("SELECT c FROM Compra c order by c.data");
        return sql.getResultList();
    }
    
}
