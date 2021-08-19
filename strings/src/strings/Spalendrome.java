package strings;

import java.util.Scanner;

public class Spalendrome {
	static boolean isPalindrome(String str)
	{

		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();

		if (isPalindrome(s))
			System.out.print(s+ " is a palendrome");
		else
			System.out.print(s+ " is not a palendrome");
	}
}
