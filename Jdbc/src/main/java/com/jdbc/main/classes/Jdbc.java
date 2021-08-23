package com.jdbc.main.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Jdbc {
private int id;
private String name;
private int age;
private String gmail;
private int phone;
public Jdbc(int id, String name, int age, String gmail, int phone) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gmail = gmail;
	this.phone = phone;
}

}
