package com.aop.demo.service;

import org.springframework.stereotype.Service;

import com.aop.demo.model.Employee;
@Service
public class EmployeeService {
public Employee createEmployee(Employee emp) {
	return emp;
}
}
