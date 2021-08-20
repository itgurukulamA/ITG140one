package com.example.demo.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect 
{

private static final Logger log = LoggerFactory.getLogger(ServiceAspect.class);
@Before(value="execution(* com.example.demo.services.SignupService.signup(..))")
public void beforeAdvice(JoinPoint jointPoint) {
	log.info("dsaf");
	System.out.println("hello");
}
}
