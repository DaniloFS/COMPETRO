package br.com.competro.domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
@Entity
@Table (name = "compras")
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "fornecedor")
    //@Column (name = "fornecedor")
    private Fornecedor fornecedor;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "data")
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.fornecedor != other.fornecedor && (this.fornecedor == null || !this.fornecedor.equals(other.fornecedor))) {
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
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 53 * hash + (this.fornecedor != null ? this.fornecedor.hashCode() : 0);
        hash = 53 * hash + (this.data != null ? this.data.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "br.com.competro.domainModel.Compra[ id=" + id + " ]";
    }
    
}
