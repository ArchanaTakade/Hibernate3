package com.archana;

import java.util.Arrays;

//import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.archana.model.Batch;
//import com.archana.model.Student;
import com.archana.model.Student1;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration().configure()
	               .addAnnotatedClass(Student1.class)
                   .addAnnotatedClass(Batch.class);
        SessionFactory sf = cfg.buildSessionFactory();
                         
        Session session = sf.openSession();
                      
         session.beginTransaction();
         
         //-------------------------
       
         Batch b1 = new Batch(51,"core java","Avinash");
        Batch b2 = new Batch(52,"UI","Vinod");
        Batch b3 = new Batch(53,"Fullstack","Vinod");
         
         session.save(b1);
         session.save(b2);
         session.save(b3);
         
         Student1 s1 = new Student1();
         
        s1.setRollNo(1);
         s1.setName("Don");
         s1.setMobile(1111);
         
         
         
         
        java.util.List<Batch> batches1 =  Arrays.asList(b1,b2);
         
         s1.setBatches(batches1);
         
        session.save(s1);
         
         Student1 s2 = new Student1();
         s2.setRollNo(2);
         s2.setName("ramu");
         s2.setMobile(1212);
         
         java.util.List<Batch> batches2 =  Arrays.asList(b1,b2,b3);
         
         s2.setBatches(batches2);
         session.save(s2);
         
         
      
         
        
         //-------------------------------
         
         session.getTransaction().commit();
         session.close();
    }
}
