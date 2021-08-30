package com.miracle.test;

public class ThrowsExample {

	public static int divideNum(int m,int n)throws ArithmeticException{
		int s=m/n;
		return s;

	}
	public static void main(String[] args)  {
		ThrowsExample e1=new ThrowsExample();
		try {
			e1.divideNum(10, 0);
		}
		catch(ArithmeticException ae) {
		System.out.println("\n number can not be divided by zero");
		}
		System.out.println("rest of the code");
		
	}

}
