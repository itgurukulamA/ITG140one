package com.aop.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.aop.demo.model.Employee;
import com.aop.demo.service.EmployeeService;

@RestController
public class EmployeeController {
//	@Autowired EmployeeService employeeservice;
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//public Employee addEmployee(@RequestBody Employee emp) {
//	return employeeservice.createEmployee(emp);
//}
	@RequestMapping(value = "/querry", method = RequestMethod.GET)
public String getpa(@RequestParam String s,@RequestParam String s2) {
	return s+s2;
}
	@RequestMapping(value = "/path/{s}/{s2}", method = RequestMethod.GET)
public String jkkg(@PathVariable String s,@PathVariable String s2) {
	return s+s2;
}
}
