/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoAtendimento;

import atendimento.Atendimento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import procedimento.Procedimento;

/**
 *
 * @author Jenny
 */
@Entity
@Table(name = "tipo_atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAtendimento.findAll", query = "SELECT t FROM TipoAtendimento t"),
    @NamedQuery(name = "TipoAtendimento.findById", query = "SELECT t FROM TipoAtendimento t WHERE t.id = :id"),
    @NamedQuery(name = "TipoAtendimento.findByCodigo", query = "SELECT t FROM TipoAtendimento t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoAtendimento.findByDescricao", query = "SELECT t FROM TipoAtendimento t WHERE t.descricao = :descricao")})
public class TipoAtendimento implements Serializable {
    @ManyToMany(mappedBy = "tipoAtendimentoCollection")
    private Collection<Procedimento> procedimentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoAtendimentoId")
    private Collection<Atendimento> atendimentoCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descricao")
    private String descricao;
     private Collection<Procedimento> procedimentoCollection;
    private List<Procedimento> listProcedimento;

    public TipoAtendimento() {
         listProcedimento = new ArrayList<>();
    }

    public List<Procedimento> getListProcedimento() {
        return this.listProcedimento;
    }

    public void setListProcedimento(List<Procedimento> sec) {
        this.listProcedimento = sec;
    }

    public TipoAtendimento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof TipoAtendimento)) {
            return false;
        }
        TipoAtendimento other = (TipoAtendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tipoAtendimento.TipoAtendimento[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Procedimento> getProcedimentoCollection() {
        return procedimentoCollection;
    }

    public void setProcedimentoCollection(Collection<Procedimento> procedimentoCollection) {
        this.procedimentoCollection = procedimentoCollection;
    }

    @XmlTransient
    public Collection<Atendimento> getAtendimentoCollection() {
        return atendimentoCollection;
    }

    public void setAtendimentoCollection(Collection<Atendimento> atendimentoCollection) {
        this.atendimentoCollection = atendimentoCollection;
    }
    
}
