package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.Genero;
import frgp.utn.edu.ar.entidad.Libro;
import frgp.utn.edu.ar.entidad.Autor;
import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Nacionalidad;
import frgp.utn.edu.ar.dao.ConfigHibernate;

public class daoHibernate {
	
	/*==================== Autor =========================*/
	public static void AgregarAutor(Autor autor) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(autor);
		session.getTransaction().commit();
		ch.cerrarSession();
	}

	public static Autor LeerAutorPos(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Autor autor=(Autor)session.get(Autor.class,id);
        
        config.cerrarSession();
        
        return autor;
	}
	
	public static void ModificarAutor(Autor autor)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(autor);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void EliminarAutor(Autor autor) //Este usuario tiene que venir cargado el ID del usuario que se quiere eliminar
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(autor);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
	/*==================== Fin Autor =========================*/
	
	/*==================== Nacionalidad ======================*/
	
	public static void AgregarNacionalidad(Nacionalidad nacion) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(nacion);
		session.getTransaction().commit();
		ch.cerrarSession();
	}
	
	public static Nacionalidad LeerNacionPos(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Nacionalidad nacion=(Nacionalidad)session.get(Nacionalidad.class,id);
        
        config.cerrarSession();
        
        return nacion;
	}
	
	public static void ModificarNacion(Nacionalidad nacion)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(nacion);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void EliminarNacion(Nacionalidad nacion) //Este usuario tiene que venir cargado el ID del usuario que se quiere eliminar
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(nacion);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
	/*==================== Fin Nacionalidad ======================*/
	//Genero----------------------------------
	public static void AgregarGenero(Genero Gen)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(Gen);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static Genero LeerGeneroPos(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Genero Gen=(Genero)session.get(Genero.class,id);
        
        config.cerrarSession();
        
        return Gen;
	}
	
	public static void ModificarGenero(Genero gen)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(gen);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void EliminarGenero(Genero gen) //Este usuario tiene que venir cargado el ID del usuario que se quiere eliminar
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(gen);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
	//Fin de Genero---------------------------
	
	//Libro----------------------------------
	public static void AgregarLibro(Libro Lib)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(Lib);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static Libro LeerLibroPos(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        Libro Lib=(Libro)session.get(Libro.class,id);
        
        config.cerrarSession();
        
        return Lib;
	}
	
	public static void ModificarLibro(Libro Lib)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(Lib);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void EliminarLibro(Libro Lib) //Este usuario tiene que venir cargado el ID del usuario que se quiere eliminar
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(Lib);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
	//Fin de Libro---------------------------
	
	//Biblioteca----------------------------------
	public static void AgregarBiblioteca(Biblioteca Bib )
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(Bib);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static Biblioteca LeerBibliotecaoPos(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Biblioteca Bib=(Biblioteca)session.get(Biblioteca.class,id);
        
        config.cerrarSession();
        
        return Bib;
	}
	
	public static void ModificarBiblioteca(Biblioteca Bib)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(Bib);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void EliminarBiblioteca(Biblioteca Bib)
	{	
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(Bib);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
	//Fin de Biblioteca---------------------------
	
}