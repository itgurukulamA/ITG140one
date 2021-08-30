package com.miracle.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx13 {

	public static void main(String[] args) {
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "abc");
		map1.put(2,"bbc");
		map1.put(3, "ccc");
		System.out.println("after adding values :"+map1);
		map1.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		//.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
				
		

	}

}
