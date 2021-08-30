package com.miracle.thread;

public class TestSleepMethod1 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException ce) {
				System.out.println(ce);
			}
			System.out.println("values of i:"+i);
		}
	}

	public static void main(String[] args) {
		TestSleepMethod1 m1=new TestSleepMethod1();
		TestSleepMethod1 m2=new TestSleepMethod1();
		m1.start();
		m1.start();
		//we can not call a thread twice by using same thread reference it gives illegla
		
		
	}

}
