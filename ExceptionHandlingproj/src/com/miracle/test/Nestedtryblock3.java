package com.miracle.test;

public class Nestedtryblock3 {
	public static void main(String[] args) {
		//inner try block
		try {
			//inner try block 1
			try {
				//inner try block 2
				try {
					int arr[]= {1,3,4,5,6};
					System.out.println(arr[8]);
					
				}
				catch(ArithmeticException e) {
					System.out.println(e);
					System.out.println("inner try block 2");
				}
			}
				catch(ArithmeticException e1) {
					System.out.println(e1);
					System.out.println("inner try block 1");
				}
		}
		catch(ArithmeticException r) {
			System.out.println(r);
					
		}
	
	catch (ArrayIndexOutOfBoundsException e4) {  
        System.out.print(e4);  
        System.out.println(" outer (main) try block");  
    }  
    catch (Exception e5) {  
        System.out.print("Exception");  
        System.out.println(" handled in main try-block");  
    }  
}  
 
				}
			


