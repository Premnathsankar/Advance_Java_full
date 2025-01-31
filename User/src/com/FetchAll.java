package com;

import java.sql.*;
import java.util.*;

public class FetchAll {
		
		static String driver = "com.mysql.cj.jdbc.Driver";
		static String url = "jdbc:mysql://localhost:3306/user_db";
		static String username = "root";
		static String password = "premsankar@123";
				
		public List<User> fetchAll() throws Exception{
			Class.forName(driver);
			
			Connection c =DriverManager.getConnection(url,username,password);
			
			Statement s = c.createStatement();
			
			ResultSet rs =s.executeQuery("select * from user");
			
			ArrayList<User> al = new ArrayList<>();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String password = rs.getString("password");
				long phone = rs.getLong("phone");
			
			User u = new User();
			
			u.setId(id);
			u.setFname(fname);
			u.setLname(lname);
			u.setGender(gender);
			u.setEmail(email);
			u.setPassword(password);
			u.setPhone(phone);
			
			al.add(u);
		}
			
		return al;
	}
}
