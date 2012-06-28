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
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

     
    @EJB
    UsuarioRepository repo;
    
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String Acessar(){
    
      String log = this.login;
      Usuario usu = (Usuario) repo.listaUsuario(log);
      
      String crip = criptografa(this.senha);
       
      if(usu.getSenha() == crip){
          
          return "conteudo.xhtml";
          
      }else{
          return "";
      }
      
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

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
}
