package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapexample {
	public static void main(String[] args) {  
		Map map=new TreeMap();  
		map.put(1,"Amit");  
		map.put(5,"Rahul");  
		map.put(2,"Jai");  
		map.put(6,"Amit"); 
		//System.out.println(map);
		Set set=map.entrySet();
		//System.out.println(set);
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			Map.Entry<Object,Object> entry=(Map.Entry)itr.next();  
			System.out.println(entry.getValue());  
			//System.out.println(itr.next());
		}  
	}  
}  

