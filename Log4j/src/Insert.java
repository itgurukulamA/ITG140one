import java.sql.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Insert {
 static Logger Log =Logger.getLogger(Insert.class);
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Scanner  s=new Scanner(System.in);
		System.out.println("Enter name and age to add : ");
		String x=s.nextLine();
		int y=s.nextInt();
		Log.info("record insertion activated");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mit","root","root");
			System.out.println("Connection Established!");
//			Connection con=DriverManager.getConnection("jdbc:db2://125.62.213.197:22/db2","itgusr13","miracle13"); what is Scrollable, Scrolable insensitive
			PreparedStatement ps=con.prepareStatement("insert into itg140(id,name,age,phoneno) value(50183,'vjdsjh',23,'83648429')");
			
			ps.executeUpdate();
			System.out.println("Inserted!");
		}
		catch(Exception e) {
			System.out.println(e);
			Log.info(e);
		}finally{
			con.close();
		}

	}

}
