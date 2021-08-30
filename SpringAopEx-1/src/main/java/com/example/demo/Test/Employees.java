package com.example.demo.Test;

import java.util.ArrayList;
import java.util.List;
//stroage class
public class Employees {

	private List<Employee> employeeList;
	public List<Employee> getEmployeeList(){
		if(employeeList!=null) {
			employeeList=new ArrayList<>();
			
		}
		return employeeList;
	}
		public void setEmployeeList(List<Employee> employeeList) {
			this.employeeList=employeeList;
			
		}
	}

