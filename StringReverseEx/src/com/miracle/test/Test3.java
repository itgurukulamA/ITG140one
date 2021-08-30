package com.miracle.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {

	public static void main(String[] args) {

		Employee e1=new Employee("chirasmita", 101);
		String fileName="";
		try {
			FileOutputStream f12=new FileOutputStream("demo4.txt");//saving of object in file
			ObjectOutputStream obj1=new ObjectOutputStream(f12);
			obj1.writeObject(e1);
			obj1.close();
			f12.close();
			System.out.println("object has serilized");
		}
		catch(IOException se) {
			System.out.println(se);


		}
		Employee obj1=null;
		//Deserilization
		//Deserilization for 
		try {
			FileInputStream f23=new FileInputStream("demo4.txt");
			ObjectInputStream obj2=new ObjectInputStream(f23);
			obj1=(Employee)obj2.readObject();
			obj2.close();
			f23.close();
			System.out.println("object has desrilized");
			System.out.println("a="+obj1.a);
			System.out.println("b="+obj1.b);
		}
		catch(IOException e) {
			System.out.println(e);

		}
		catch(ClassNotFoundException xe) {
			xe.printStackTrace();
		}
	}

}
