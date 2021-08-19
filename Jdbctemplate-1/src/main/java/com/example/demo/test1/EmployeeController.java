package com.example.demo.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	Employeeservice es;
	@GetMapping("/selectall")
	public List eselect() {
		return es.getAll();
	}
	@GetMapping("/select")
	public List select(@RequestBody Emloyee e) {
		return es.get(e);
	}
	@RequestMapping("/delete")
	public void del(@RequestBody Emloyee e) {
	String s= es.delete(e);
		
	}
	@GetMapping("/selectmultiple")
	public List select1(@RequestBody Emloyee e) {
		return es.getMultiple(e.getEid(),e.getEname());
		
	}
}

