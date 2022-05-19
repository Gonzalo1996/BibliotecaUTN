package frgp.utn.edu.ar.entidad;

import java.io.Serializable;

//import javax.imageio.spi.ServiceRegistry;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


@Entity
public class Genero implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Descripcion")
	private String descrip;
	
	public Genero() {}
	
	public Genero(int id, String descrip) {
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
		return "Genero [id=" + id + ", descrip=" + descrip + "]";
	}

	public void GuardarGenero(Genero gen) {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        session.save(gen);
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
	}
	
}
