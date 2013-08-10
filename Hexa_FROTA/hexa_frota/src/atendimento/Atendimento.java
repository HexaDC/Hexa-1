/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import New.AlocacaoAtendimento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
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
import procedimento.Procedimento;
import tipoAtendimento.TipoAtendimento;

/**
 *
 * @author Jenny
 */
@Entity
@Table(name = "atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atendimento.findAll", query = "SELECT a FROM Atendimento a"),
    @NamedQuery(name = "Atendimento.findById", query = "SELECT a FROM Atendimento a WHERE a.id = :id"),
    @NamedQuery(name = "Atendimento.findByNumeroAtendimento", query = "SELECT a FROM Atendimento a WHERE a.numeroAtendimento = :numeroAtendimento"),
    @NamedQuery(name = "Atendimento.findByDataInicialAtendimento", query = "SELECT a FROM Atendimento a WHERE a.dataInicialAtendimento = :dataInicialAtendimento"),
    @NamedQuery(name = "Atendimento.findByHoraInicialAtendimento", query = "SELECT a FROM Atendimento a WHERE a.horaInicialAtendimento = :horaInicialAtendimento"),
    @NamedQuery(name = "Atendimento.findByDataFinalAtendimento", query = "SELECT a FROM Atendimento a WHERE a.dataFinalAtendimento = :dataFinalAtendimento"),
    @NamedQuery(name = "Atendimento.findByHoraFinalAtendimento", query = "SELECT a FROM Atendimento a WHERE a.horaFinalAtendimento = :horaFinalAtendimento"),
    @NamedQuery(name = "Atendimento.findByBairro", query = "SELECT a FROM Atendimento a WHERE a.bairro = :bairro"),
    @NamedQuery(name = "Atendimento.findByComplemento", query = "SELECT a FROM Atendimento a WHERE a.complemento = :complemento"),
    @NamedQuery(name = "Atendimento.findByDescricao", query = "SELECT a FROM Atendimento a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "Atendimento.findByStatus", query = "SELECT a FROM Atendimento a WHERE a.status = :status"),
    @NamedQuery(name = "Atendimento.findByLogradouro", query = "SELECT a FROM Atendimento a WHERE a.logradouro = :logradouro"),
    @NamedQuery(name = "Atendimento.findByCidade", query = "SELECT a FROM Atendimento a WHERE a.cidade = :cidade"),
    @NamedQuery(name = "Atendimento.findByEstado", query = "SELECT a FROM Atendimento a WHERE a.estado = :estado")})
public class Atendimento implements Serializable {
    @JoinColumn(name = "tipo_atendimento_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoAtendimento tipoAtendimentoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atendimentoId")
    private Collection<AlocacaoAtendimento> alocacaoAtendimentoCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numero_atendimento")
    private Integer numeroAtendimento;
    @Column(name = "data_inicial_atendimento")
    @Temporal(TemporalType.DATE)
    private Date dataInicialAtendimento;
    @Column(name = "hora_inicial_atendimento")
    private String horaInicialAtendimento;
    @Column(name = "data_final_atendimento")
    @Temporal(TemporalType.DATE)
    private Date dataFinalAtendimento;
    @Column(name = "hora_final_atendimento")
    private String horaFinalAtendimento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "status")
    private Integer status;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;

    public Atendimento() {
    }
   
    

    public Atendimento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroAtendimento() {
        return numeroAtendimento;
    }

    public void setNumeroAtendimento(Integer numeroAtendimento) {
        this.numeroAtendimento = numeroAtendimento;
    }

    public Date getDataInicialAtendimento() {
        return dataInicialAtendimento;
    }

    public void setDataInicialAtendimento(Date dataInicialAtendimento) {
        this.dataInicialAtendimento = dataInicialAtendimento;
    }

    public String getHoraInicialAtendimento() {
        return horaInicialAtendimento;
    }

    public void setHoraInicialAtendimento(String horaInicialAtendimento) {
        this.horaInicialAtendimento = horaInicialAtendimento;
    }

    public Date getDataFinalAtendimento() {
        return dataFinalAtendimento;
    }

    public void setDataFinalAtendimento(Date dataFinalAtendimento) {
        this.dataFinalAtendimento = dataFinalAtendimento;
    }

    public String getHoraFinalAtendimento() {
        return horaFinalAtendimento;
    }

    public void setHoraFinalAtendimento(String horaFinalAtendimento) {
        this.horaFinalAtendimento = horaFinalAtendimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atendimento.Atendimento[ id=" + id + " ]";
    }

    public TipoAtendimento getTipoAtendimentoId() {
        return tipoAtendimentoId;
    }

    public void setTipoAtendimentoId(TipoAtendimento tipoAtendimentoId) {
        this.tipoAtendimentoId = tipoAtendimentoId;
    }

    @XmlTransient
    public Collection<AlocacaoAtendimento> getAlocacaoAtendimentoCollection() {
        return alocacaoAtendimentoCollection;
    }

    public void setAlocacaoAtendimentoCollection(Collection<AlocacaoAtendimento> alocacaoAtendimentoCollection) {
        this.alocacaoAtendimentoCollection = alocacaoAtendimentoCollection;
    }
}
