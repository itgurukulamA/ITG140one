package strin;
import java.util.HashSet;
public class commonwords 
{

	public static void main(String[] args) {
	
String[] s1= {"kdk","kg","mgm","hello"};
String[] s2= {"kdk","man","noo","samantha"};
HashSet<String> set=new HashSet<String>();
for(int i=0;i<s1.length;i++) {
	for(int j=0;j<s2.length;j++)
	{
		if(s1[i].equals(s2[j]));
		{
			set.add(s1[i]);
		}
	}
}
System.out.println(set);
	}
}

	
