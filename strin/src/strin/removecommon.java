package strin;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class removecommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="kdkdkd";
		String s2="kdghKDK";

		char[] d1 = s1.replaceAll("\\s+", "").toCharArray();

		
		char[] d2 = s2.replaceAll("\\s+", "").toCharArray();
		
		Set<Character> firstStringSet = new TreeSet<>();
		
		Set<Character> secondStringSet = new TreeSet<>();
		
		for (char S : d1) 
		{
			firstStringSet.add(S);
		}
		
		for (char c : d2)
		{
			secondStringSet.add(c);
		}
		
		firstStringSet.retainAll(secondStringSet);
		
		System.out.println("remove common characters  : "+firstStringSet);
		
		System.out.println("Count : "+firstStringSet.size());
	}
	}

