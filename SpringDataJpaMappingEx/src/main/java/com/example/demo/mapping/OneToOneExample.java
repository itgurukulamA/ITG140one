package com.example.demo.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneExample {

	@Autowired UserRepository obj; 
	
	@PostMapping("/add23")
	public String  Hello(@RequestBody Student obj1)
	{
		obj.save(obj1);
		return "data stored successfully in the database";
	}
	
		

	
}