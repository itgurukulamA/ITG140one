package com.miracle.test;
//possibilityof downcasting with instanceof operator
public class Dog1 extends Animal{
	static void m1(Animal a) {
		if(a instanceof Dog1)
		{
			Dog1 a12=(Dog1)a;
			System.out.println("yah downcasting performed");
			
			
		}
	}

	public static void main(String[] args) {
		Animal a4=new Dog1();//upcasting
		Dog1.m1(a4);
	}

}
//downcasting means storing super type object in sub class refernce 
//for downca