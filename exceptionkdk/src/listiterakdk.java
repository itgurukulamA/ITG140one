
import java.util.*;

public class listiterakdk{
	public static void main(String[] args)
	{
	
		List<String> names = new LinkedList<>();
		names.add("samantha");
		names.add("from");
		names.add("ptr");
		ListIterator<String> listIterator
			= names.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}

