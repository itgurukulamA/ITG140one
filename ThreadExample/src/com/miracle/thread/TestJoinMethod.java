package com.miracle.thread;

public class TestJoinMethod extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				
				System.out.println("hi");
				Thread.sleep(1000);
				
			} catch (ArithmeticException | InterruptedException e) {
				System.out.println(e);
				System.out.println("hi");
				
			}

		}
	}

	public static void main(String[] args) {
		TestJoinMethod t1 = new TestJoinMethod();
		TestJoinMethod t2 = new TestJoinMethod();
		TestJoinMethod t3 = new TestJoinMethod();
		t1.start();
		try {
			t1.join(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}

}
