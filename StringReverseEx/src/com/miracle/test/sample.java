package com.miracle.test;

 abstract class Sample {
	 Sample(){
		 System.out.println("Bike construcotr");
	 }
	 abstract void run() ;
	 void changeGear() {
		 System.out.println("gear changed");
	 }
	 

}
 class Honda extends Sample {

	@Override
	void run() {
		System.out.println("honda run very firstly");
		
	}
	
	 
 }
 class Sample1{
	 public static void main(String[] args) {
		Sample b2=new Honda();
		b2.run();
		b2.changeGear();
		
	
		
	}
 }
