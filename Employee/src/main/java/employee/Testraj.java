package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testraj {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		raj r1=new raj();
		
		r1.setId(3);
		r1.setName("rajesh");
		r1.setAge(25);
		r1.setDesignaton("CEO");
		
		et.begin();
		em.persist(r1);
		et.commit();
	}

}
