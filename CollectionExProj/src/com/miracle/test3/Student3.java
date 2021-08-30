package com.miracle.test3;

public interface Student3 {
	public static final int a=10;
	public static final int b=20;
	public int show(int n);
	
}
class Demo3 implements Student3{
	public int show(int n)
	
	{
		return n*n;
	}
	
}
class Test{
	public static void main(String[] args) {
		
		Student3 s1=n->n*n;
		System.out.println(s1.show(3));
		System.out.println(s1.show(5));
	}
}
