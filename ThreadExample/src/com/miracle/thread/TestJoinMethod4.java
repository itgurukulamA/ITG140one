package com.miracle.thread;

public class TestJoinMethod4 {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i values:" + i);
		}
	}

	public static void main(String[] args) {

		TestJoinMethod th1 = new TestJoinMethod();
		TestJoinMethod th2 = new TestJoinMethod();
		TestJoinMethod th3 = new TestJoinMethod();
		System.out.println("Name of t1:" + th1.getName());
		System.out.println("name of t2:" + th2.getName());
		System.out.println("name of t3:" + th3.getName());
		System.out.println("name of th1:" + th1.getName());
		System.out.println("age of the th1:" + th1.getId());
		th1.start();
		th2.start();

	}

}
