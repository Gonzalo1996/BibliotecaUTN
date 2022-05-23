package frgp.utn.edu.ar;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import frgp.utn.edu.ar.dao.daoHibernate;
import frgp.utn.edu.ar.entidad.Autor;
import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Genero;
import frgp.utn.edu.ar.entidad.Libro;
import frgp.utn.edu.ar.entidad.Nacionalidad;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        boolean b = true;
        while(b) {
        	System.out.print("-----------Biblioteca------------\n");
        	System.out.print("1) Alta\n");
        	System.out.print("2) Baja\n");
        	System.out.print("3) Modificacion\n");
        	System.out.print("4) Listado\n");
        	System.out.print("5) Cargar Datos Base\n");
        	System.out.print("-----------------------------\n");
        	System.out.print("0) Salir\n");
        	
        	Scanner Lec = new Scanner(System.in);
        	System.out.print("Ingrese un valor: ");
        	int N = Lec.nextInt();
        	Lec.close();
        	
        	switch (N) {
			case 1: 
					//MenuAlta();
				break;
			case 2:
					//MenuBaja();
				break;
			case 3:
					//MenuModificacion();
				break;
			case 4:
					//MenuListado();
				break;
			case 5: 
					CargarDatos();
				break;
			case 0:
				break;
				
			default:System.out.print("-----------------------------");
					System.out.print("--El valor ingreado tiene que ser 1 o 2--");
					System.out.print("-----------------------------");
				break;
			}
        
        }    
        
    }
        
    public static void MenuPrincipal() {
    	   boolean b = true;
           while(b) {
           	System.out.print("-----------Biblioteca------------\n");
           	System.out.print("1) Alta\n");
           	System.out.print("2) Baja\n");
           	System.out.print("3) Modificacion\n");
           	System.out.print("4) Listado\n");
           	System.out.print("-----------------------------\n");
           	System.out.print("0) Salir\n");
           	
           	Scanner Lec = new Scanner(System.in);
           	System.out.print("Ingrese un valor: ");
           	int N = Lec.nextInt();
           	Lec.close();
           	
           	switch (N) {
   			case 1: 
   					//MenuAlta();
   				break;
   			case 2:
   					//MenuBaja();
   				break;
   			case 3:
   					//MenuModificacion();
   				break;
   			case 4:
   					//MenuListado();
   				break;
   			case 0:
   				break;
   				
   			default:System.out.print("-----------------------------");
   					System.out.print("--El valor ingreado tiene que ser 1 o 2--");
   					System.out.print("-----------------------------");
   				break;
   			}
           
           }   
    }
  
    public static void CargarDatos() {
    	//Agregar autores nuevos nuevos nuevos
    	Autor arrayAutor[] = new Autor[5];
    	
    	arrayAutor[0] = new Autor(1,"Gabriel García","Márquez","Colombia","marquez@outlock.com");
    	arrayAutor[1] = new Autor(2,"Jorge Luis","Borges","Argentina","borges@gmail.com");
    	arrayAutor[2] = new Autor(3,"Stephen Edwin","King","Estados Unidos","king@gmail.com");
    	arrayAutor[3] = new Autor(4,"Julio","Cortazar","Argentina","cortazar@outlock.com");
    	arrayAutor[4] = new Autor(5,"Joanne","Rowling","Reino Unido","rowling@gmail.com");
    	
    	daoHibernate.AgregarAutor(arrayAutor[0]);
    	daoHibernate.AgregarAutor(arrayAutor[1]);
    	daoHibernate.AgregarAutor(arrayAutor[2]);
    	daoHibernate.AgregarAutor(arrayAutor[3]);
    	daoHibernate.AgregarAutor(arrayAutor[4]);
    	
    	Nacionalidad arrayNacion[] = new Nacionalidad[5];
    	
    	arrayNacion[0] = new Nacionalidad(1,"Argentina");
    	arrayNacion[1] = new Nacionalidad(2,"Estados Unidos");
    	arrayNacion[2] = new Nacionalidad(3,"Colombia");
    	arrayNacion[3] = new Nacionalidad(4,"Reino Unido");
    	arrayNacion[4] = new Nacionalidad(5,"Canadá");
    	
    	daoHibernate.AgregarNacionalidad(arrayNacion[0]);
    	daoHibernate.AgregarNacionalidad(arrayNacion[1]);
    	daoHibernate.AgregarNacionalidad(arrayNacion[2]);
    	daoHibernate.AgregarNacionalidad(arrayNacion[3]);
    	daoHibernate.AgregarNacionalidad(arrayNacion[4]);
    	/////Prueba
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        /*
        Autor autor = new Autor();
        
        autor.setId(1);
        autor.setNombres("Gonzalo Abraham");
        autor.setApellido("Alderete");
        autor.setNacionalidad("Argentino");
        autor.setEmail("gonzalo@gmail.com");
        
        session.save(autor);
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        */
        Libro lib = new Libro( 1, "Las aventuras del emperador", "12/04/1980", "Español", 350, "Gonzalo Abraham", "es un libro para toda la familia", 3);
        daoHibernate.AgregarLibro(lib);
        
        Libro lib2 = new Libro( 2,"Las mil y una noches con ella", "12/06/1990", "Español", 407, "Alderete", "libro romantico para jovenes adolocentes", 2);
        daoHibernate.AgregarLibro(lib2);
       
        Libro lib3 = new Libro(3, "Noches de terror", "12/06/2006", "Español", 290, "Stephen Edwin", "libro de terror para no dormir", 1);
        daoHibernate.AgregarLibro(lib3);
        
        Libro lib4 = new Libro(4, "una vida en 365 dias", "12/06/2007", "Español", 555, "Alderete", "una historia que te hara valorar la vida", 5);
        daoHibernate.AgregarLibro(lib4);
        
        Libro lib5 = new Libro(5, "Historias para no dormi", "04/08/2000", "Español", 1324, "Jorge Luis", "Historias para helarte la sangre", 1);
        daoHibernate.AgregarLibro(lib5);
       
        Genero gen = new Genero(1,"Terror");
        daoHibernate.AgregarGenero(gen);
        
        Genero gen2 = new Genero(2,"Romance");
        daoHibernate.AgregarGenero(gen2);
        
        Genero gen3 = new Genero(3,"Aventura");
        daoHibernate.AgregarGenero(gen3);
        
        Genero gen4 = new Genero(4, "Ficcion");
        daoHibernate.AgregarGenero(gen4);
        
        Genero gen5 = new Genero(5, "Drama");
        daoHibernate.AgregarGenero(gen5);
        
       // Agregar biblioteca nueva 
        Biblioteca bib = new Biblioteca(1, "Las aventuras del Emperador", "12/5/2022", "Disponible", lib);
        daoHibernate.AgregarBiblioteca(bib);
        
        Biblioteca bib2 = new Biblioteca(2, "Las mil y una noches con ella", "12/5/2022", " NO Disponible", lib2);
        daoHibernate.AgregarBiblioteca(bib2);
        
        Biblioteca bib3 = new Biblioteca(2, "Noches de terror", "12/5/2022", " NO Disponible", lib3);
        daoHibernate.AgregarBiblioteca(bib3);
        
        Biblioteca bib4 = new Biblioteca(2, "una vida en 365 dias", "12/5/2022", "Disponible", lib4);
        daoHibernate.AgregarBiblioteca(bib4);
        
        Biblioteca bib5 = new Biblioteca(3, "Historias para no dormir", "12/5/2022", "Disponible", lib5);
        daoHibernate.AgregarBiblioteca(bib5);
    	/*
    	Autor autor1 = new Autor();
    	Autor autor2 = new Autor();
    	Autor autor3 = new Autor();
    	Autor autor4 = new Autor();
    	Autor autor5 = new Autor();
    	
    	autor1.setId(1);
    	autor1.setNombres("Gonzalo Abraham");
    	autor1.setApellido("Alderete");
    	autor1.setNacionalidad("Argentino");
    	autor1.setEmail("gonza@gmail.com");
    	
    	autor2.setId(2);
    	autor2.setNombres("Gaston");
    	autor2.setApellido("Perez");
    	autor2.setNacionalidad("Argentino");
    	autor2.setEmail("perez@gmail.com");
    	*/

    	
    	/*
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Autor autor = new Autor();
        
        autor.setId(1);
        autor.setNombres("Gonzalo Abraham");
        autor.setApellido("Alderete");
        autor.setNacionalidad("Argentino");
        autor.setEmail("gonzalo@gmail.com");
        
        session.save(autor);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        */
        //MenuPrincipal();
    }
    
    
}
