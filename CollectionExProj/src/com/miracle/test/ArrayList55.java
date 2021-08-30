package com.miracle.test;

import java.util.ArrayList;

public class ArrayList55 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(13);
		list1.add(23);
		System.out.println("list1 elemnets:"+list1);
		for(Integer number:list1) {
			System.out.println("number:"+number);
		}
		
	
	ArrayList<Integer> list2=new ArrayList<Integer>();
	list2.add(27);
	list2.add(8);
	System.out.println("list2 elemnets:"+list2);
	for(Integer number:list2) {
		System.out.println("number:"+number);
	}
	list1.addAll(2,list2);
	System.out.println("print all numbers");
    for(Integer number:list1) {
    	System.out.println("number:"+number);
    }
    list1.removeAll(list2);
    System.out.println("Arraylist1 after removaAll method :"+list1); 	 	 	
   boolean flag=list1.contains(13);
   if(flag==true)
   {
	   System.out.println("contains elemnts 2");
   }
   else {
	   

	   System.out.println("contains elemnts 2");
	   
   }
}
}
