/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abastecimento;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findById", query = "SELECT c FROM Contrato c WHERE c.id = :id"),
    @NamedQuery(name = "Contrato.findByNumContrato", query = "SELECT c FROM Contrato c WHERE c.numContrato = :numContrato"),
    @NamedQuery(name = "Contrato.findByDataVigenciaInicial", query = "SELECT c FROM Contrato c WHERE c.dataVigenciaInicial = :dataVigenciaInicial"),
    @NamedQuery(name = "Contrato.findByDataVigenciaFinal", query = "SELECT c FROM Contrato c WHERE c.dataVigenciaFinal = :dataVigenciaFinal")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "num_contrato")
    private String numContrato;
    @Column(name = "data_vigencia_inicial")
    @Temporal(TemporalType.DATE)
    private Date dataVigenciaInicial;
    @Column(name = "data_vigencia_final")
    @Temporal(TemporalType.DATE)
    private Date dataVigenciaFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contratoId")
    private Collection<CombustivelContratado> combustivelContratadoCollection;

    public Contrato() {
    }

    public Contrato(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public Date getDataVigenciaInicial() {
        return dataVigenciaInicial;
    }

    public void setDataVigenciaInicial(Date dataVigenciaInicial) {
        this.dataVigenciaInicial = dataVigenciaInicial;
    }

    public Date getDataVigenciaFinal() {
        return dataVigenciaFinal;
    }

    public void setDataVigenciaFinal(Date dataVigenciaFinal) {
        this.dataVigenciaFinal = dataVigenciaFinal;
    }

    @XmlTransient
    public Collection<CombustivelContratado> getCombustivelContratadoCollection() {
        return combustivelContratadoCollection;
    }

    public void setCombustivelContratadoCollection(Collection<CombustivelContratado> combustivelContratadoCollection) {
        this.combustivelContratadoCollection = combustivelContratadoCollection;
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
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.Contrato[ id=" + id + " ]";
    }
    
}
