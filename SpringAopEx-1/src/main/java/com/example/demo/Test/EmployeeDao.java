package com.example.demo.Test;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	private static Employees List=new Employees();
	static {
		List.getEmployeeList().add(new Employee(
				1,
				"chirasmita",
				"Sahoo",
				"schirasmita75@gmil.com"));
				
				
	  List.getEmployeeList().add(new Employee(
			  2,
			  "sonu",
			  "sahoo",
			  "chirasmitasahoo4@gmail.com"));
	}
	  
	public static  Employees getAllEmployees() {
		
		//Employees list = null;
		return List;
		
		
	}
	public void addEmployee(Employee employee) {
		List.getEmployeeList().add(employee);
	}
				
				
	}

