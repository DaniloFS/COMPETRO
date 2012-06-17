package br.com.competro.domainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
@Entity
@Table (name = "enderecos")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "rua")
    private String rua;
    
    @Column (name = "numero")
    private String numero;
    
    @Column (name = "bairro")
    private String bairro;
    
    @Column (name = "cidade")
    private String cidade;
    
    @Column (name = "cep")
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.rua == null) ? (other.rua != null) : !this.rua.equals(other.rua)) {
            return false;
        }
        if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
            return false;
        }
        if ((this.bairro == null) ? (other.bairro != null) : !this.bairro.equals(other.bairro)) {
            return false;
        }
        if ((this.cidade == null) ? (other.cidade != null) : !this.cidade.equals(other.cidade)) {
            return false;
        }
        if ((this.cep == null) ? (other.cep != null) : !this.cep.equals(other.cep)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 79 * hash + (this.rua != null ? this.rua.hashCode() : 0);
        hash = 79 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 79 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
        hash = 79 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
        hash = 79 * hash + (this.cep != null ? this.cep.hashCode() : 0);
        return hash;
    }
    
    @Override
    public String toString() {
        return "br.com.competro.domainModel.Endereco[ id=" + id + " ]";
    }
    
}
