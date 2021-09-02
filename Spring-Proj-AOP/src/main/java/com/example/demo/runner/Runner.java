package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.dao.PersonDao;

public class Runner implements CommandLineRunner{
	@Autowired
	private PersonDao dao;
	
	@Override
	public void run(String...args)throws Exception{
		dao.saveEmployee();
	}
	

}
