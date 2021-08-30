package com.miracle.test;

import java.util.TreeSet;

public class TreeSetEx {

	private static final String Comparator = null;
	private static final String SortedSet = null;

	public static void main(String[] args) {
		//underlying data structure is balanced tree
		//inserion order is not preserved
		//sorting order is preserved.
		//hetergenous allowes(treeset,Treemap not allowed)
		//null inserion is allowed/
		//null insertion is allowd for only once.insertion order is not preserved,but it follows some sorting ordr.
		TreeSet<Object> t12=new TreeSet<Object>();
		t12.add("a");
		t12.add("j");
		t12.add("c");
		t12.add("z");
		t12.add("d");
		t12.add("null");
		System.out.println("list of values: "+t12);
		//t12.add(12);
		//System.out.println("values of :"+t12);
		//System.out.println(t12.add(null));
		//System.out.println(t12.add("a"));
		
		TreeSet t1=new TreeSet();
		System.out.println(t1.add("g"));
		//Compareble is interface contains compareTo()
		
		
		
		

	}

}
