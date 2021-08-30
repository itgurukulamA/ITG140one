package com.miracle.test3;

import java.io.Serializable;

public class Student implements Serializable
{
	int id;
	String name;
	transient int age;
	

public Student(int id, String name,int age) {
	this.id=id;
	this.name=name;
		this.age=age;
	}

}


