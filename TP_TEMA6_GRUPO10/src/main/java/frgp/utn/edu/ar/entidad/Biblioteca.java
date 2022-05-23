package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.Cascade;

@Entity
public class Biblioteca implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Libro")
	private String libro;
	@Column(name="FechadeAlta")
	private String fechaalta;
	@Column(name="Estado")
	private String estado;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name= "ISBN")
	private Libro Libro;
	
	public Biblioteca(int id, String libro, String fechaalta, String estado, frgp.utn.edu.ar.entidad.Libro libro2) {
		super();
		this.id = id;
		this.libro = libro;
		this.fechaalta = fechaalta;
		this.estado = estado;
		Libro = libro2;
	}

	public void setLibro(Libro libro) {
		Libro = libro;
	}

	public Biblioteca() {}
	
	public Biblioteca( String libro,String fechaalta,String Estado) {
			this.libro = libro;
		this.fechaalta= fechaalta;
		this.estado= Estado;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", libro=" + libro + ", fechaalta=" + fechaalta + ", estado=" + estado + "]";
	}
	
}
