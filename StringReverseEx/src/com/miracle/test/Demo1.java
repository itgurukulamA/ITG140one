package com.miracle.test;
abstract class Demo {
	public String a;

	abstract void m1();

	void m2() {
		System.out.println("Abstrex m2()");
	}

	static void m3() {
		System.out.println("m3()");
	}

}

public class Demo1 extends Demo {

	@Override
	void m1() {
		System.out.println("Demo m1()");
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.m1();// Demo m1()

		d1.m2();// Abstracex m2()
		d1.m3();// m3()
	}

}
