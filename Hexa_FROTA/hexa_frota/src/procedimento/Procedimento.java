/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimento;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import tipoAtendimento.TipoAtendimento;

/**
 *
 * @author Jenny
 */
@Entity
@Table(name = "procedimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimento.findAll", query = "SELECT p FROM Procedimento p"),
    @NamedQuery(name = "Procedimento.findById", query = "SELECT p FROM Procedimento p WHERE p.id = :id"),
    @NamedQuery(name = "Procedimento.findByCodigo", query = "SELECT p FROM Procedimento p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Procedimento.findByDescricao", query = "SELECT p FROM Procedimento p WHERE p.descricao = :descricao")})
public class Procedimento implements Serializable {
    @JoinTable(name = "atend_proced", joinColumns = {
        @JoinColumn(name = "procedimento_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "tipo_atendimento_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<TipoAtendimento> tipoAtendimentoCollection;

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
   

    public Procedimento() {
    }

    public Procedimento(Integer id) {
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
        if (!(object instanceof Procedimento)) {
            return false;
        }
        Procedimento other = (Procedimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "procedimento.Procedimento[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<TipoAtendimento> getTipoAtendimentoCollection() {
        return tipoAtendimentoCollection;
    }

    public void setTipoAtendimentoCollection(Collection<TipoAtendimento> tipoAtendimentoCollection) {
        this.tipoAtendimentoCollection = tipoAtendimentoCollection;
    }
}
