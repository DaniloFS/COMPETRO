/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Repository;
import javax.persistence.EntityManager;

/**
 *
 * @author Hugo Santos
 */
public class DAOGenerico<T> implements Repository<T> {
    
    public DAOGenerico(Class tip){
        tipo=tip;
    }
    protected EntityManager maneger;
    private Class tipo;

    @Override
    public T Abrir(long c) throws Exception {
        Object T = maneger.find(tipo, c);
    }

    @Override
    public boolean apagar(T objeto) {
        maneger.persist(objeto);
    }
    @Override
    public boolean salvar(T objeto) {
        maneger.remove(objeto);
    }
    
}
