package br.com.competro.dataAccess;

import br.com.competro.domainModel.Repository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Danilo
 * @author Ary
 * @author Hugo Santos
 */
public abstract class DAOGenerico<T> implements Repository<T> {

    public DAOGenerico() {
    }
    
    public DAOGenerico(Class tip){
        tipo=tip;
    }
    @PersistenceContext(name="Competro-ejbPU")
    protected EntityManager maneger;
    private Class tipo;

    @Override
    public void salvar(T objeto) {
        maneger.persist(objeto);
    }

    @Override
    public void apagar(T objeto) {
        maneger.remove(objeto);
    }

    @Override
    public T Abrir(long c) throws Exception {
        return (T) maneger.find(tipo, c);
    }

    @Override
    public abstract List<T> listarTodos();

}
