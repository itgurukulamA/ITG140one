package exceptionkdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import java.sql.DriverManager;

public class classnotfoundkdk {

	public static void main(String[] args) throws Exception{
		try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/MSS","root","admin123");
             
        Statement d=con.createStatement();  
        d.executeUpdate("insert into emp_info values(9,'kdk',6766)");
 
		}
		catch(ClassNotFoundException e)
				{
		System.out.println(e);
		
		 

	}

	}
}
