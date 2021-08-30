package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is Onetoone app")
public class OneToMany {
	@Autowired UserRepositiory obj;
	
	@PostMapping("/add23")
	@ApiOperation("This method is used for api creation")
	public String Hi(@RequestBody Question obj1) {
		obj.save(obj1);
		return "data save successfully";
		
		
	
	}

}
