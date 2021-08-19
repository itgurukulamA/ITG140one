package exceptionhandling;

public class Stringindexoutofbound {
 public static void main(String args[]) {
	 String s="Training";
	 try {
	 System.out.println(s.charAt(12));
 }catch(StringIndexOutOfBoundsException e ) {
	 System.out.println(e);
 }
}
}