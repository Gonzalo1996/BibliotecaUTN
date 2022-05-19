package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biblioteca implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Descripcion")
	private String descrip;
	
	public Biblioteca() {}
	
	public Biblioteca(int id, String descrip) {
		this.id = id;
		this.descrip = descrip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", descrip=" + descrip + "]";
	}
	
}
