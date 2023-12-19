import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Teacher;

public class Test {

	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		
		Transaction tx = session.beginTransaction();
		
		
		Query query=session.createQuery("from model.Teacher");
		
		ArrayList<Teacher> tl=(ArrayList<Teacher>)query.list();
		
		
		for(Teacher t:tl)
		{
			System.out.println(t);
		}
		
		tx.commit();
		session.close();
		
		System.out.println("Data inserted");
		
		
		
		
	}

}
