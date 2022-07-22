package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateraj {

	public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction=entityManager.getTransaction();
      
      raj r1=new raj();
		
		r1.setId(2);
		r1.setName("abd");
		r1.setAge(25);
		r1.setDesignaton("CEO");
		
		entityTransaction.begin();
		entityManager.merge(r1);
		entityTransaction.commit();
	}

}
