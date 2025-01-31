package com;

import java.util.ArrayList;
import java.util.List;

import coreJava.Student;

public class CollectionType {
	
public static void main(String[] args) {
		
	User s1 = new User(1,"prem",45);
	User s2 = new User(2,"giri",43);
	User s3 = new User(3,"pevin",54);
	User s4 = new User(3,"pevin",54);
	
	ArrayList<User> student = new ArrayList<User>();
	
	
	student.add(s1);
	student.add(s2);
	student.add(s3);
	student.add(s4);
	
	System.out.println(student);
	
	}
}
