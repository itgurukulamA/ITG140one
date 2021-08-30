package com.miracle.test3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileSerili1ex  {

	public static void main(String[] args) {
		try {
			Student s1=new Student(211,"ravi",13);
			
			FileOutputStream fos=new FileOutputStream("demo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}

}
