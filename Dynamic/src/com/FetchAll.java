package com;

import java.sql.*;

public class FetchAll {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("select * from movie");
					
			while(rs.next()) {
				System.out.println("id = "+rs.getInt("id"));
				System.out.println("Name = "+rs.getString("name"));
				System.out.println("hero = "+rs.getString("hero"));
				System.out.println("heroine = "+rs.getString("heroine"));
				System.out.println("director = "+rs.getString("director"));
				System.out.println("collection = "+rs.getDouble("collection"));
				System.out.println("rating = "+rs.getDouble("rating"));
				System.out.println("-------------------------------------");
			}
			
//			System.out.println(rs.next());
//			System.out.println(rs.next());
//			System.out.println(rs.next());
//			System.out.println(rs.next());
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}

}