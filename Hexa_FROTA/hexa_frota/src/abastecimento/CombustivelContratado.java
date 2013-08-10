/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abastecimento;

import abastecimento.Contrato;
import abastecimento.Abastecimeto;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "combustivel_contratado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CombustivelContratado.findAll", query = "SELECT c FROM CombustivelContratado c"),
    @NamedQuery(name = "CombustivelContratado.findById", query = "SELECT c FROM CombustivelContratado c WHERE c.id = :id"),
    @NamedQuery(name = "CombustivelContratado.findByTipo", query = "SELECT c FROM CombustivelContratado c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "CombustivelContratado.findByDistribuidora", query = "SELECT c FROM CombustivelContratado c WHERE c.distribuidora = :distribuidora"),
    @NamedQuery(name = "CombustivelContratado.findByQtdContratada", query = "SELECT c FROM CombustivelContratado c WHERE c.qtdContratada = :qtdContratada")})
public class CombustivelContratado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "distribuidora")
    private String distribuidora;
    @Column(name = "qtd_contratada")
    private Integer qtdContratada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "combustivelContratadoId")
    private Collection<Abastecimeto> abastecimetoCollection;
    @JoinColumn(name = "contrato_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Contrato contratoId;

    public CombustivelContratado() {
    }

    public CombustivelContratado(Integer id) {
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

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public Integer getQtdContratada() {
        return qtdContratada;
    }

    public void setQtdContratada(Integer qtdContratada) {
        this.qtdContratada = qtdContratada;
    }

    @XmlTransient
    public Collection<Abastecimeto> getAbastecimetoCollection() {
        return abastecimetoCollection;
    }

    public void setAbastecimetoCollection(Collection<Abastecimeto> abastecimetoCollection) {
        this.abastecimetoCollection = abastecimetoCollection;
    }

    public Contrato getContratoId() {
        return contratoId;
    }

    public void setContratoId(Contrato contratoId) {
        this.contratoId = contratoId;
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
        if (!(object instanceof CombustivelContratado)) {
            return false;
        }
        CombustivelContratado other = (CombustivelContratado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.CombustivelContratado[ id=" + id + " ]";
    }
    
}
