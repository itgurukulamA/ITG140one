import java.util.*;
import java.util.LinkedList;

public class methodscollection {

	public static void main(String args[])
	{
		LinkedList<String> ll
			= new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		ll.add(4,"f");
		LinkedList<String> dd = new LinkedList<String>();
		dd.add("A");
		dd.add("B");
		dd.add("dd");
		//ll.retainAll(dd);
ll.removeAll(dd);
		
System.out.println( "kinked list"+ll);
	}
}

	/*for(String c:ll)
	{
System.out.println(c);
	}

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}*/

   