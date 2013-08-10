/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "status_vtr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusVtr.findAll", query = "SELECT s FROM StatusVtr s"),
    @NamedQuery(name = "StatusVtr.findById", query = "SELECT s FROM StatusVtr s WHERE s.id = :id"),
    @NamedQuery(name = "StatusVtr.findByTipo", query = "SELECT s FROM StatusVtr s WHERE s.tipo = :tipo")})
public class StatusVtr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusVtrId")
    private Collection<Manutencao> manutencaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "statusVtrId")
    private Collection<Veiculo> veiculoCollection;

    public StatusVtr() {
    }

    public StatusVtr(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Manutencao> getManutencaoCollection() {
        return manutencaoCollection;
    }

    public void setManutencaoCollection(Collection<Manutencao> manutencaoCollection) {
        this.manutencaoCollection = manutencaoCollection;
    }

    @XmlTransient
    public Collection<Veiculo> getVeiculoCollection() {
        return veiculoCollection;
    }

    public void setVeiculoCollection(Collection<Veiculo> veiculoCollection) {
        this.veiculoCollection = veiculoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusVtr)) {
            return false;
        }
        StatusVtr other = (StatusVtr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.StatusVtr[ id=" + id + " ]";
    }
    
}
