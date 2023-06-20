package com.archana.model;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App1 {

	public static void main(String[] args) {
		
	
	Configuration cfg = new Configuration().configure()
			.addAnnotatedClass(Student1.class)
			.addAnnotatedClass(Batch.class);
	SessionFactory sf = cfg.buildSessionFactory();
	
	Session s = sf .openSession();
	s.beginTransaction();
	
	
	Batch b = new Batch(51,"core java","Avinash");
	Batch b1 = new Batch(52,"UI UX","vinod sir");
	Batch b2 = new Batch(53,"FullStack","vinod");
	
	s.save(b);
	s.save(b1);
	s.save(b2);
	
	 Student1 s1 = new Student1();
	 s1.setRollNo(121);
	 s1.setName("vinod");
	 s1.setMobile(4522262);
	 
	 List <Batch> batches= Arrays.asList(b,b1);
	 
	 s1.setBatches(batches);
	 s.save(s1);
	 
	 Student1 s2 = new Student1();
	 s2.setRollNo(131);
	 s2.setName("archana");
	 s2.setMobile(4785965);
	 
	 List <Batch> batches1= Arrays.asList(b,b1,b2);
	 
	 s1.setBatches(batches1);
	 s.save(s2);
	 
	 
	 s.getTransaction().commit();
	 s.close();
	
	}
	
}