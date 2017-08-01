package tests;

import java.util.GregorianCalendar;
import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.web.modelo.Empleado;

public class TestEmpleados {

	private static EntityManager manager;
	
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		/* Crear el gestor de persistencia (EM) */
		emf = Persistence.createEntityManagerFactory("JPA-Gestor");
		manager = emf.createEntityManager();
		
//		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
//		System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
		
		Empleado e = new Empleado(10L, "Perez", "Pepito", new GregorianCalendar(1979,6,6).getTime());
//		Empleado e2 = new Empleado(25L, "Gomez", "Alfonso", new GregorianCalendar(1979,6,6).getTime());
		manager.getTransaction().begin();
		manager.persist(e);
//		manager.persist(e2);
		manager.getTransaction().commit();
		
		imprimirTodo();
	}
	
	@SuppressWarnings("unchecked")
	private static void imprimirTodo() {
		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En esta base de datos hay " + empleados.size() + " empleados.");
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
	}

}
