package com.example.demo.kdk1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class DineshController {
@Autowired
DineshService d;
@PostMapping("/kdk")
public String insert(@RequestBody Dinesh e)
{
	int i=d.insert(e);
	if(i>0)
	{
		return "data insert";
	}
	else
	{
		return "failed";
	}
}


@PostMapping("/ikdk")
public String insert1(@RequestBody Dinesh e)
{
	return d.insert1(e);
}
}
