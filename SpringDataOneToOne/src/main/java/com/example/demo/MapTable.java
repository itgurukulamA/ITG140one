package com.example.demo;

import java.lang.module.Configuration;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MapTable {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernatecfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question qu1=new Question();
		qu1.setQuestionId(12);
		qu1.setQuestion("what is java");
		
		Answer aw1=new Answer();
		aw1.setAnswer_id(343);
		aw1.setAnswer("java is a programming language");
		
		Question qu2=new Question();
		qu1.setQuestionId(123);
		qu1.setQuestion("what is java");
		
		Answer aw2=new Answer();
		aw1.setAnswer_id(349);
		aw1.setAnswer("java is a object oriented language");
		
		qu1.setAnswer(aw1);
		//for save we rusing Session object
		
		Session s =factory.openSession();
		Transaction tx=(Transaction) s.beginTransaction();
		
		s.save(qu1);
		s.save(qu2);
		
		tx.commit();
		s.close();
		
		
		
		
	}

}
