package br.com.competro.domainModel;

import java.util.List;
import javax.ejb.Remote;

/**
 * @author Ary
 * @author Danilo
 * @author Hugo Santos
 */
@Remote
public interface FornecedorRepository extends Repository<Fornecedor> {
    List<Fornecedor> listarFonercedorPorProduto();
    
}
