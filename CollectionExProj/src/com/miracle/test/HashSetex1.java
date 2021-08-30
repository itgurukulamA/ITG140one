package com.miracle.test;

import java.util.HashSet;
import java.util.*;

public class HashSetex1 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		HashSet h2=new HashSet((int) 0.75);
		//hashSet doesn't preserved insertion order and doesn't takes duplicate ements
		//HashSet h3=new HashSet(Collection c1);
		h1.add("a");
		h1.add("f");
		h1.add(12);

		h1.add(null);
		System.out.println("list of values r:"+h1);
		System.out.println(h1.add("a"));
		System.out.println(h1);
		
		//hashset is a class implements from Set interface,it doesn't take duplicate eememnts,
		
		// TODO Auto-generated method stub

	}

}
