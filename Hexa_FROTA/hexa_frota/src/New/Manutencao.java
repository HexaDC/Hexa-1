/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "manutencao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manutencao.findAll", query = "SELECT m FROM Manutencao m"),
    @NamedQuery(name = "Manutencao.findById", query = "SELECT m FROM Manutencao m WHERE m.id = :id"),
    @NamedQuery(name = "Manutencao.findByDataInicial", query = "SELECT m FROM Manutencao m WHERE m.dataInicial = :dataInicial"),
    @NamedQuery(name = "Manutencao.findByHoraInicial", query = "SELECT m FROM Manutencao m WHERE m.horaInicial = :horaInicial"),
    @NamedQuery(name = "Manutencao.findByDataFinal", query = "SELECT m FROM Manutencao m WHERE m.dataFinal = :dataFinal"),
    @NamedQuery(name = "Manutencao.findByHoraFinal", query = "SELECT m FROM Manutencao m WHERE m.horaFinal = :horaFinal"),
    @NamedQuery(name = "Manutencao.findByObservacao", query = "SELECT m FROM Manutencao m WHERE m.observacao = :observacao")})
public class Manutencao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_inicial")
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Column(name = "hora_inicial")
    @Temporal(TemporalType.TIME)
    private Date horaInicial;
    @Column(name = "data_final")
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @Column(name = "hora_final")
    @Temporal(TemporalType.TIME)
    private Date horaFinal;
    @Column(name = "observacao")
    private String observacao;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculoId;
    @JoinColumn(name = "status_vtr_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StatusVtr statusVtrId;
    @JoinColumn(name = "registro_preventivo_id", referencedColumnName = "id")
    @ManyToOne
    private RegistroPreventivo registroPreventivoId;

    public Manutencao() {
    }

    public Manutencao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
    }

    public StatusVtr getStatusVtrId() {
        return statusVtrId;
    }

    public void setStatusVtrId(StatusVtr statusVtrId) {
        this.statusVtrId = statusVtrId;
    }

    public RegistroPreventivo getRegistroPreventivoId() {
        return registroPreventivoId;
    }

    public void setRegistroPreventivoId(RegistroPreventivo registroPreventivoId) {
        this.registroPreventivoId = registroPreventivoId;
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
        if (!(object instanceof Manutencao)) {
            return false;
        }
        Manutencao other = (Manutencao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.Manutencao[ id=" + id + " ]";
    }
    
}
