package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {
	
	@RequestMapping(value= "/querry", method=RequestMethod.GET)
	public String getPa(@RequestParam String a,@RequestParam String b) {
		return a+b;
		
	}
	@RequestMapping(value="/path/{s}/{s2}",method=RequestMethod.GET)
	public int abc(@PathVariable int s,@PathVariable int s2) {
		return s+s2;
	}
	

}
	