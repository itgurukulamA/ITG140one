package exceptionkdk;
import java.io.*;
public class nullpointerexceptionkdk {

		public static void main (String[] args)
		{
			String ptr = null;

			try
			{
				System.out.print(ptr.length());	
				System.out.println("kdk");
			}
			catch(NullPointerException e)
			{
				System.out.print("Caught NullPointerException");
				System.out.println("kdk");
			}
		}
	}

