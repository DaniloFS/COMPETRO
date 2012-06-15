package br.com.competro.domainModel;

import java.util.List;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
public interface Repository<T> {
    void salvar(T objeto);
    void apagar(T objeto);
    T Abrir (long c)throws Exception;
    List<T> listarTodos();
}
