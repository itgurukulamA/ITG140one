package com.aop.demo.aspect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.aop.demo.model.Employee;
@Aspect
@Component
public class EmployeeServiceAspect {
private static final Logger log = LoggerFactory.getLogger(EmployeeServiceAspect.class);

@Before(value = "execution(* com.aop.demo.service.EmployeeService.*(..)) and args(emp)")
public void beforeAdvice(JoinPoint joinPoint,Employee emp) {
	Field[] field=emp.getClass().getDeclaredFields();
	Method[] method=emp.getClass().getDeclaredMethods();
	for (int i=0;i<field.length;i++) {
		String var=field[i].toString();
		String typeField =field[i].getType().toString();
		String type = typeField.substring(typeField.lastIndexOf('.')+1,typeField.length());
		System.out.println(var.substring(var.lastIndexOf('.')+1,var.length())+ " and type is "+ type);	
		log.info(var.substring(var.lastIndexOf('.')+1,var.length())+": "+ type);
		}
	for (int i=0;i<method.length;i++) {
		String var=method[i].toString();
		System.out.println(var);
		}
	System.out.println("Before Method: " + joinPoint.getSignature());
	}
@After(value = "execution(* com.aop.demo.service.EmployeeService.*(..)) and args(emp)")
public void afterAdvice(JoinPoint joinPoint,Employee emp) {
	System.out.println("after Method: " + joinPoint.getSignature());
		}
	
	
}