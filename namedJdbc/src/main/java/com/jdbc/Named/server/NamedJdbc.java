package com.jdbc.Named.server;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedJdbc {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	private String name;
	private int age;
	private String gmail;
	private int phone;
	public NamedJdbc(int id, String name, int age, String gmail, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gmail = gmail;
		this.phone = phone;
	}
	
}
