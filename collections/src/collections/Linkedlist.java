package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("core");  
		al.add("java");  
		al.add("training");  
		al.add("session");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		
		}  
	}  
}  

