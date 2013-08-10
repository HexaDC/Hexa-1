/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "alocacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alocacao.findAll", query = "SELECT a FROM Alocacao a"),
    @NamedQuery(name = "Alocacao.findById", query = "SELECT a FROM Alocacao a WHERE a.id = :id"),
    @NamedQuery(name = "Alocacao.findByDtInicioAlocacao", query = "SELECT a FROM Alocacao a WHERE a.dtInicioAlocacao = :dtInicioAlocacao"),
    @NamedQuery(name = "Alocacao.findByHoraInicioAlocacao", query = "SELECT a FROM Alocacao a WHERE a.horaInicioAlocacao = :horaInicioAlocacao"),
    @NamedQuery(name = "Alocacao.findByKmInicial", query = "SELECT a FROM Alocacao a WHERE a.kmInicial = :kmInicial"),
    @NamedQuery(name = "Alocacao.findByRoteiro", query = "SELECT a FROM Alocacao a WHERE a.roteiro = :roteiro"),
    @NamedQuery(name = "Alocacao.findByKmRodados", query = "SELECT a FROM Alocacao a WHERE a.kmRodados = :kmRodados"),
    @NamedQuery(name = "Alocacao.findByDataFinalAlocacao", query = "SELECT a FROM Alocacao a WHERE a.dataFinalAlocacao = :dataFinalAlocacao"),
    @NamedQuery(name = "Alocacao.findByHoraFinalAlocacao", query = "SELECT a FROM Alocacao a WHERE a.horaFinalAlocacao = :horaFinalAlocacao"),
    @NamedQuery(name = "Alocacao.findByStatus", query = "SELECT a FROM Alocacao a WHERE a.status = :status"),
    @NamedQuery(name = "Alocacao.findByKmFinal", query = "SELECT a FROM Alocacao a WHERE a.kmFinal = :kmFinal")})
public class Alocacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dt_inicio_alocacao")
    @Temporal(TemporalType.DATE)
    private Date dtInicioAlocacao;
    @Column(name = "hora_inicio_alocacao")
    @Temporal(TemporalType.TIME)
    private Date horaInicioAlocacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "km_inicial")
    private Double kmInicial;
    @Column(name = "roteiro")
    private String roteiro;
    @Column(name = "km_rodados")
    private Double kmRodados;
    @Column(name = "data_final_alocacao")
    @Temporal(TemporalType.DATE)
    private Date dataFinalAlocacao;
    @Column(name = "hora_final_alocacao")
    @Temporal(TemporalType.TIME)
    private Date horaFinalAlocacao;
    @Column(name = "status")
    private Integer status;
    @Column(name = "km_final")
    private Double kmFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alocacaoId")
    private Collection<AlocacaoAtendimento> alocacaoAtendimentoCollection;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alocacaoId")
    private Collection<OperadorAlocacao> operadorAlocacaoCollection;

    public Alocacao() {
    }

    public Alocacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtInicioAlocacao() {
        return dtInicioAlocacao;
    }

    public void setDtInicioAlocacao(Date dtInicioAlocacao) {
        this.dtInicioAlocacao = dtInicioAlocacao;
    }

    public Date getHoraInicioAlocacao() {
        return horaInicioAlocacao;
    }

    public void setHoraInicioAlocacao(Date horaInicioAlocacao) {
        this.horaInicioAlocacao = horaInicioAlocacao;
    }

    public Double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public Double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Date getDataFinalAlocacao() {
        return dataFinalAlocacao;
    }

    public void setDataFinalAlocacao(Date dataFinalAlocacao) {
        this.dataFinalAlocacao = dataFinalAlocacao;
    }

    public Date getHoraFinalAlocacao() {
        return horaFinalAlocacao;
    }

    public void setHoraFinalAlocacao(Date horaFinalAlocacao) {
        this.horaFinalAlocacao = horaFinalAlocacao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Double kmFinal) {
        this.kmFinal = kmFinal;
    }

    @XmlTransient
    public Collection<AlocacaoAtendimento> getAlocacaoAtendimentoCollection() {
        return alocacaoAtendimentoCollection;
    }

    public void setAlocacaoAtendimentoCollection(Collection<AlocacaoAtendimento> alocacaoAtendimentoCollection) {
        this.alocacaoAtendimentoCollection = alocacaoAtendimentoCollection;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
    }

    @XmlTransient
    public Collection<OperadorAlocacao> getOperadorAlocacaoCollection() {
        return operadorAlocacaoCollection;
    }

    public void setOperadorAlocacaoCollection(Collection<OperadorAlocacao> operadorAlocacaoCollection) {
        this.operadorAlocacaoCollection = operadorAlocacaoCollection;
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
        if (!(object instanceof Alocacao)) {
            return false;
        }
        Alocacao other = (Alocacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.Alocacao[ id=" + id + " ]";
    }
    
}
