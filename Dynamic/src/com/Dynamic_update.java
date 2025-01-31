package com;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter the id:");
		int id =sc.nextInt();
		System.out.print("enter collection:");
		double collection = sc.nextDouble();
		System.out.print("enter the rating:");
		double rating = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			PreparedStatement ps = c.prepareStatement("update movie set collection = ?,rating = ? where id = ?");
			ps.setDouble(1,collection);
			ps.setDouble(2,rating);
			ps.setInt(3,id);
			
			ps.executeUpdate();
			
			System.out.println("Data Updated");
			
		} catch (ClassNotFoundException | SQLException e) {
			
		}
	}

}
