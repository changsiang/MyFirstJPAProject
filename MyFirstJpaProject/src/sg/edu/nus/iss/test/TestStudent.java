package sg.edu.nus.iss.test;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sg.edu.nus.iss.Model.student;

public class TestStudent {

	public static void main(String[] args) {
		EntityManager eManager = JPAUtility.getEntityManager();
		student s1 = new student(4, "Hello", "He");
		student s2 = new student(5, "World", "Wld");
		eManager.getTransaction().begin();
		eManager.persist(s1);
		eManager.persist(s2);
		eManager.getTransaction().commit();
		
		Query query = eManager.createQuery("from student");
		for (Iterator<student> iterator = query.getResultList().iterator(); iterator.hasNext();) {
			student student = (student) iterator.next();
			System.out.println(student.toString());
		}
		
		eManager.close();

	}
	

}
