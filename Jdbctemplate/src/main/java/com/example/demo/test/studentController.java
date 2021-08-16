package com.example.demo.test;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

		@Autowired
		StudentService ss;
	@PostMapping("/insert")
		public String student(@RequestBody Student s )
		{
			int i = ss.insert(s);
			if (i>0)
			{
				return "Data inserted Successfully";
			}
			else
			{
				return "Data not inserted";
			}
			
		}
	@PostMapping("/update")
	public String studentupdate(@RequestBody Student s)
	{
		int i = ss.updatetable(s);
		if (i>0)
		{
			return "Data inserted Successfully";
		}
		else
		{
			return "data not inserted";
		}
		}
	   
	@PostMapping("/namedinsert")
	public Map<String,String> studentinsert(@RequestBody Student s)
	{
		Map m= ss.insertn(s);
		return m;
		
	}
	}

