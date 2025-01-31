package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f1 = new File("D:\\java_file//Employee.txt");
		
		FileInputStream fis = new FileInputStream(f1);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		
		System.out.println(e);

	}

}
