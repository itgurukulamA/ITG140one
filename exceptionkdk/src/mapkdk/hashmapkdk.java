package mapkdk;
import java.util.*;
public class hashmapkdk {
public static void main (String[] args)
{
	//generic type
	HashMap<Integer,String> a= new HashMap<Integer,String>();
	a.put(1, "kdk");
	a.put(2, "kdkk");
	a.put(8, "man");
	for(Map.Entry kdk:a.entrySet()) {
		System.out.println(kdk.getKey()+" "+kdk.getValue());
	}
}
}
