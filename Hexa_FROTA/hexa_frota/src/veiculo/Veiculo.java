/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import abastecimento.Abastecimeto;
import alocacao.Alocacao;
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
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Veiculo.findByChassi", query = "SELECT v FROM Veiculo v WHERE v.chassi = :chassi"),
    @NamedQuery(name = "Veiculo.findByCodigo", query = "SELECT v FROM Veiculo v WHERE v.codigo = :codigo")})
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "placa")
    private String placa;
    @Column(name = "chassi")
    private String chassi;
    @Column(name = "codigo")
    private Integer codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculoId")
    private Collection<Manutencao> manutencaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculoId")
    private Collection<Abastecimeto> abastecimetoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculoId")
    private Collection<VeiculoComplementos> veiculoComplementosCollection;
    @JoinColumn(name = "status_vtr_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StatusVtr statusVtrId;
    @JoinColumn(name = "montadora_vtr_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MontadoraVtr montadoraVtrId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculoId")
    private Collection<Alocacao> alocacaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "veiculoId")
    private Collection<RegistroPreventivo> registroPreventivoCollection;

    public Veiculo() {
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<Manutencao> getManutencaoCollection() {
        return manutencaoCollection;
    }

    public void setManutencaoCollection(Collection<Manutencao> manutencaoCollection) {
        this.manutencaoCollection = manutencaoCollection;
    }

    @XmlTransient
    public Collection<Abastecimeto> getAbastecimetoCollection() {
        return abastecimetoCollection;
    }

    public void setAbastecimetoCollection(Collection<Abastecimeto> abastecimetoCollection) {
        this.abastecimetoCollection = abastecimetoCollection;
    }

    @XmlTransient
    public Collection<VeiculoComplementos> getVeiculoComplementosCollection() {
        return veiculoComplementosCollection;
    }

    public void setVeiculoComplementosCollection(Collection<VeiculoComplementos> veiculoComplementosCollection) {
        this.veiculoComplementosCollection = veiculoComplementosCollection;
    }

    public StatusVtr getStatusVtrId() {
        return statusVtrId;
    }

    public void setStatusVtrId(StatusVtr statusVtrId) {
        this.statusVtrId = statusVtrId;
    }

    public MontadoraVtr getMontadoraVtrId() {
        return montadoraVtrId;
    }

    public void setMontadoraVtrId(MontadoraVtr montadoraVtrId) {
        this.montadoraVtrId = montadoraVtrId;
    }

    @XmlTransient
    public Collection<Alocacao> getAlocacaoCollection() {
        return alocacaoCollection;
    }

    public void setAlocacaoCollection(Collection<Alocacao> alocacaoCollection) {
        this.alocacaoCollection = alocacaoCollection;
    }

    @XmlTransient
    public Collection<RegistroPreventivo> getRegistroPreventivoCollection() {
        return registroPreventivoCollection;
    }

    public void setRegistroPreventivoCollection(Collection<RegistroPreventivo> registroPreventivoCollection) {
        this.registroPreventivoCollection = registroPreventivoCollection;
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.Veiculo[ id=" + id + " ]";
    }
    
}
