package com.jdbc.Named.server;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class NamedJdbcController {
	@Autowired NamedJdbcServices nService;
	@PostMapping("/istudent")
	public Map<String,String> iJdbc(@RequestBody NamedJdbc nja){
	
		return nService.insert(nja);
	}
	@PutMapping("/ustudent")
	public Map<String,String> uJdbc(@RequestBody NamedJdbc nja ){
		return nService.update(nja);
	}
	@GetMapping("/Gstudent")
	public List<NamedJdbc> gJdbc( ){
		
		return nService.get();
	}
	@GetMapping("/GstudentFromRestTemplate")
	public String gtJdbc( ){
		RestTemplate restTemplate =  new RestTemplate();
		
		String s=restTemplate.getForObject("http://localhost:8080/Gstudent", String.class);
		return s;
		
	}
	@PostMapping("/PoststudentFromRestTemplate")
	public String ptJdbc( ){
		RestTemplate restTemplate =  new RestTemplate();
		NamedJdbc nam =new NamedJdbc(1,"surya", 22,"smadasi", 1231);
		HttpEntity<NamedJdbc> request = new HttpEntity<>(nam);
		restTemplate.postForObject("http://localhost:8080/istudent", request,String.class);
		String s=restTemplate.getForObject("http://localhost:8080/Gstudent", String.class);
		return s;
		
	}
	
	
	@PostMapping("/ofstudent")
	public List<NamedJdbc> gJdbc(@RequestBody Offset offset ){
		return nService.getOffset(offset);
	}
}
