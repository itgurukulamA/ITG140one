package com.aop.demo.service;

import org.springframework.stereotype.Service;

import com.aop.demo.model.Employee;
@Service
public class EmployeeService {
public Employee createEmployee(String empId,String fname,String lname) {
	Employee emp =new Employee();
	emp.setEmpid(empId);
	emp.setFirstName(fname);
	emp.setLastName(lname);
	return emp;
}
}
