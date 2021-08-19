package strings;

import java.util.Scanner;

public class Commonchar {
	static String str="";
	static void commonchar(String a,String b) {
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					System.out.print(a.charAt(i));
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings:");
		String a=sc.nextLine();
		String b=sc.nextLine();
		commonchar(a,b);
	}
}
