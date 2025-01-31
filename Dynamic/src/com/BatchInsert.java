package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection c =null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			 
			 PreparedStatement ps = c.prepareStatement("insert into movie values(?,?,?,?,?,?,?)");
			 
			 System.out.println("enter the count");
			 int count = sc.nextInt();
			 
			 for(int i = 1;i<=count;i++) {
				 
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
				 
				 ps.setInt(1,id);
				 ps.setString(2,movieName);
				 ps.setString(3,hero);
				 ps.setString(4,heroine);
				 ps.setString(5,director);
				 ps.setDouble(6,collection);
				 ps.setDouble(7,rating);
				 
				 ps.addBatch();
				 
			 }
			 
			 ps.executeBatch();
			 System.out.println("data is inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(c!=null) {
					c.close();
				}
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
