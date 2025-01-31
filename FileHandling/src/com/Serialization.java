package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		Employee e1 = new Employee(1,"prem",15000);
		
		File f1 = new File("D:\\java_file//Employee.txt");
		
		f1.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		
		System.out.println("object written successfully");
		

	}

}
