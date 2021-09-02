package com.example.demo.Ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TableController {
	@Autowired
	TableService ts;
	@PostMapping("/insert1")
	public String insert1(@RequestBody TableEx te)
	{
		return ts.insert1(te);
	}
	@PostMapping("/update1")
	public String update1(@RequestBody TableEx te) {
		return ts.update1(te);
	}
	
	@PostMapping("/delete")
	public String delete(@RequestBody TableEx te) {
		return ts.delete(te);
	}
	
	@GetMapping("/selection")
	public List select( @RequestBody TableEx   te) {
		return ts.select(te);
	}
	@GetMapping("/select23")
	public String  select23() {
		RestTemplate rt=new RestTemplate();
	
		return rt.getForObject("http://localhost:8080/select", String.class);
		
	}
}

