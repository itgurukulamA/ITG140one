package mapkdk;
import java.util.*;
public class putall {
	public static void main (String[] args)
	{
		HashMap<Integer,String> map=new HashMap();
		
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        //System.out.println(map);
  
        Map<Integer, String> mp = new HashMap<>();
        mp.put(10, "Ten");
        mp.put(30, "Thirty");
        mp.put(50, "Fifty");
  
        map.putAll(mp);
        System.out.println(map);
        
      map.clear();
      System.out.println(map);
     // map.isEmpty();
      System.out.println(map.isEmpty());
  
	}
}
