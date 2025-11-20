package co.edu.unbosque.escenario3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "unidad")
public class Unidad {

	@Id
	@Column(name = "id")
	private Short id;

	@Column(name = "nmbre_undad")
	private String nmbreUndad;

	@Column(name = "estdo_undad")
	private String estdoUndad;

	public Unidad() {
	}

	public Unidad(Short id, String nmbreUndad, String estdoUndad) {
		super();
		this.id = id;
		this.nmbreUndad = nmbreUndad;
		this.estdoUndad = estdoUndad;
	}

	// getters/setters
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getNmbreUndad() {
		return nmbreUndad;
	}

	public void setNmbreUndad(String nmbreUndad) {
		this.nmbreUndad = nmbreUndad;
	}

	public String getEstdoUndad() {
		return estdoUndad;
	}

	public void setEstdoUndad(String estdoUndad) {
		this.estdoUndad = estdoUndad;
	}
}
