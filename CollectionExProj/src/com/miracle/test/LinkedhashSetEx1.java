package com.miracle.test;

import java.util.LinkedHashSet;

public class LinkedhashSetEx1 {
	public static void main(String[] args) {
		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		h1.add("a");
		h1.add("b");
		h1.add("c");
		System.out.println("list of values:"+h1);
		h1.add("b");
		System.out.println("list of alues:"+h1);
		h1.add(null);
		System.out.println(h1);
		//in LinkedHashSet insertion order is allowd,duplicate elemnets not allow.
		//null insertion possible.
		//linkedlist is best for cache level application.
		//LinkedHashSet is best suitable fr developing cache level application
		//where duplicate r not allowed, insertion order is preserved.
		////ram is apm and rom is sencon	
		
		
	}

}
