package com.miracle.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Demo2 implements Serializable{
	public String a;
	public int b;
	
	public void  Demo2(String a,int d) {
		this.a=a;
		this.b=b;
	}
}
 public class Demo1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		String filename="file.ser";
		try {
			//Saving object in afile
			System.out.println("hi");
			FileOutputStream fis=new FileOutputStream(filename);
			OutputStream file = null;
			ObjectOutputStream out=new ObjectOutputStream(fis);
			Object object = null;
			out.writeObject(object);
			out.close();
			fis.close();
			System.out.println("object has been serilized");
		}
		catch(IOException ie) {
			System.out.println(ie);
		}
		Demo2 object=null;
		
			//deserialization
		try {
			FileInputStream fis=new FileInputStream("home/document/sony/abc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object=(Demo2)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("file has been deserialized");
			System.out.println("a=object.a");
			System.out.println("b=object.b");
		}
		catch(IOException ie) {
			System.out.println(ie);
		}
		catch(ClassNotFoundException xe) {
			System.out.println(xe);
			
			
			
		}
			
			
		}
}
