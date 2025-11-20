package co.edu.unbosque.escenario3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_producto")
public class Categoria {

	@Id
	private int id;

	@Column(name = "nmbre_ctgria")
	private String nmbreCtgria;

	@Column(name = "estdo_ctgria")
	private String estdoCtgria; // o char, según tu BD

	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(int id, String nmbreCtgria, String estdoCtgria) {
		super();
		this.id = id;
		this.nmbreCtgria = nmbreCtgria;
		this.estdoCtgria = estdoCtgria;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNmbreCtgria() {
		return nmbreCtgria;
	}

	public void setNmbreCtgria(String nmbreCtgria) {
		this.nmbreCtgria = nmbreCtgria;
	}

	public String getEstdoCtgria() {
		return estdoCtgria;
	}

	public void setEstdoCtgria(String estdoCtgria) {
		this.estdoCtgria = estdoCtgria;
	}
}
