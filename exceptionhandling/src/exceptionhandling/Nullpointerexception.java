package exceptionhandling;

public class Nullpointerexception {
	public static void main (String[] args)
	    {
	        String ptr = null;
	        try
	        {
	            if (ptr.equals("ankitha"))
	                System.out.print("Strings are same");
	            else 
	                System.out.print("Strings are different");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.print(e);
	        }
	    }
	}

