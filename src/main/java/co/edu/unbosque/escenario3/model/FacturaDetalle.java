package co.edu.unbosque.escenario3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {

	@Id
	@Column(name = "id")
	private Short id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_factura")
	private Factura factura;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_elemnto")
	private Elemento elemento;

	@Column(name = "cntdad_elemnto")
	private Integer cntdadElemnto;

	@Column(name = "prcio_untrio")
	private BigDecimal prcioUntrio;

	@Column(name = "vlr_dscto")
	private BigDecimal vlrDscto;

	@Column(name = "vlr_impsto")
	private BigDecimal vlrImpsto;

	public FacturaDetalle() {
	}

	public FacturaDetalle(Short id, Factura factura, Elemento elemento, Integer cntdadElemnto, BigDecimal prcioUntrio,
			BigDecimal vlrDscto, BigDecimal vlrImpsto) {
		super();
		this.id = id;
		this.factura = factura;
		this.elemento = elemento;
		this.cntdadElemnto = cntdadElemnto;
		this.prcioUntrio = prcioUntrio;
		this.vlrDscto = vlrDscto;
		this.vlrImpsto = vlrImpsto;
	}

	// getters y setters
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Integer getCntdadElemnto() {
		return cntdadElemnto;
	}

	public void setCntdadElemnto(Integer cntdadElemnto) {
		this.cntdadElemnto = cntdadElemnto;
	}

	public BigDecimal getPrcioUntrio() {
		return prcioUntrio;
	}

	public void setPrcioUntrio(BigDecimal prcioUntrio) {
		this.prcioUntrio = prcioUntrio;
	}

	public BigDecimal getVlrDscto() {
		return vlrDscto;
	}

	public void setVlrDscto(BigDecimal vlrDscto) {
		this.vlrDscto = vlrDscto;
	}

	public BigDecimal getVlrImpsto() {
		return vlrImpsto;
	}

	public void setVlrImpsto(BigDecimal vlrImpsto) {
		this.vlrImpsto = vlrImpsto;
	}
}
