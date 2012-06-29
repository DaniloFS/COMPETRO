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
        Query sql = (Query) maneger.createQuery("select u from Usuario u where u.login = :p");
        sql.setParameter("p", login);
        return sql.getResultList();
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        Query sql = (Query) maneger.createQuery("select u from Usuario u where u.login = :p");
        sql.setParameter("p", login);
        return (Usuario) sql.getSingleResult();
    }

    @Override
    public List<Usuario> listarTodos() {
        Query sql = maneger.createQuery("SELECT u FROM Usuario");
        return sql.getResultList();
    }
}
