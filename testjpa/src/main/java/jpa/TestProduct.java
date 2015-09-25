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
	
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Product" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	        Priority P1 = new Priority( ); 
	        P1.setId((long) 1);
	        P1.setName("P1");
	        
	        Status S1 = new Status();
	        S1.setId((long) 1);
	        S1.setName("S1");
	        
	        entitymanager.persist(P1);
	        entitymanager.persist(S1);
	        entitymanager.getTransaction( ).commit( );
	        entitymanager.close( );
	        emfactory.close( );
	        
	}
	  
	  private void createTask(){
		  int numTask = manager.createQuery("SELECT t FROM Tast t",Task.class).getResultList().size();
		  if(numTask==0){
			  List<Developper> Developper = new ArrayList<Developper>();
			  Priority P= new Priority("P1");
			  Status S = new Status("S1");
			  manager.persist(Developper);
			  manager.persist(new Task());
		  }
	  }
	
	

}
