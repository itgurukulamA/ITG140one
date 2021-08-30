package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface userRepositiory extends CrudRepository<User, Integer>{
	public List<User> findByName (String name);
		
	public  List<User> findByNameAndCity(String name,String  city) ;
		
	
	@Query("select u from User u")		
	public List<User> getAllUser() ;
	
		
	}
	



