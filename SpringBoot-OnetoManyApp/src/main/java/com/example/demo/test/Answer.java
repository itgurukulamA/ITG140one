package com.example.demo.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="ans501")
public class Answer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String answername;
	private String postedBy;
	
	

}
