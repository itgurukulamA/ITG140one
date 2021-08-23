package com.jdbc.Named.server;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedJdbc {
	private int id;
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
