package com.miracle.test;
import java.util.*;  
    public class ArrayEx1
    {
    	
    
    public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
    list.add("Ravi");//Adding object in arraylist  
    list.add("Vijay");  
    list.add("Ravi");  
    list.add("Ajay"); 
    //System.out.println("before removinf elem:"+list);
    ArrayList<String> a12=new ArrayList<String>();
    a12.add("red");
    a12.add("green");
    a12.add("yellow");
    System.out.println("\n----------------colorr list1-------");
    for(String list3:list) {
    	System.out.println(list);
    	
    	
    }
    for(String list3:a12) {
    	System.out.println(a12);
    }
    System.out.println("\n--------------color list------------");
    list.addAll(a12);
    System.out.println("\n------------color list1 after add");
    }
    }