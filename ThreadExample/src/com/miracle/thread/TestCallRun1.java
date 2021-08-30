package com.miracle.thread;

public class TestCallRun1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("values of i:"+i);
		}
	}

	public static void main(String[] args) {
		TestCallRun1 r1=new TestCallRun1();
		//as mwe know thar5 every theread staryts a sp4eprate stack;
		//
		r1.run();
		r1.run();
		//we can call 2 run() bit it will not create a  new stack frame it will 
		//it doesnot start a se3pate cll atack.
		
	}

}
