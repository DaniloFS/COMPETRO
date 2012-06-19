/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Venda;
import br.com.competro.domainModel.VendaRepository;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Hugo Santos
 */
@Stateless
public class CompraDAO extends DAOGenerico<Venda> implements VendaRepository {

    public CompraDAO(){
        super(Class.class);
    }
    @Override
    public List<Venda> listaVendasPorMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
