package co.edu.unbosque.escenario3.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "factura")
public class Factura {

	@Id
	@Column(name = "id")
	private Short id;

	@Column(name = "id_cliente")
	private Short idCliente;

	@Column(name = "id_tpo_fctura")
	private Short idTpoFctura;

	@Column(name = "fcha_fctura")
	private Instant fchaFctura;

	@Column(name = "vlor_brto")
	private Integer vlorBrto;

	@Column(name = "vlor_dscto")
	private Integer vlorDscto;

	@Column(name = "vlor_impsto")
	private Integer vlorImpsto;

	@Column(name = "vlor_nto")
	private Integer vlorNto;

	@Column(name = "sldo_fctura")
	private Integer sldoFctura;

	@Column(name = "estdo_fctura")
	private String estdoFctura;

	public Factura() {
	}

	public Factura(Short id, Short idCliente, Short idTpoFctura, Instant fchaFctura, Integer vlorBrto,
			Integer vlorDscto, Integer vlorImpsto, Integer vlorNto, Integer sldoFctura, String estdoFctura) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idTpoFctura = idTpoFctura;
		this.fchaFctura = fchaFctura;
		this.vlorBrto = vlorBrto;
		this.vlorDscto = vlorDscto;
		this.vlorImpsto = vlorImpsto;
		this.vlorNto = vlorNto;
		this.sldoFctura = sldoFctura;
		this.estdoFctura = estdoFctura;
	}

	// getters y setters...
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Short getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Short idCliente) {
		this.idCliente = idCliente;
	}

	public Short getIdTpoFctura() {
		return idTpoFctura;
	}

	public void setIdTpoFctura(Short idTpoFctura) {
		this.idTpoFctura = idTpoFctura;
	}

	public Instant getFchaFctura() {
		return fchaFctura;
	}

	public void setFchaFctura(Instant fchaFctura) {
		this.fchaFctura = fchaFctura;
	}

	public Integer getVlorBrto() {
		return vlorBrto;
	}

	public void setVlorBrto(Integer vlorBrto) {
		this.vlorBrto = vlorBrto;
	}

	public Integer getVlorDscto() {
		return vlorDscto;
	}

	public void setVlorDscto(Integer vlorDscto) {
		this.vlorDscto = vlorDscto;
	}

	public Integer getVlorImpsto() {
		return vlorImpsto;
	}

	public void setVlorImpsto(Integer vlorImpsto) {
		this.vlorImpsto = vlorImpsto;
	}

	public Integer getVlorNto() {
		return vlorNto;
	}

	public void setVlorNto(Integer vlorNto) {
		this.vlorNto = vlorNto;
	}

	public Integer getSldoFctura() {
		return sldoFctura;
	}

	public void setSldoFctura(Integer sldoFctura) {
		this.sldoFctura = sldoFctura;
	}

	public String getEstdoFctura() {
		return estdoFctura;
	}

	public void setEstdoFctura(String estdoFctura) {
		this.estdoFctura = estdoFctura;
	}
}
