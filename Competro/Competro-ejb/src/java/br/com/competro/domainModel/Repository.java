package br.com.competro.domainModel;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
public interface Repository<T> {
    boolean salvar(T objeto);
    boolean apagar(T objeto);
    T Abrir (long c)throws Exception;    
}
