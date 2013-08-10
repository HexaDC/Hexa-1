/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import veiculo.Veiculo;
import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "registro_preventivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroPreventivo.findAll", query = "SELECT r FROM RegistroPreventivo r"),
    @NamedQuery(name = "RegistroPreventivo.findById", query = "SELECT r FROM RegistroPreventivo r WHERE r.id = :id"),
    @NamedQuery(name = "RegistroPreventivo.findByTipoPreventivo", query = "SELECT r FROM RegistroPreventivo r WHERE r.tipoPreventivo = :tipoPreventivo"),
    @NamedQuery(name = "RegistroPreventivo.findByPeriodo", query = "SELECT r FROM RegistroPreventivo r WHERE r.periodo = :periodo"),
    @NamedQuery(name = "RegistroPreventivo.findByKmPrevencao", query = "SELECT r FROM RegistroPreventivo r WHERE r.kmPrevencao = :kmPrevencao")})
public class RegistroPreventivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_preventivo")
    private String tipoPreventivo;
    @Column(name = "periodo")
    private String periodo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "km_prevencao")
    private Double kmPrevencao;
    @OneToMany(mappedBy = "registroPreventivoId")
    private Collection<Manutencao> manutencaoCollection;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculoId;

    public RegistroPreventivo() {
    }

    public RegistroPreventivo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPreventivo() {
        return tipoPreventivo;
    }

    public void setTipoPreventivo(String tipoPreventivo) {
        this.tipoPreventivo = tipoPreventivo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getKmPrevencao() {
        return kmPrevencao;
    }

    public void setKmPrevencao(Double kmPrevencao) {
        this.kmPrevencao = kmPrevencao;
    }

    @XmlTransient
    public Collection<Manutencao> getManutencaoCollection() {
        return manutencaoCollection;
    }

    public void setManutencaoCollection(Collection<Manutencao> manutencaoCollection) {
        this.manutencaoCollection = manutencaoCollection;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
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
        if (!(object instanceof RegistroPreventivo)) {
            return false;
        }
        RegistroPreventivo other = (RegistroPreventivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.RegistroPreventivo[ id=" + id + " ]";
    }
    
}
