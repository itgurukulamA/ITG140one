package com.miracle.test;

class parent {
	void msg() {
		System.out.println("paren method");
	}
}
class chid extends parent{
	void msg()throws ArithmeticException{
		System.out.println("child class method");
		 	
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1=new parent();
		p1.msg();

	}

}
