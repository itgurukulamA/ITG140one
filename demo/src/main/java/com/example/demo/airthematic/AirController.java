package com.example.demo.airthematic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AirController {
	@Autowired AirServices aserv;
	@RequestMapping("/")
 public String display() {
		
	return "Hello";
	 
 }
	@RequestMapping("/add")
	public int add() {
		return 8+10;
	}
	
	@PostMapping("/addition")
	public int addition(@RequestBody  Air a) {

			return aserv.addition(a);
			
	}
	@PostMapping("/sub")
	public int sub(@RequestBody  Air a) {

			return aserv.sub(a);
			
	}
	@PostMapping("/mul")
	public int mul(@RequestBody  Air a) {
			return aserv.mul(a);
	}
	@PostMapping("/para")
	public int re(int a, int b) {
		return a+b;
	}
}
