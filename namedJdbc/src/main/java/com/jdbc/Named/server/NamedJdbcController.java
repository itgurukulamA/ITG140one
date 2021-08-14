package com.jdbc.Named.server;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
