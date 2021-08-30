package com.miracle.test;

public class NextedTryEx {

	public static void main(String[] args) {

		// outer try block
		try {
			try {
				// innr try block

				System.out.println("divided by zero");
				int i = 30 / 0;

			} catch (ArithmeticException ae) {
				System.out.println(ae);
			}
			// inner try block 2
			try {
				int a[] = new int[6];
				a[5] = 9;
			}
			// catch block of inner try block 2
			catch (ArrayIndexOutOfBoundsException ae) {
				ae.printStackTrace();

				System.out.println("other stmts");
			}
			// catch block of outer try block

		} catch (Exception e) {

			System.out.println("other stmts");

		}
	}

}
