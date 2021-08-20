package com.aop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aop.demo.model.Employee;
import com.aop.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired EmployeeService employeeservice;
	@RequestMapping(value = "/add", method = RequestMethod.GET)
public Employee addEmployee(@RequestParam("empid") String empid,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName) {
	return employeeservice.createEmployee(empid, firstName, lastName);
}
}
