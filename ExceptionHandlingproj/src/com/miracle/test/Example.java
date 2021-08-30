package com.miracle.test;


public class Example{  
    public static void main(String args[]){  
     try{  
        //code that may raise exception  
        int data=100/0; 
     //   System.out.println("rest of the code");
     }
     catch(ArithmeticException e)
     {
    	 System.out.println(e);
     //rest code of the program   
     //System.out.println("rest of the code...");  
     
    }
    System.out.println("rest of the code");  
  }  
}