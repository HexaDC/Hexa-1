/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Guilherme Valarelli
 */
@Entity
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculo.findByVeiculoId", query = "SELECT v FROM Veiculo v WHERE v.veiculoId = :veiculoId"),
    @NamedQuery(name = "Veiculo.findByAno", query = "SELECT v FROM Veiculo v WHERE v.ano = :ano"),
    @NamedQuery(name = "Veiculo.findByAnoFabricado", query = "SELECT v FROM Veiculo v WHERE v.anoFabricado = :anoFabricado"),
    @NamedQuery(name = "Veiculo.findByPortas", query = "SELECT v FROM Veiculo v WHERE v.portas = :portas"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculo.findByNumRenavam", query = "SELECT v FROM Veiculo v WHERE v.numRenavam = :numRenavam"),
    @NamedQuery(name = "Veiculo.findByNumMotor", query = "SELECT v FROM Veiculo v WHERE v.numMotor = :numMotor"),
    @NamedQuery(name = "Veiculo.findByCilindradas", query = "SELECT v FROM Veiculo v WHERE v.cilindradas = :cilindradas"),
    @NamedQuery(name = "Veiculo.findByNumCilindros", query = "SELECT v FROM Veiculo v WHERE v.numCilindros = :numCilindros"),
    @NamedQuery(name = "Veiculo.findByPotencia", query = "SELECT v FROM Veiculo v WHERE v.potencia = :potencia"),
    @NamedQuery(name = "Veiculo.findByTipoCambio", query = "SELECT v FROM Veiculo v WHERE v.tipoCambio = :tipoCambio"),
    @NamedQuery(name = "Veiculo.findByObservacao", query = "SELECT v FROM Veiculo v WHERE v.observacao = :observacao"),
    @NamedQuery(name = "Veiculo.findByCapacidadeTanque", query = "SELECT v FROM Veiculo v WHERE v.capacidadeTanque = :capacidadeTanque"),
    @NamedQuery(name = "Veiculo.findByAdicionais", query = "SELECT v FROM Veiculo v WHERE v.adicionais = :adicionais"),
    @NamedQuery(name = "Veiculo.findByMediaConsumo", query = "SELECT v FROM Veiculo v WHERE v.mediaConsumo = :mediaConsumo"),
    @NamedQuery(name = "Veiculo.findByTipoCombustivel", query = "SELECT v FROM Veiculo v WHERE v.tipoCombustivel = :tipoCombustivel"),
    @NamedQuery(name = "Veiculo.findByStatusVtrId", query = "SELECT v FROM Veiculo v WHERE v.statusVtrId = :statusVtrId"),
    @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Veiculo.findByChassi", query = "SELECT v FROM Veiculo v WHERE v.chassi = :chassi"),
    @NamedQuery(name = "Veiculo.findByCodigo", query = "SELECT v FROM Veiculo v WHERE v.codigo = :codigo")})
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "veiculo_id")
    private int veiculoId;
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
    @Column(name = "status_vtr_id")
    private Integer statusVtrId;
    @Column(name = "placa")
    private String placa;
    @Column(name = "chassi")
    private String chassi;
    @Column(name = "codigo")
    private Integer codigo;

    public Veiculo() {
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Veiculo(Integer id, int veiculoId) {
        this.id = id;
        this.veiculoId = veiculoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
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

    public Integer getStatusVtrId() {
        return statusVtrId;
    }

    public void setStatusVtrId(Integer statusVtrId) {
        this.statusVtrId = statusVtrId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "veiculo.Veiculo[ id=" + id + " ]";
    }
    
}
