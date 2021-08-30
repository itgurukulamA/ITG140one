package com.miracle.thread;

public class TestMultiTasking  extends Thread{
	public void run() {
		System.out.println("task one");	
	}
	//Multiple threads but single task
	public static void main(String[] args) {
		TestMultiTasking t1=new TestMultiTasking();
		TestMultiTasking t2=new TestMultiTasking();
		TestMultiTasking t3=new TestMultiTasking();
		t1.start();
		t2.start();
		t3.start();
		// TODO Auto-generated method stub

	}

}
