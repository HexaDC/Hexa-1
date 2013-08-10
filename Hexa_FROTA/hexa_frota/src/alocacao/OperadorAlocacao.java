/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alocacao;

import alocacao.Alocacao;
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
import operador.Operador;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "operador_alocacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OperadorAlocacao.findAll", query = "SELECT o FROM OperadorAlocacao o"),
    @NamedQuery(name = "OperadorAlocacao.findById", query = "SELECT o FROM OperadorAlocacao o WHERE o.id = :id")})
public class OperadorAlocacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "operador_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Operador operadorId;
    @JoinColumn(name = "alocacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Alocacao alocacaoId;

    public OperadorAlocacao() {
    }

    public OperadorAlocacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Operador getOperadorId() {
        return operadorId;
    }

    public void setOperadorId(Operador operadorId) {
        this.operadorId = operadorId;
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
        if (!(object instanceof OperadorAlocacao)) {
            return false;
        }
        OperadorAlocacao other = (OperadorAlocacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.OperadorAlocacao[ id=" + id + " ]";
    }
    
}
