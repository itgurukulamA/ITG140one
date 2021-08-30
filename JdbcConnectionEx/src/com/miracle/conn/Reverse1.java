package com.miracle.conn;

public class Reverse1{
	public static void main(String[] args) {
		String s1="chirasmita";
		String reversestr="";
		int len=s1.length();
		for(int i=s1.length()-1;i>=0;i--) {
			reversestr=reversestr+s1.charAt(i);
			
			
		}
		System.out.println("original String:"+s1);
		System.out.println("Reverse String:"+reversestr);
		
	}

}
