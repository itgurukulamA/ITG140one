package com.miracle.thread;

class MultipleTaskMultiThread  extends Thread{
	public void run() {
		System.out.println("values of i: +i ");
		System.out.println("task one");
	}
}
class Multiex2 extends Thread{
	public void run() {
		System.out.println("Thread class run()");
		System.out.println("task two	");
	}
}
class Test{

	public static void main(String[] args) {
		MultipleTaskMultiThread th1=new MultipleTaskMultiThread();
		//th1.start();
		Multiex2 th2=new Multiex2();
		th1.start();
		th2.start();
		// TODO Auto-generated method stub

	}

}
