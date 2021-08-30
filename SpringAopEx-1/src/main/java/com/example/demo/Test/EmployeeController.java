package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
//@RequestMapping(path="/employees")

public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping(
	path="/",
	produces="application/json")
	
	public Employees getEmployees() {
		return EmployeeDao.getAllEmployees();
		
		
	}
	

				
	
	

}
