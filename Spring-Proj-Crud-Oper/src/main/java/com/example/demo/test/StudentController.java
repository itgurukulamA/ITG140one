package com.example.demo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentDao studentdao;
	 
	@GetMapping("/getdata")
	public String hello()
	{
		return "hello world";
	}
	
	@PostMapping("/insert2")
	public String insert(@RequestBody Student s) {
		return studentdao.saveStudent(s);
		
			
	}
	@PostMapping("/deletestudent")
	@ResponseBody
	public int deleteStudent(@RequestParam Student s) {
		return studentdao.deleteStudent(s);
	}
	
	@PostMapping("/updateStudent")
	@ResponseBody
	public String updateStudent(@RequestParam Student s) {
		return studentdao.update(s);
	}
	
	@PostMapping("/selectStudent")
	@ResponseBody
	public List selectStudent(Student s) {
		return studentdao.selectQuery(s);
	}
	 @GetMapping("/getpage")
	public List pagination(@PathVariable int page,@PathVariable int size) {
		
		return studentdao.pageSel1(page, size);
		
	}
}

	


