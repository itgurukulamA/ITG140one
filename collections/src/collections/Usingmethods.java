package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Usingmethods {
	public static void main(String args[]) {
ArrayList<Object> al=new ArrayList<Object>();
al.add("core java");
al.add("java");
al.add("jdbc");
boolean a=Collections.addAll(al,1,2,3);
System.out.println(a);
System.out.println(al);
al.remove("core java");
System.out.println(al);
ArrayList<Object> al1=new ArrayList<Object>();
al1.add("java");
al1.add("jdbc");
al.removeAll(al1);
System.out.println(al);
System.out.println(al1);
System.out.println(al.size());
//al.clear();
System.out.println(al);
boolean c=al1.isEmpty();
System.out.println(c);
System.out.println(al.equals(al1));
al1.add(1);
al1.add(2);
al.retainAll(al1);
System.out.println(al);
boolean a1=al.contains("java");
System.out.println(a1);

}
}