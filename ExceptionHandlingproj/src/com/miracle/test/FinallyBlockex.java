package com.miracle.test;

public class FinallyBlockex {

	public static void main(String[] args) {
		try {
			int a=10/2;
			System.out.println(a);
			System.out.println("hi");
		}
		catch(NullPointerException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("finally block will execute definitely");
		}
		System.out.println("rest of code");
	}

}
