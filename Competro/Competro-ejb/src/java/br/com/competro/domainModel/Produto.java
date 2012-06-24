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
@Table (name="produtos")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name="descricao")
    private String descricao;
    
    @Column (name="valorUnitario")
    private float valorUnitario;
    
    @ManyToMany (cascade= CascadeType.ALL)
    List<Venda> venda;
    
    @ManyToMany (cascade= CascadeType.ALL)
    List<Compra> compra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (Float.floatToIntBits(this.valorUnitario) != Float.floatToIntBits(other.valorUnitario)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 29 * hash + Float.floatToIntBits(this.valorUnitario);
        return hash;
    }

    @Override
    public String toString() {
        return "br.com.competro.domainModel.Produto[ id=" + id + " ]";
    }
    
}
