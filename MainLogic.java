package com.mondee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student soumya =new Student();
		soumya.setSid(103);
		soumya.setSname("soumya");
		soumya.setSmarks(450);
		
		se.save(soumya);
		tx.commit();
		se.close();
	}

}