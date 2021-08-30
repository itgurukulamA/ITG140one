package com.miracle.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx12 {

	public static void main(String[] args) {
		//a map contains values on the basis of keys,A map contains unique key.
		//Map is useful if u wnat to update the values on the basis of keys.
		//There r two interface in java Map,Sortedmap class like hasMap,LinkedHashmap,TreeMap
		//Map and Sortedzmap are two inyerface in java
		//Map doesn't allow duplicate keys
		//HashMap is a class implementation of mao,it doens not mentain any order.
		//Linkledhashmp is a class inherited from Hashmap ,it mentains insertion order.
		//TreeMap it implemnts Map inyerfrfcae,it contains Ascending oredr.
		Map m1=new HashMap();
		//Map is a inyterface so we cant create object.
		
		m1.put(1, "abc");
		m1.put(2, "bbc");
		m1.put(3, "cbc");
		System.out.println("values of map:"+m1);
		//Travering Map into Set so that we can tracverse
		Set set=m1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			 Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		}
		
		
		
	}

}
