package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneUnidirectional {
	
	public static void main(String [] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		//One Employee
		Employee emp1 = new Employee();
		emp1.setEmpname("Deepal Rajput");
		
		Employee emp2 = new Employee();
		emp2.setEmpname("Pratik Gosavi");
		
		//First address
		Address a1=new Address();
		a1.setPincode(422002);
		a1.setArea("Nashik Road");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		//Second Address
		Address a2=new Address();
		a2.setPincode(425408);
		a2.setArea("Amrutdham");
		a2.setCity("Pune");
		a2.setState("Maharashtra");
		
		emp1.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		System.out.println("Data added Successfully");
		em.close();
		
		factory.close();
	}

}
