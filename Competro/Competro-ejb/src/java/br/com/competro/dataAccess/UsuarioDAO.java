/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.dataAccess;

import br.com.competro.domainModel.Usuario;
import br.com.competro.domainModel.UsuarioRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Hugo Santos
 */
@Stateless
public class UsuarioDAO extends DAOGenerico<Usuario> implements UsuarioRepository {

    public UsuarioDAO(){
        super(Class.class);
    }
    @Override
    public List<Usuario> listaUsuario(String login) {
        Query sql = (Query) maneger.createQuery("SELECT u FROM Usuario u where u.login like '%"+login+"%'");
        return sql.getResultList();
    }
    
}
