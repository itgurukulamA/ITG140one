package com.miracle.thread;

public class ThreadDemo1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("value of i:"+i);
		}
	
	}
	public static void main(String[] args) {
		ThreadDemo1 d1=new ThreadDemo1();
		Thread th1=new Thread(d1);
		th1.start();
		
		System.out.println("hi");
		th1.run();
		//th1.start();
		//th1.run();
		//we can not call 2 times satrt method it willl give illegalthreadstateexception
		
		
		
//Docker is a absolutely portable
	
		
		
	}

}
