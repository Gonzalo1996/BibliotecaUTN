package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nacionalidad implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="descripcion")
	private String descripcion;
	
	public Nacionalidad() {}
	
	public Nacionalidad(int id, String desc) {
		super();
		this.id = id;
		this.descripcion = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Nacionalidad [id=" + id + ", descripcion=" + descripcion + "]";
	}
}
