package com.example.demo.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	public Person(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
