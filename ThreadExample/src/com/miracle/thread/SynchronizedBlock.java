package com.miracle.thread;

//import com.miracle.thread.Test0.Mythread1;

class Table{
	void printTable(int n) {
		synchronized(this) {
			for(int i=0;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				}//end of try
				catch(Exception e) {
					System.out.println(e);
				}//end of catch
			}//end of for
		}//end of blclk
	}//end of method
}//claa


class Mythread1 extends Thread{
	Table t;
	Mythread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	
}
class Mythread2 extends Thread{
	Table t;
	Mythread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(7);
		
	}
}

 public class SynchronizedBlock{
	public static void main(String[] args) {
		Table t=new Table();
		Mythread1 th1=new Mythread1(t);
		Mythread2 th2=new Mythread2(t);
		th1.start();
		th2.start();
		
		
	}
}