/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import atendimento.Atendimento;
import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "alocacao_atendimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlocacaoAtendimento.findAll", query = "SELECT a FROM AlocacaoAtendimento a"),
    @NamedQuery(name = "AlocacaoAtendimento.findById", query = "SELECT a FROM AlocacaoAtendimento a WHERE a.id = :id")})
public class AlocacaoAtendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "atendimento_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Atendimento atendimentoId;
    @JoinColumn(name = "alocacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Alocacao alocacaoId;

    public AlocacaoAtendimento() {
    }

    public AlocacaoAtendimento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atendimento getAtendimentoId() {
        return atendimentoId;
    }

    public void setAtendimentoId(Atendimento atendimentoId) {
        this.atendimentoId = atendimentoId;
    }

    public Alocacao getAlocacaoId() {
        return alocacaoId;
    }

    public void setAlocacaoId(Alocacao alocacaoId) {
        this.alocacaoId = alocacaoId;
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
        if (!(object instanceof AlocacaoAtendimento)) {
            return false;
        }
        AlocacaoAtendimento other = (AlocacaoAtendimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.AlocacaoAtendimento[ id=" + id + " ]";
    }
    
}
