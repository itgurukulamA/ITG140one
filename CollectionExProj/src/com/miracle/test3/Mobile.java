package com.miracle.test3;
@XMLElement
public class Mobile {
	String name,color;
	

	public Mobile(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@xmlElement

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	


}
