package com;

import java.sql.*;

public class ExecuteMethodSelect {
	public static void main(String[] args) {
		
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			Statement s = c.createStatement();
			
			Boolean b = s.execute("select * from movie");
			
			if(b) {
				
				ResultSet rs = s.getResultSet();
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
				}
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
