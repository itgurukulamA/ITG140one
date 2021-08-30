package com.example.demo.test;

import java.util.ArrayList;  


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class StoreData {  
public static void main(String[] args) {  
   
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	
    Transaction t=session.beginTransaction();  
      
    Answer ans1=new Answer();  
    ans1.setAnswername("Java is a programming language");  
    ans1.setPostedBy("Ravi Malik");  
      
    Answer ans2=new Answer();  
    ans2.setAnswername("Java is a platform");  
    ans2.setPostedBy("Sudhir Kumar");  
      
    Answer ans3=new Answer();  
    ans3.setAnswername("Servlet is an Interface");  
    ans3.setPostedBy("Jai Kumar");  
}
}