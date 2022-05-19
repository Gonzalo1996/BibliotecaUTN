package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID") 
	private int id;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellido;
	@Column(name="nacionalidad")
	private String nacionalidad;
	@Column(name="email")
	private String email;
	
	public Autor() {}
	
	public Autor(int id,String nombres,String apellido,String nacionalidad, String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombres=" + nombres + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ ", email=" + email + "]";
	}
	
}
