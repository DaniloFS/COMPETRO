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
public class VendaDAO extends DAOGenerico<Venda> implements VendaRepository{

    public VendaDAO(){
        super(Class.class);
    }
    @Override
    public List<Venda> listaVendasPorMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Venda> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
