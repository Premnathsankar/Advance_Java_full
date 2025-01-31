package com;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		UserDao dao = new UserDao();
		
		System.out.println("***Welcome to User Application***");
		
		boolean b = true;
		
		while(b) {
			
			System.out.println("1)Press 1 for sign up\n2 Press 2 for login\n3) Press 3 for logout");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1: {
				System.out.println("**Welcome to sign up**");
				
				System.out.println("enter the id");
				int id = sc.nextInt();
				
				System.out.println("enter id");
				
				System.out.println("enter first name");
				String fname = sc.next();
				
				System.out.println("enter last name");
				String lname = sc.next();
				
				System.out.println("enter gender");
				String gender = sc.next();
				
				System.out.println("enter email");
				String email = sc.next();
				
				System.out.println("enter password");
				String password = sc.next();
				
				System.out.println("enter phone number");
				long phone = sc.nextLong();
				
				User u = new User();
				u.setId(id);
				u.setFname(fname);
				u.setLname(lname);
				u.setGender(gender);
				u.setEmail(email);
				u.setPassword(password);
				u.setPhone(phone);
				
				dao.saveUser(u);
				break;
			}
			
			
			
			
			}
			
		}
		
		
		
	}

}
