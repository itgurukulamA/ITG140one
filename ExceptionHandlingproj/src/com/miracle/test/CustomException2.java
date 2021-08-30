package com.miracle.test;

public class CustomException2  extends Exception{
	
}
 class TestCustomException2 {
	 
	public static void main(String[] args) throws CustomException2 {
		try {
			
		
			throw new CustomException2();
		}
		catch(CustomException2 e) {
			System.out.println("caught exception");
			
		}
		System.out.println("rest of the code");
		
		
		
	}



}
