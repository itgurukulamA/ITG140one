package com.miracle.test;

public class Example4 {
	public static void main(String[] args) {
		
	
	try {
		int arr[]= {1,3,4,5,6};
		System.out.println(arr[4]);
		
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		ae.printStackTrace();
	}
	System.out.println("rest of code");
}
}
