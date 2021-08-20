package com.aop.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
private static final Logger log = LoggerFactory.getLogger(EmployeeServiceAspect.class);
@Before(value = "execution(* com.aop.demo.service.EmployeeService.*(..)) and args(empid,fname,lname)")
public void beforeAdvice(JoinPoint joinPoint, String empid, String fname, String lname) {
	log.info(lname);
	log.debug(lname);
	log.warn(lname);
	System.out.println("Before Method :" + joinPoint.getSignature());
	System.out.println(fname+" "+lname);
	log.info(lname);
	log.debug(lname);
	log.warn(lname);
	
}
}
