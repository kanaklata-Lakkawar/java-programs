package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
Configuration cfg= new Configuration();
cfg.configure("teacher.hbm.xml");


SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();

Teacher t=new Teacher(101,"Ram","Java");
Transaction tx = session.beginTransaction();

session.save(t);


	}
}
