package com.example.demo.mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Student, Integer> { 
	//Rest assured to test restful webservices
	//to test xml and json based webserviceses.
	//supports post,get,put,delete,patch,options,head
	

}
