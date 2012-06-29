/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Endereco;
import br.com.competro.domainModel.EnderecoRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Hugo Santos
 */
@Stateless
public class EnderecoDAO extends DAOGenerico<Endereco> implements EnderecoRepository{

    public EnderecoDAO(){
        super(Class.class);
    }
    @Override
    public List<Endereco> listarEnderecoCliente() {
        Query sql = (Query) maneger.createQuery("SELECT e FROM Endereco e join Cliente c ");
        return sql.getResultList();        
    }

    @Override
    public List<Endereco> listarEnderecoFornecedor() {
        Query sql = (Query) maneger.createQuery("SELECT e FROM Endereco e join Fornecedor c ");
        return sql.getResultList();
    }

    @Override
    public List<Endereco> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
