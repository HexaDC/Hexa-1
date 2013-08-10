/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "modelo_vtr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeloVtr.findAll", query = "SELECT m FROM ModeloVtr m"),
    @NamedQuery(name = "ModeloVtr.findById", query = "SELECT m FROM ModeloVtr m WHERE m.id = :id"),
    @NamedQuery(name = "ModeloVtr.findByNome", query = "SELECT m FROM ModeloVtr m WHERE m.nome = :nome")})
public class ModeloVtr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "montadora_vtr_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MontadoraVtr montadoraVtrId;

    public ModeloVtr() {
    }

    public ModeloVtr(Integer id) {
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

    public MontadoraVtr getMontadoraVtrId() {
        return montadoraVtrId;
    }

    public void setMontadoraVtrId(MontadoraVtr montadoraVtrId) {
        this.montadoraVtrId = montadoraVtrId;
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
        if (!(object instanceof ModeloVtr)) {
            return false;
        }
        ModeloVtr other = (ModeloVtr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.ModeloVtr[ id=" + id + " ]";
    }
    
}
