package com;

import java.sql.*;
import java.util.Scanner;

public class Dynamic_delete {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter the id:");
		int id =sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			
			PreparedStatement ps = c.prepareStatement("delete from movie where id = ?");
			ps.setInt(1,id);
			ps.executeUpdate();
			System.out.println("data deleted");
		} catch (ClassNotFoundException | SQLException e) {
		}
	}

}
