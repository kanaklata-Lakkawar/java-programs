

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Teacher;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Teacher t=new Teacher(102, "Ram", "Java");
		
		
		Transaction tx = session.beginTransaction();
		
		
        session.save(t);
		tx.commit();
		session.close();
		
		System.out.println("Data inserted");

	}
}
