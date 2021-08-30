package com.example.demo.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int b_id;
	private String b_name;
	
	//@OneToOne
	//private Student stud;
	@OneToMany
	private List<Student> student;
	
	public Library(int b_id, String b_name, List<Student> student) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.student = student;
	}
	public Library(List<Student> student) {
		super();
		this.student = student;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Library(int b_id, String b_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
	}
	@Override
	public String toString() {
		return "Library [b_id=" + b_id + ", b_name=" + b_name + "]";
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

}
