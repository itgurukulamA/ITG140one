package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Anu"); 
		list.add("Reena");  
		list.add("Anu");  
		list.add("geetha");  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  

