package br.com.competro.domainModel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
@Entity
@Table (name="fornecedores")
//public class Fornecedor implements Serializable {
public class Fornecedor extends Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="cnpj")
    private String cnpj;
    
    @ManyToMany (cascade= CascadeType.ALL)
    List<Endereco> end;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 79 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 79 * hash + (this.cnpj != null ? this.cnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "br.com.competro.domainModel.Fornecedor[ id=" + id + " ]";
    }
    
}
