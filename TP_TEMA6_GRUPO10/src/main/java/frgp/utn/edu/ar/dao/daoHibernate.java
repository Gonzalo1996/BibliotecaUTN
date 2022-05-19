package frgp.utn.edu.ar.dao;

import org.hibernate.Session;
import frgp.utn.edu.ar.entidad.Autor;
import frgp.utn.edu.ar.entidad.Nacionalidad;
import frgp.utn.edu.ar.dao.ConfigHibernate;

public class daoHibernate {
	
	public static void AgregarAutor(Autor autor) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(autor);
		session.getTransaction().commit();
		ch.cerrarSession();
	}

	public static void AgregarNacionalidad(Nacionalidad nacion) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(nacion);
		session.getTransaction().commit();
		ch.cerrarSession();
	}
}
