package br.com.competro.domainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
@Entity
@Table (name="Vendas")
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade= CascadeType.PERSIST,targetEntity=Cliente.class)
    @JoinColumn(name="cliente",referencedColumnName="id")
    //@Column (name = "cliente")
    private Cliente cliente;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "data")
    private Date data;
    
    @ManyToMany (cascade= CascadeType.ALL)
    List<Produto> produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.cliente != other.cliente && (this.cliente == null || !this.cliente.equals(other.cliente))) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.cliente != null ? this.cliente.hashCode() : 0);
        hash = 17 * hash + (this.data != null ? this.data.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "br.com.competro.domainModel.Venda[ id=" + id + " ]";
    }
    
}
