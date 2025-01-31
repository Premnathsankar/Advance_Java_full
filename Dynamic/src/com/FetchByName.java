package com;

import java.sql.*;
import java.util.Scanner;

public class FetchByName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter movie name:");
		String n = sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			PreparedStatement ps = c.prepareStatement("select name,hero,director,collection from movie where name = ?");
			
			ps.setString(1,n);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
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
