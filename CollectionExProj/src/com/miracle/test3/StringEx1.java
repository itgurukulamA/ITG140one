package com.miracle.test3;

import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
		
		/*char ch[]= {'a','b','c','d','e'};
		String s2=new String(ch);//converting char arr[] to String
		System.out.println(s2);
		String s3=new String("chirasmita");
		System.out.println(s3);*/
		/*String s2="chirasmita";
		s2=s2.concat(" Sahoo ");//concat methods appends the strings at the end
		System.out.println(s2);
		String s3="debu";//
		String s4="sebu";
		System.out.println(s3.equals(s4));//false
		String s5=new String("debu");//
		System.out.println(s3==s5);//false
		System.out.println(s2.compareTo(s3));*/
		String s1="subu";
		String s2="jena";
		String s3=s1.concat(s2);
		System.out.println( s3 );
		String s5="chirasmita";
		String s6=s5.substring(0,4);
		System.out.println(s6);
		String s7=new String("mynameissona");
		String[] sentences=s7.split("\\.");
		//System.out.println(Arrays.toString(sentences));
		System.out.println(s1.startsWith("su"));
		System.out.println(s5.charAt(2));
		
	
		
		
		
	}

}
