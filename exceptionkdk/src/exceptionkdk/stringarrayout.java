package exceptionkdk;

public class stringarrayout {
	static String s="kd from from paturu";
	public static void main(String[] args) {
	try{    
		System.out.println(s.charAt(7));
		    try{    
		     System.out.println("s.charAt(92)");    
		         
		   }  
		    //catch block of inner try block 1  
		    catch( Exception e)  
		    {  
		      System.out.println(e);
		      System.out.println("good");
		    }    
	}catch(StringIndexOutOfBoundsException e)
	{
	System.out.println(e);
	System.out.println("kdk");
	}
}
}
