package com.miracle.test;

public class FinallyBlock2 {
	public static void main(String[] args) {
		try {
			int a=20/0;
			System.out.println(a);
		}
		catch(NullPointerException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("hi");
		}
	}

}
