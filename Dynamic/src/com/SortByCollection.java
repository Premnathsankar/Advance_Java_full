package com;

import java.sql.*;
import java.util.Scanner;

public class SortByCollection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter start collection:");
		double c1 = sc.nextDouble();
		System.out.print("enter end collection:");

		double c2 = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			PreparedStatement ps = c.prepareStatement("select * from movie where collection between ? and ?");
			
			ps.setDouble(1,c1);
			ps.setDouble(2,c2);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("---------------------------");
				System.out.println("id = "+rs.getInt("id"));
				System.out.println("Name = "+rs.getString("name"));
				System.out.println("hero = "+rs.getString("hero"));
				System.out.println("director = "+rs.getString("director"));
				System.out.println("collection = "+rs.getDouble("collection"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
