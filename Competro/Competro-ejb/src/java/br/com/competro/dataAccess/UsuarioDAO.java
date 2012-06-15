/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Usuario;
import br.com.competro.domainModel.UsuarioRepository;
import java.util.List;

/**
 *
 * @author Hugo Santos
 */
public class UsuarioDAO extends DAOGenerico<Usuario> implements UsuarioRepository {

    public UsuarioDAO(){
        super(Class.class);
    }
    @Override
    public List<Usuario> listaUsuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
