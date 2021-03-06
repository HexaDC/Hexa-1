/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montadora;

import modelovtr.ModeloVtr;
import veiculo.Veiculo;
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
import veiculo.Veiculo;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "montadora_vtr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MontadoraVtr.findAll", query = "SELECT m FROM MontadoraVtr m"),
    @NamedQuery(name = "MontadoraVtr.findById", query = "SELECT m FROM MontadoraVtr m WHERE m.id = :id"),
    @NamedQuery(name = "MontadoraVtr.findByNome", query = "SELECT m FROM MontadoraVtr m WHERE m.nome = :nome")})
public class MontadoraVtr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "montadoraVtrId")
    private Collection<Veiculo> veiculoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "montadoraVtrId")
    private Collection<ModeloVtr> modeloVtrCollection;

    public MontadoraVtr() {
    }

    public MontadoraVtr(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public Collection<Veiculo> getVeiculoCollection() {
        return veiculoCollection;
    }

    public void setVeiculoCollection(Collection<Veiculo> veiculoCollection) {
        this.veiculoCollection = veiculoCollection;
    }

    @XmlTransient
    public Collection<ModeloVtr> getModeloVtrCollection() {
        return modeloVtrCollection;
    }

    public void setModeloVtrCollection(Collection<ModeloVtr> modeloVtrCollection) {
        this.modeloVtrCollection = modeloVtrCollection;
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
        if (!(object instanceof MontadoraVtr)) {
            return false;
        }
        MontadoraVtr other = (MontadoraVtr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.MontadoraVtr[ id=" + id + " ]";
    }
    
}
