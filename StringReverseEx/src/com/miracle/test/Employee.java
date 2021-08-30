package com.miracle.test;

import java.io.Serializable;

public class Employee implements Serializable {
	public String a;
	public int b;
	public Employee(String a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Employee [a=" + a + ", b=" + b + "]";
	}
	

}
