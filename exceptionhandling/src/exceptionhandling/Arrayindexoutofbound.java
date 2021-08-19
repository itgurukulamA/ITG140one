package exceptionhandling;

public class Arrayindexoutofbound {
public static void main(String args[]) {
	      try {
	      int[] arr=new int[5];
	      arr[10]=6;
	    }catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e);
	    }
	}

}