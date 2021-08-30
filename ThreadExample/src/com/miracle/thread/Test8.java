package com.miracle.thread;

import com.miracle.thread.Test0.Mythread1;
import com.miracle.thread.Test0.Mythread2;

//mport com.miracle.thread.Test8.Mythread1;
//import com.miracle.thread.Test8.Mythread2;

class Test0 {

	synchronized void printable(int n)

		{
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}


		class Mythread1 extends Thread{
			Test0 ex;
			Mythread1(Test0 ex){
				this.ex=ex;
			}
			public void run() {
				ex.printable(5);
			}
		}
		class Mythread2 extends Thread{
			Test0 ex;
			Mythread2(Test0 ex){
				this.ex=ex;
			}
			public void run() {
				ex.printable(5);
			}
		}
}
	public class Test8{


			public void main(String[] args) {
				Test0 e1=new Test0();
				//Mythread1 th1=new Mythread1(e1);
				//th1.start();
				Mythread2 th2=new Mythread2(e1);
				th2.start();
			}

			}

		

	
