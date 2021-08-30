package com.miracle.test;

class Teste1 extends Exception {
	public Teste1(String string) {

	}

}

public class Teste {
	public static void validate(int age) throws Teste1 {
		// int age = 0;
		if (age < 18) {
			throw new Teste1("not eligible for voating");

		} else {
			System.out.println("eligible for voating");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(23);

		} catch (Teste1 e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
