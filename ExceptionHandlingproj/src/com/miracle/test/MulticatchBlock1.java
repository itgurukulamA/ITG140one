package com.miracle.test;

public class MulticatchBlock1 {
	public static void main(String[] args) {
		try {
			int arr[] =new int[5];
			System.out.println(arr[8]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
