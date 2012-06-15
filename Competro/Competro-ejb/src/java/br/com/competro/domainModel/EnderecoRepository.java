/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.domainModel;

import java.util.List;

/**
 *
 * @author Hugo Santos
 */
public interface EnderecoRepository extends Repository<Endereco> {
    List<Endereco> listarEnderecoCliente();
    List<Endereco> listarEnderecoFornecedor();
}
