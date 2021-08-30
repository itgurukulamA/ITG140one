package com.miracle.thread;

public class TestJoinMethod5 extends Thread {
	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		TestJoinMethod5 th1 = new TestJoinMethod5();
		TestJoinMethod5 th2 = new TestJoinMethod5();
		th1.setPriority(Thread.MIN_PRIORITY);
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		
		th2.start();

	}

}
