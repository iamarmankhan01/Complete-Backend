package com.app.arman.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.app.arman.entity.Employee;

public class TestOperations {

	public static void main(String[] args) {
		EntityTransaction tx = null;
		try {
			//1. (Loads Driver, Creates DB Connections, Prepare stmt)
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB"); //EMF is interface
			System.out.println(emf.getClass().getName()); //to see the implementation class of interface
			
			//2. (TODO Operations--insert, update,....)
			EntityManager em = emf.createEntityManager(); //EM is interface
			System.out.println(em.getClass().getName());  //to see the implementation class
			
			//3. create Transaction
			tx = em.getTransaction();                      //EM is interface
			System.out.println(tx.getClass().getName());  //to see the implementation class
			//4. Start Transaction
			tx.begin();
			
			//5. Perform operation
			//save data into DB
			Employee emp = new Employee();
			emp.setEmpId(10);
			emp.setEmpName("ABC");
			emp.setEmpSal(500.0);
			
			em.persist(emp); //SQL: INSERT INTO ...
			
			//6. commit
			tx.commit();
			
			//7. close
			emf.close();
		} catch (Exception e) {
			//rollback if any problem
			tx.rollback();
			e.printStackTrace();
		}
	
	}
}

