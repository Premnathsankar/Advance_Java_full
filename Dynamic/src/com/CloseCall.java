package com;

import java.sql.*;

public class CloseCall {

	public static void main(String[] args) {
		
			Connection c = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			 
			Statement s = c.createStatement();
			
			s.executeUpdate("update movie set collection = 50 where id =2");
			System.out.println();
			
		} catch (ClassNotFoundException | SQLException  e) {
 			e.printStackTrace();
		}finally {
			try {
				if(c!=null) {
					c.close();
				}
			} catch (SQLException |NullPointerException e2) {
				e2.printStackTrace();
			}
		}
	}

}
