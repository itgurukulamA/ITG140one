package com.miracle.test3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileEx {

	public static void main(String[] args) throws IOException {
		
		//@SpringzbootApplication is a combination of @EnableScan,@
		//In ObjectInputStream readFloat(),readByte(),readLomg(),redLine(),readChar(),avaliable(), ,close(),
		String str="Hello";
		byte[] barray= {'j','a','v','a','t','p'	};
	FileOutputStream fis=new FileOutputStream("home/document/fsony/file1.txt");
	ObjectOutputStream ois=new ObjectOutputStream(fis);
	ois.writeObject	(str);
	ois.writeObject(barray);
	System.out.println(""+str);
	ois.write(13);
	ois.writeChars("c");
	ois.writeFloat((float) 12.6);
	ois.writeShort(12);
	ois.close();
	
	
	}
	

}
