package co.edu.unbosque.escenario3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "elemento")
public class Elemento {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "sku_elemnto")
	private String skuElemnto;

	@Column(name = "nmbre_elemnto")
	private String nmbreElemnto;

	@Column(name = "lote_elemnto")
	private String loteElemnto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ctgria_elemnto")
	private Categoria ctgriaElemnto;

	@Column(name = "und_elemnto")
	private Short undElemnto;

	@Column(name = "exstncia_elemnto")
	private Integer exstnciaElemnto;

	@Column(name = "prsntacion_elemnto")
	private String prsntacionElemnto;

	@Column(name = "lbrtorio_elemnto")
	private String lbrtorioElemnto;

	@Column(name = "cntrolado_elemnto")
	private String cntroladoElemnto;

	@Column(name = "bdga_elemnto")
	private Integer bdgaElemnto;

	@Column(name = "precio_venta_ac")
	private Double precioVentaAc;

	@Column(name = "precio_venta_an")
	private Double precioVentaAn;

	@Column(name = "costo_venta")
	private Double costoVenta;

	@Column(name = "mrgen_utldad")
	private Double mrgenUtldad;

	@Column(name = "tiene_iva")
	private String tieneIva;

	@Column(name = "stock_minimo")
	private Integer stockMinimo;

	@Column(name = "stock_maximo")
	private Integer stockMaximo;

	@Column(name = "estdo_elmnto")
	private String estdoElemnto;

	public Elemento() {
	}

	public Elemento(Integer id, String skuElemnto, String nmbreElemnto, String loteElemnto, Categoria ctgriaElemnto,
			Short undElemnto, Integer exstnciaElemnto, String prsntacionElemnto, String lbrtorioElemnto,
			String cntroladoElemnto, Integer bdgaElemnto, Double precioVentaAc, Double precioVentaAn, Double costoVenta,
			Double mrgenUtldad, String tieneIva, Integer stockMinimo, Integer stockMaximo, String estdoElemnto) {
		super();
		this.id = id;
		this.skuElemnto = skuElemnto;
		this.nmbreElemnto = nmbreElemnto;
		this.loteElemnto = loteElemnto;
		this.ctgriaElemnto = ctgriaElemnto;
		this.undElemnto = undElemnto;
		this.exstnciaElemnto = exstnciaElemnto;
		this.prsntacionElemnto = prsntacionElemnto;
		this.lbrtorioElemnto = lbrtorioElemnto;
		this.cntroladoElemnto = cntroladoElemnto;
		this.bdgaElemnto = bdgaElemnto;
		this.precioVentaAc = precioVentaAc;
		this.precioVentaAn = precioVentaAn;
		this.costoVenta = costoVenta;
		this.mrgenUtldad = mrgenUtldad;
		this.tieneIva = tieneIva;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
		this.estdoElemnto = estdoElemnto;
	}

	// getters y setters (todos)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSkuElemnto() {
		return skuElemnto;
	}

	public void setSkuElemnto(String skuElemnto) {
		this.skuElemnto = skuElemnto;
	}

	public String getNmbreElemnto() {
		return nmbreElemnto;
	}

	public void setNmbreElemnto(String nmbreElemnto) {
		this.nmbreElemnto = nmbreElemnto;
	}

	public String getLoteElemnto() {
		return loteElemnto;
	}

	public void setLoteElemnto(String loteElemnto) {
		this.loteElemnto = loteElemnto;
	}

	public Categoria getCtgriaElemnto() {
		return ctgriaElemnto;
	}

	public void setCtgriaElemnto(Categoria ctgriaElemnto) {
		this.ctgriaElemnto = ctgriaElemnto;
	}

	public Short getUndElemnto() {
		return undElemnto;
	}

	public void setUndElemnto(Short undElemnto) {
		this.undElemnto = undElemnto;
	}

	public Integer getExstnciaElemnto() {
		return exstnciaElemnto;
	}

	public void setExstnciaElemnto(Integer exstnciaElemnto) {
		this.exstnciaElemnto = exstnciaElemnto;
	}

	public String getPrsntacionElemnto() {
		return prsntacionElemnto;
	}

	public void setPrsntacionElemnto(String prsntacionElemnto) {
		this.prsntacionElemnto = prsntacionElemnto;
	}

	public String getLbrtorioElemnto() {
		return lbrtorioElemnto;
	}

	public void setLbrtorioElemnto(String lbrtorioElemnto) {
		this.lbrtorioElemnto = lbrtorioElemnto;
	}

	public String getCntroladoElemnto() {
		return cntroladoElemnto;
	}

	public void setCntroladoElemnto(String cntroladoElemnto) {
		this.cntroladoElemnto = cntroladoElemnto;
	}

	public Integer getBdgaElemnto() {
		return bdgaElemnto;
	}

	public void setBdgaElemnto(Integer bdgaElemnto) {
		this.bdgaElemnto = bdgaElemnto;
	}

	public Double getPrecioVentaAc() {
		return precioVentaAc;
	}

	public void setPrecioVentaAc(Double precioVentaAc) {
		this.precioVentaAc = precioVentaAc;
	}

	public Double getPrecioVentaAn() {
		return precioVentaAn;
	}

	public void setPrecioVentaAn(Double precioVentaAn) {
		this.precioVentaAn = precioVentaAn;
	}

	public Double getCostoVenta() {
		return costoVenta;
	}

	public void setCostoVenta(Double costoVenta) {
		this.costoVenta = costoVenta;
	}

	public Double getMrgenUtldad() {
		return mrgenUtldad;
	}

	public void setMrgenUtldad(Double mrgenUtldad) {
		this.mrgenUtldad = mrgenUtldad;
	}

	public String getTieneIva() {
		return tieneIva;
	}

	public void setTieneIva(String tieneIva) {
		this.tieneIva = tieneIva;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public Integer getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(Integer stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public String getEstdoElemnto() {
		return estdoElemnto;
	}

	public void setEstdoElemnto(String estdoElemnto) {
		this.estdoElemnto = estdoElemnto;
	}
}
