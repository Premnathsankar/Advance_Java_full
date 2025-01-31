package com;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_insert {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter the id:");
		int id =sc.nextInt();
		System.out.print("enter movie name:");
		String movieName = sc.next();
		System.out.print("enter hero name:");
		String hero = sc.next();
		System.out.print("enter heroine name:");
		String heroine = sc.next();
		System.out.print("enter director:");
		String director = sc.next();
		System.out.print("enter collection:");
		double collection = sc.nextDouble();
		System.out.print("enter the rating:");
		double rating = sc.nextDouble();
		sc.close();
	
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			 
			 PreparedStatement ps = c.prepareStatement("insert into movie values(?,?,?,?,?,?,?)");
			 
			 ps.setInt(1,id);
			 ps.setString(2,movieName);
			 ps.setString(3,hero);
			 ps.setString(4,heroine);
			 ps.setString(5,director);
			 ps.setDouble(6,collection);
			 ps.setDouble(7,rating);
			 ps.executeUpdate();			 
			System.out.println("Data is inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
