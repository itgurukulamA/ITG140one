package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Demo1 {
@RequestMapping(value="/laxman")
 public String display()
 {
	 return "helloWorld";
 }
	}