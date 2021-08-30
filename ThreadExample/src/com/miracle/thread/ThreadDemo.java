package com.miracle.thread;

public class ThreadDemo extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("values of i:"+i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo d1=new ThreadDemo();
		d1.start();
		d1.start();
		//we can call start method two times it will show u illegalthreadstateexception
		
	}

}
