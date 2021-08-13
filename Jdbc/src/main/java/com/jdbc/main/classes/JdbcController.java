package com.jdbc.main.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
 
	@Autowired JdbcServices js;

	@PostMapping("/istudent")
	public String insert(@RequestBody Jdbc jdbc) {
		int i=js.insert(jdbc);
		if(i>0) {
			return "Data inserted succesfully";
		}else {
			return "data insertion failed";
		}
   }
}