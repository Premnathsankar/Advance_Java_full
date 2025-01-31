package jdbc;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class AdvanceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.load or register driver
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //2.establish connection
			Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","premsankar@123");
			 
			//3.create statement
			Statement s = c.createStatement();
			
			//4.executeQuery
					s.executeUpdate("insert into movie values(2,'vada chennai','dhanush','ayswariya rajesh','vetrimaran',500,5.0)");
					
					System.out.println("Data inserted");
					
			 }catch(ClassNotFoundException | SQLException e) {
			     e.printStackTrace();
		    }

	}

}


