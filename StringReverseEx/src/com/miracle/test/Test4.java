package com.miracle.test;

public class Test4 {

	public static void main(String[] args) {
		
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		System.out.println(t1 instanceof Test4);
		System.out.println(t2 instanceof Test4);//instanceof operator will check wheteher the object is an specified class or inerface type or not.
		
		Test4 t5=null;
		System.out.println(t5 instanceof Test4);
		//Animal a1=new Dog();//upcasting
		//Dog d4=new animal();//if we s
		//if we r storing sub class object in super type refernce then its upcasting
		//if we store super class object in sub type reference is downcastiing and here classCasting required
		//
		

	}

}
