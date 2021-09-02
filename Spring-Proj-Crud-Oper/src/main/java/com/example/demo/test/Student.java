package com.example.demo.test;

import org.springframework.jdbc.core.PreparedStatementSetter;

import lombok.Data;

@Data

public class Student {
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int age;
	private String address;
	private int id;
	@Override
	public String toString() {
		return "Student [name=" + name + ",id=" + id+", age=" + age + ", address=" + address + "]";
	}
	public Student(int id,String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.id=id;
	}
	public Student(String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		
		return name;
	}
	public int getAge() {
		
		return age;
	}
	public int getId() {
		
		return id;
	}
	public String getname() {
		
		return name;
	}
	public String getaddress() {
	
		return address;
	}
	

}
