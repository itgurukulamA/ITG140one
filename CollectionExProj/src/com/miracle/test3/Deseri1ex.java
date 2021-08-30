package com.miracle.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseri1ex {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo.txt"));
		Student s=(Student)ois.readObject();
		System.out.println(s.id+" "+ s.name+ " " + s.age);
		ois.close();
		
		
	}

}
