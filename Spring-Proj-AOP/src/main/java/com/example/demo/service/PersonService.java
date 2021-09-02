package com.example.demo.service;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Component
public class PersonService {
	public static Logger log=Logger.getLogger("PersonService.class");
	
	@Pointcut("execution(public void com.example.demo.dao.PersonDao.saveEmployee())")
	public void p1() {}
	

//advice
//joinpoint
	//@Before("p1")//joinpoint(@Before is adviice ) and p1 is pointcut
	//before execution of save() plz call beginTx method
	//here save methoid is business method
	//first advice method executed then business method is executed.
	@Before("p1()")
	public void beginTx() {
		log.info("beginTx method starts");
		System.out.println("Tx started");
		
	}
	}
