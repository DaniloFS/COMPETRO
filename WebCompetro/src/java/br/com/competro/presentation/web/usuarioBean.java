/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.competro.presentation.web;

import br.com.competro.domainModel.Usuario;
import br.com.competro.domainModel.UsuarioRepository;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.ejb.EJB;

/**
 *
 * @author Ary
 */
@Named(value = "usuarioBean")
@SessionScoped
public class usuarioBean implements Serializable {

    @EJB
    UsuarioRepository repo;
    
    private Long id;
    private String nome;
    private String login;
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UsuarioRepository getRepo() {
        return repo;
    }

    public void setRepo(UsuarioRepository repo) {
        this.repo = repo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   String crip = criptografa(this.senha);
   public void salvar(){
       Usuario usu = new Usuario();
       usu.setNome(nome);
       usu.setLogin(login);
       usu.setSenha(crip);
       repo.salvar(usu);
   }
   public void listar(){
       Usuario u = new Usuario();
       id = u.getId();
       nome = u.getNome();
       login = u.getLogin();
       repo.listarTodos();
   }
   public String criptografa(String senha)
    {
        // Aumenta a complexidade da senha digitada pelo usuário
        // ser descoberta se o banco de dados for analisado
        senha = "5tR1n6_d171C1l" + senha;

        // Converte a senha em um vetor de bytes
        byte[] defBytes = senha.getBytes();
        byte msgDigest[];
        StringBuilder buf = null;

        try {
            MessageDigest algoritmo = MessageDigest.getInstance("MD5");
            algoritmo.reset();
            algoritmo.update(defBytes);
            msgDigest = algoritmo.digest();

            buf = new StringBuilder();
            for (int i = 0; i < msgDigest.length; i++) {
                buf.append(Integer.toHexString(0xFF & msgDigest[i]));
            }

        } catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }

        return buf.toString();
    }
    public usuarioBean() {
    }
}
