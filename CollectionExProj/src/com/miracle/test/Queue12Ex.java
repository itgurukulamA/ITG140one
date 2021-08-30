package com.miracle.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue12Ex {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("abc");
		queue.add("bbc");
		queue.add("cbc");
		//queue.clear();
		queue.element("ddd");
		//System.out.println("after clering elements:"+queue);
		System.out.println("after adding the value of queue:"+queue);
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elemns");
		 	Iterator itr=queue.iterator();
		 	while(itr.hasNext()) {
		 		System.out.println(itr.next());
		 		
		 		
		 	}
		
		
	}

}
