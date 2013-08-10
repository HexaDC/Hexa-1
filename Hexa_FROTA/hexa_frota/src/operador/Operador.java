/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operador;

import alocacao.OperadorAlocacao;
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
 * @author Jenny
 */
@Entity
@Table(name = "operador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operador.findAll", query = "SELECT o FROM Operador o"),
    @NamedQuery(name = "Operador.findById", query = "SELECT o FROM Operador o WHERE o.id = :id"),
    @NamedQuery(name = "Operador.findByNome", query = "SELECT o FROM Operador o WHERE o.nome = :nome"),
    @NamedQuery(name = "Operador.findByMatricula", query = "SELECT o FROM Operador o WHERE o.matricula = :matricula"),
    @NamedQuery(name = "Operador.findByHabilitacao", query = "SELECT o FROM Operador o WHERE o.habilitacao = :habilitacao"),
    @NamedQuery(name = "Operador.findByCategoria", query = "SELECT o FROM Operador o WHERE o.categoria = :categoria"),
    @NamedQuery(name = "Operador.findByDtVencimentoHab", query = "SELECT o FROM Operador o WHERE o.dtVencimentoHab = :dtVencimentoHab"),
    @NamedQuery(name = "Operador.findByTipoSanguineo", query = "SELECT o FROM Operador o WHERE o.tipoSanguineo = :tipoSanguineo"),
    @NamedQuery(name = "Operador.findByLogradouro", query = "SELECT o FROM Operador o WHERE o.logradouro = :logradouro"),
    @NamedQuery(name = "Operador.findByBairro", query = "SELECT o FROM Operador o WHERE o.bairro = :bairro"),
    @NamedQuery(name = "Operador.findByNumero", query = "SELECT o FROM Operador o WHERE o.numero = :numero"),
    @NamedQuery(name = "Operador.findByComplemento", query = "SELECT o FROM Operador o WHERE o.complemento = :complemento"),
    @NamedQuery(name = "Operador.findByCidade", query = "SELECT o FROM Operador o WHERE o.cidade = :cidade"),
    @NamedQuery(name = "Operador.findByEstado", query = "SELECT o FROM Operador o WHERE o.estado = :estado"),
    @NamedQuery(name = "Operador.findByTelCelular", query = "SELECT o FROM Operador o WHERE o.telCelular = :telCelular"),
    @NamedQuery(name = "Operador.findByTelResidencia", query = "SELECT o FROM Operador o WHERE o.telResidencia = :telResidencia"),
    @NamedQuery(name = "Operador.findByStatus", query = "SELECT o FROM Operador o WHERE o.status = :status"),
    @NamedQuery(name = "Operador.findByDataCadastro", query = "SELECT o FROM Operador o WHERE o.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Operador.findByObservacao", query = "SELECT o FROM Operador o WHERE o.observacao = :observacao"),
    @NamedQuery(name = "Operador.findByFoto", query = "SELECT o FROM Operador o WHERE o.foto = :foto"),
    @NamedQuery(name = "Operador.findByNumeroRg", query = "SELECT o FROM Operador o WHERE o.numeroRg = :numeroRg"),
    @NamedQuery(name = "Operador.findByNumeroCpf", query = "SELECT o FROM Operador o WHERE o.numeroCpf = :numeroCpf")})
public class Operador implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operadorId")
    private Collection<OperadorAlocacao> operadorAlocacaoCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @Column(name = "habilitacao")
    private String habilitacao;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "dt_vencimento_hab")
    @Temporal(TemporalType.DATE)
    private Date dtVencimentoHab;
    @Column(name = "tipo_sanguineo")
    private String tipoSanguineo;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "tel_celular")
    private String telCelular;
    @Column(name = "tel_residencia")
    private String telResidencia;
    @Column(name = "status")
    private Integer status;
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "foto")
    private String foto;
    @Column(name = "numero_rg")
    private String numeroRg;
    @Column(name = "numero_cpf")
    private String numeroCpf;

    public Operador() {
    }

    public Operador(Integer id) {
        this.id = id;
    }

    public Operador(Integer id, String habilitacao, String categoria, Date dtVencimentoHab) {
        this.id = id;
        this.habilitacao = habilitacao;
        this.categoria = categoria;
        this.dtVencimentoHab = dtVencimentoHab;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDtVencimentoHab() {
        return dtVencimentoHab;
    }

    public void setDtVencimentoHab(Date dtVencimentoHab) {
        this.dtVencimentoHab = dtVencimentoHab;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(String telResidencia) {
        this.telResidencia = telResidencia;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
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
        if (!(object instanceof Operador)) {
            return false;
        }
        Operador other = (Operador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "operador.Operador[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<OperadorAlocacao> getOperadorAlocacaoCollection() {
        return operadorAlocacaoCollection;
    }

    public void setOperadorAlocacaoCollection(Collection<OperadorAlocacao> operadorAlocacaoCollection) {
        this.operadorAlocacaoCollection = operadorAlocacaoCollection;
    }
    
}
