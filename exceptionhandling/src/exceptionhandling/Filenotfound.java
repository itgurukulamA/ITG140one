package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfound {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(reader);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}