/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Endereco;
import br.com.competro.domainModel.EnderecoRepository;
import java.util.List;

/**
 *
 * @author Hugo Santos
 */
public class EnderecoDAO extends DAOGenerico<Endereco> implements EnderecoRepository{

    public EnderecoDAO(){
        super(Class.class);
    }
    @Override
    public List<Endereco> listarEnderecoCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Endereco> listarEnderecoFornecedor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
