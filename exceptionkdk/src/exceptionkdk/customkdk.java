package exceptionkdk;

class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}

public class customkdk {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age<18)
		{
			throw new TooYoungException("please wait sometime to marry");
		}
			
		else
		
		{
			System.out.println("you are eligible for marriage ");
		}
	

}
}


