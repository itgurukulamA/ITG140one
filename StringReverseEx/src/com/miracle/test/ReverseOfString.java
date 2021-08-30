package com.miracle.test;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		int leng=str1.length();
		System.out.println(str1.length());
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+str1.charAt(i);

		}
		System.out.println("reverse of "+str1+" is "+rev);


	}

}
