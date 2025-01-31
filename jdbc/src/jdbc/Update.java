package jdbc;

import java.sql.*;

public class Update {

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
					s.executeUpdate("update movie set collection = 100 where id =10");
					
					System.out.println("Data updated");
					
			 }catch(Exception e) {
			     e.printStackTrace();
		    }

	}

}


