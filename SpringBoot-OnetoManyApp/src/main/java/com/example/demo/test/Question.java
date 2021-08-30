package com.example.demo.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String qname;
	
	public Question(int id, String qname) {
		super();
		this.id = id;
		this.qname = qname;
	}
	
	

}
