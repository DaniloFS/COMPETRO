/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Cliente;
import br.com.competro.domainModel.ClienteRepository;
import java.util.List;

/**
 *
 * @author Hugo Santos
 */
public class ClienteDAO extends DAOGenerico<Cliente> implements ClienteRepository {

    public ClienteDAO(){
        super(Class.class);
    }
    @Override
    public List<Cliente> listarClientesPorNome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
