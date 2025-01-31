package advanceJava;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.load or register driver
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //2.establish connection
			 DriverManager.getConnection("jdbc:mysql://3306/movie_db","root","premsankar@123");
			 
			 System.out.println("connection established");
			 }catch(ClassNotFoundException | SQLException e) {
			     e.printStackTrace();
		    }

	}

}
