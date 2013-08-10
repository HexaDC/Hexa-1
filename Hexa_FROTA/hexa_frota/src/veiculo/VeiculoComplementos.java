/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import veiculo.Veiculo;
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
@Table(name = "veiculo_complementos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VeiculoComplementos.findAll", query = "SELECT v FROM VeiculoComplementos v"),
    @NamedQuery(name = "VeiculoComplementos.findById", query = "SELECT v FROM VeiculoComplementos v WHERE v.id = :id"),
    @NamedQuery(name = "VeiculoComplementos.findByAno", query = "SELECT v FROM VeiculoComplementos v WHERE v.ano = :ano"),
    @NamedQuery(name = "VeiculoComplementos.findByAnoFabricado", query = "SELECT v FROM VeiculoComplementos v WHERE v.anoFabricado = :anoFabricado"),
    @NamedQuery(name = "VeiculoComplementos.findByPortas", query = "SELECT v FROM VeiculoComplementos v WHERE v.portas = :portas"),
    @NamedQuery(name = "VeiculoComplementos.findByCor", query = "SELECT v FROM VeiculoComplementos v WHERE v.cor = :cor"),
    @NamedQuery(name = "VeiculoComplementos.findByNumRenavam", query = "SELECT v FROM VeiculoComplementos v WHERE v.numRenavam = :numRenavam"),
    @NamedQuery(name = "VeiculoComplementos.findByNumMotor", query = "SELECT v FROM VeiculoComplementos v WHERE v.numMotor = :numMotor"),
    @NamedQuery(name = "VeiculoComplementos.findByCilindradas", query = "SELECT v FROM VeiculoComplementos v WHERE v.cilindradas = :cilindradas"),
    @NamedQuery(name = "VeiculoComplementos.findByNumCilindros", query = "SELECT v FROM VeiculoComplementos v WHERE v.numCilindros = :numCilindros"),
    @NamedQuery(name = "VeiculoComplementos.findByPotencia", query = "SELECT v FROM VeiculoComplementos v WHERE v.potencia = :potencia"),
    @NamedQuery(name = "VeiculoComplementos.findByTipoCambio", query = "SELECT v FROM VeiculoComplementos v WHERE v.tipoCambio = :tipoCambio"),
    @NamedQuery(name = "VeiculoComplementos.findByObservacao", query = "SELECT v FROM VeiculoComplementos v WHERE v.observacao = :observacao"),
    @NamedQuery(name = "VeiculoComplementos.findByCapacidadeTanque", query = "SELECT v FROM VeiculoComplementos v WHERE v.capacidadeTanque = :capacidadeTanque"),
    @NamedQuery(name = "VeiculoComplementos.findByAdicionais", query = "SELECT v FROM VeiculoComplementos v WHERE v.adicionais = :adicionais"),
    @NamedQuery(name = "VeiculoComplementos.findByMediaConsumo", query = "SELECT v FROM VeiculoComplementos v WHERE v.mediaConsumo = :mediaConsumo"),
    @NamedQuery(name = "VeiculoComplementos.findByTipoCombustivel", query = "SELECT v FROM VeiculoComplementos v WHERE v.tipoCombustivel = :tipoCombustivel")})
public class VeiculoComplementos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ano")
    private Integer ano;
    @Column(name = "ano_fabricado")
    private Integer anoFabricado;
    @Column(name = "portas")
    private Integer portas;
    @Column(name = "cor")
    private String cor;
    @Column(name = "num_renavam")
    private Integer numRenavam;
    @Column(name = "num_motor")
    private Integer numMotor;
    @Column(name = "cilindradas")
    private Integer cilindradas;
    @Column(name = "num_cilindros")
    private Integer numCilindros;
    @Column(name = "potencia")
    private Integer potencia;
    @Column(name = "tipo_cambio")
    private String tipoCambio;
    @Column(name = "observacao")
    private String observacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "capacidade_tanque")
    private Double capacidadeTanque;
    @Column(name = "adicionais")
    private String adicionais;
    @Column(name = "media_consumo")
    private Double mediaConsumo;
    @Column(name = "tipo_combustivel")
    private String tipoCombustivel;
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculoId;

    public VeiculoComplementos() {
    }

    public VeiculoComplementos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getAnoFabricado() {
        return anoFabricado;
    }

    public void setAnoFabricado(Integer anoFabricado) {
        this.anoFabricado = anoFabricado;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumRenavam() {
        return numRenavam;
    }

    public void setNumRenavam(Integer numRenavam) {
        this.numRenavam = numRenavam;
    }

    public Integer getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(Integer numMotor) {
        this.numMotor = numMotor;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Integer getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(Integer numCilindros) {
        this.numCilindros = numCilindros;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }

    public Double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(Double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Veiculo getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Veiculo veiculoId) {
        this.veiculoId = veiculoId;
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
        if (!(object instanceof VeiculoComplementos)) {
            return false;
        }
        VeiculoComplementos other = (VeiculoComplementos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "New.VeiculoComplementos[ id=" + id + " ]";
    }
    
}
