package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Department;
import domain.Developper;
import domain.Employee;
import domain.Priority;
import domain.Status;
import domain.Task;

public class TestProduct {

	
	private EntityManager manager;

    public TestProduct(EntityManager manager) {
        this.manager = manager;
    }
	public static void main(String[] args) {
		
		EntityManagerFactory factory =   
	              Persistence.createEntityManagerFactory("Product");
	        EntityManager manager = factory.createEntityManager();
	        TestProduct Product = new TestProduct(manager);

	        EntityTransaction tx = manager.getTransaction();
	        tx.begin();
	        try {
	        	Product.createTask();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        tx.commit();

	       // Product.listTask();
	        
	        manager.close();
	        System.out.println(".. done");
	}
	  
	  private void createTask(){
		  int numTask = manager.createQuery("SELECT * FROM Tast t",Task.class).getResultList().size();
		  if(numTask==0){
			  List<Developper> Developper = new ArrayList<Developper>();
			  Priority P= new Priority("P1");
			  Status S = new Status("S1");
			  manager.persist(Developper);
			  manager.persist(new Task("Jakab Gipsz",S,P,Developper));
		  }
	  }
	
	

}
