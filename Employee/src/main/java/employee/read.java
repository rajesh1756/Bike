package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class read {

	public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
      EntityManager entityManager=entityManagerFactory.createEntityManager();
       
      raj r1= entityManager.find(raj.class, 1);
      
      if(r1!=null)
      {
    	System.out.println(r1.getId());
    	System.out.println(r1.getName());
    	System.out.println(r1.getDesignaton());
      }
      else
      {
    	  System.out.println("no data found");
      }
	}

}
