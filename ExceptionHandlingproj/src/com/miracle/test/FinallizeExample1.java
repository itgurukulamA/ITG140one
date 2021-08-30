package com.miracle.test;

public class FinallizeExample1 {
	public static void main(String[] args) {
		FinalExampleTest e1=new FinalExampleTest();
		System.out.println(e1.hashCode());
		e1=null;
		System.gc();
		System.out.println("end of garbage collctor method");
		
	}
	protected void finallize() {
		System.out.println("finallize method called");
	}

}
