package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			Statement s = c.createStatement();
			
			Boolean b = s.execute("update movie set rating = 4.7,collection = 600 where name = 'pushpa'");
			
			if(!b) {
				int affected1 = s.getUpdateCount();
				System.out.println(affected1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
