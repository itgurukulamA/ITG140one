package com.miracle.conn;

//import java.util.Scanner;

public class Sample12 {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		String input="hiwelcome";
		System.out.println("Original  String:"+input);
		String[] a=input.split("");
		String output="";
		System.out.println("splited string:"+a);
		for(String word:a) {
			String reverseWord="";
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord=reverseWord+word.charAt(i);
				
			}
			output=output+reverseWord+" ";
		}
		
		
		
	}

}
