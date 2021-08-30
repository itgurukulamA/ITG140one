package com.miracle.test;

public class Throwexample
{
	

	public static void age(int age)  {
		if(age<=18) {
			throw new ArithmeticException("not eligible for voating");
		}
		else {
			System.out.println("	 eligible for voating");
		}
	}
	public static void main(String[] args) {
		Throwexample e1=new Throwexample();
		e1.age(24);
	}
}
		