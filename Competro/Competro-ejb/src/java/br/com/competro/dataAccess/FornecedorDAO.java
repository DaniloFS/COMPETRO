/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Fornecedor;
import br.com.competro.domainModel.FornecedorRepository;
import java.util.List;

/**
 *
 * @author Hugo Santos
 */
public class FornecedorDAO extends DAOGenerico<Fornecedor> implements FornecedorRepository {

    public FornecedorDAO(){
        super(Class.class);
    }
    @Override
    public List<Fornecedor> listarFonercedorPorProduto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
