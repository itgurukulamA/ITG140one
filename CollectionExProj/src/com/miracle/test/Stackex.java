package com.miracle.test;

import java.util.Stack;
//in srtack it contains elemnts in LIFO order
public class Stackex {

	public static void main(String[] args) {
		Stack s1=new Stack();
		System.out.println(s1.push("abc"));
		System.out.println(s1.push("dfg"));
		System.out.println(s1.push("sweetu"));
		System.out.println(s1.pop());
		System.out.println("after pop operation value is:"+s1);
		System.out.println(s1.peek());
		System.out.println("after peek operation value is:"+s1);
		
		
		
		

	}

}
