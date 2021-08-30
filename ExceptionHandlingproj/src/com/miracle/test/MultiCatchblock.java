package com.miracle.test;

public class MultiCatchblock {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[4]=6/2;
			arr[5]=10;
			System.out.println("hi");
			//arr[5]=9;
			//arr[]=9/0;
			
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
