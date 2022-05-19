package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/*
import frgp.utn.edu.ar.Configuration;
import frgp.utn.edu.ar.ServiceRegistry;
import frgp.utn.edu.ar.ServiceRegistryBuilder;
import frgp.utn.edu.ar.Session;
import frgp.utn.edu.ar.SessionFactory;
*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@Entity
public class Libro implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ISMB")
	private int isbm;
	@Column(name="Titulo")
	private String titulo;
	@Column(name="FechaLansa")
	private String fechaLansa;
	@Column(name="Idioma")
	private String idioma;
	@Column(name="CantPag")
	private int cantPag;
	@Column(name="Autor")
	private String autor;
	@Column(name="Descripcion")
	private String descrip;
	@Column(name="Genero")
	private int genero;
	
	public Libro() {}
	
	public Libro(int ismb, String titulo, String fechaLansa, String idioma, int cantPag, String autor, String descrip, int genero) {
		super();
		this.isbm = ismb;
		this.titulo = titulo;
		this.fechaLansa = fechaLansa;
		this.idioma = idioma;
		this.cantPag = cantPag;
		this.autor = autor;
		this.descrip = descrip;
		this.genero = genero;
	}
	
	public int getIsbn() {
		return isbm;
	}

	public void setIsbn(int isbm) {
		this.isbm = isbm;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getFechaLansa() {
		return fechaLansa;
	}

	public void setFechaLansa (String fechaLansa) {
		this.fechaLansa = fechaLansa;
	}
	
	public String getIdioma () {
		return idioma;
	}
	
	public void SetIdioma (String idioma) {
		this.idioma = idioma;
	}
	
	public int getCantPag() {
		return cantPag;
	}
	
	public void setCantPag(int cantPag) {
		this.cantPag = cantPag;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getGenero() {
		return genero;
	}
	
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public String getDescripcion() {
		return descrip;
	}

	public void setDescripcion(String descripcion) {
		this.descrip = descripcion;
	}
	

	@Override
	public String toString() {
		return "Libro [isbm=" + isbm + ", titulo=" + titulo + ", fechaLansa=" + fechaLansa + ", idioma=" + idioma
				+ ", cantPag=" + cantPag + ", autor=" + autor + ", descrip=" + descrip + ", genero=" + genero + "]";
	}
	
	public void GuardarLibro(Libro lib) {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        session.save(lib);
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
	}

	
}
