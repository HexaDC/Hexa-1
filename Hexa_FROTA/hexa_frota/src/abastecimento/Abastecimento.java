/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abastecimento;

import veiculo.Veiculo;
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "abastecimeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abastecimeto.findAll", query = "SELECT a FROM Abastecimeto a"),
    @NamedQuery(name = "Abastecimeto.findById", query = "SELECT a FROM Abastecimeto a WHERE a.id = :id"),
    @NamedQuery(name = "Abastecimeto.findByDataAbastecimento", query = "SELECT a FROM Abastecimeto a WHERE a.dataAbastecimento = :dataAbastecimento"),
    @NamedQuery(name = "Abastecimeto.findByHoraAbastecimento", query = "SELECT a FROM Abastecimeto a WHERE a.horaAbastecimento = :horaAbastecimento"),
    @NamedQuery(name = "Abastecimeto.findByQtdLitros", query = "SELECT a FROM Abastecimeto a WHERE a.qtdLitros = :qtdLitros"),
    @NamedQuery(name = "Abastecimeto.findByQuilometragem", query = "SELECT a FROM Abastecimeto a WHERE a.quilometragem = :quilometragem"),
    @NamedQuery(name = "Abastecimeto.findByValorLitro", query = "SELECT a FROM Abastecimeto a WHERE a.valorLitro = :valorLitro"),
    @NamedQuery(name = "Abastecimeto.findByValorTotal", query = "SELECT a FROM Abastecimeto a WHERE a.valorTotal = :valorTotal")})
public class Abastecimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_abastecimento")
    @Temporal(TemporalType.DATE)
    private Date dataAbastecimento;
    @Column(name = "hora_abastecimento")
    @Temporal(TemporalType.TIME)
    private Date horaAbastecimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qtd_litros")
    private Double qtdLitros;
    @Column(name = "quilometragem")
    private Double quilometragem;
    @Column(name = "valor_litro")
    private BigInteger valorLitro;
    @Column(name = "valor_total")
    private BigInteger valorTotal;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculoId;
    @JoinColumn(name = "combustivel_contratado_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CombustivelContratado combustivelContratadoId;

    public Abastecimento() {
    }

    public Abastecimento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }

    public void setDataAbastecimento(Date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    public Date getHoraAbastecimento() {
        return horaAbastecimento;
    }

    public void setHoraAbastecimento(Date horaAbastecimento) {
        this.horaAbastecimento = horaAbastecimento;
    }

    public Double getQtdLitros() {
        return qtdLitros;
    }

    public void setQtdLitros(Double qtdLitros) {
        this.qtdLitros = qtdLitros;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public BigInteger getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(BigInteger valorLitro) {
        this.valorLitro = valorLitro;
    }

    public BigInteger getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigInteger valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
    }

    public CombustivelContratado getCombustivelContratadoId() {
        return combustivelContratadoId;
    }

    public void setCombustivelContratadoId(CombustivelContratado combustivelContratadoId) {
        this.combustivelContratadoId = combustivelContratadoId;
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
        if (!(object instanceof Abastecimento)) {
            return false;
        }
        Abastecimento other = (Abastecimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.Abastecimeto[ id=" + id + " ]";
    }
    
}
