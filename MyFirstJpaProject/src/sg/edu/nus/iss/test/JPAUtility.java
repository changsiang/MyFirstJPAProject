package sg.edu.nus.iss.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	
	public static final EntityManagerFactory emFactory;
	
	static {
		emFactory = Persistence.createEntityManagerFactory("sg.edu.nus.iss");
	}
	
	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
	
	public static void close() {
		emFactory.close();
	}

}
