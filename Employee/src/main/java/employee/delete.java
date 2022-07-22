package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {

	public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("uday");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        raj r1=entityManager.find(raj.class,1);
        
        if(r1!=null)
        {
        	entityTransaction.begin();
        	entityManager.remove(r1);
        	entityTransaction.commit();
        }
        else
        {
        	System.out.println("no record to delete");
        }
	}

}
