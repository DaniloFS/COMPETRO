package br.com.competro.dataAccess;

import br.com.competro.domainModel.Cliente;
import br.com.competro.domainModel.ClienteRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Ary
 */
@Stateless
public class ClienteDAO extends DAOGenerico<Cliente> implements ClienteRepository {


    public ClienteDAO(){
        super(Class.class);
    }
    @Override
    public List<Cliente> listarClientesPorNome(String nome) {
        Query sql = (Query) maneger.createQuery("SELECT c FROM Cliente c where c.nome like '%"+nome+"%' order by c.nome");
        return sql.getResultList();
    }

    @Override
    public List<Cliente> listarTodos() {
        Query sql = maneger.createQuery("SELECT c FROM Cliente");
        return sql.getResultList();
    }

}
