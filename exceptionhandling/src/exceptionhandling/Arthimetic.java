package exceptionhandling;

import java.util.Scanner;

public class Arthimetic {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a and b values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try {
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException e){
		System.out.println(e);
		
	}
	}
}