/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.domainModel;

import java.util.List;
import javax.ejb.Remote;


/**
 *
 * @author Hugo Santos
 */
@Remote
public interface VendaRepository extends Repository<Venda> {
    List<Venda> listaVendasPorMes();
}
