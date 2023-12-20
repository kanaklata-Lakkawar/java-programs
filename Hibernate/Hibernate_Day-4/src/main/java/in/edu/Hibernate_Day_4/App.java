package in.edu.Hibernate_Day_4;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.edu.Hibernate_Day_4.model.Teacher;


import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
Teacher t=new Teacher(102, "Ved", "Java");
		
		
	Transaction tx = session.beginTransaction();
		
		session.save(t);
		
		tx.commit();
		session.close();
		
		System.out.println("Data inserted");
    }
}
