package com.example.demo.Test;
import lombok.Getter;
import lombok.Setter;
//pojo class

public class Employee {
	int id;
	@Getter @Setter private String firstname;
	@Getter @Setter private String lastname;
	@Getter @Setter private String email;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	public Employee(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
}