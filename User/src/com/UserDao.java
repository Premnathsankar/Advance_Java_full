package com;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
		static String driver = "com.mysql.cj.jdbc.Driver";
		static String url = "jdbc:mysql://localhost:3306/user_db";
		static String username = "root";
		static String password = "premsankar@123";
				
		public void saveUser(User u)throws Exception{
			Class.forName(driver);
			
			Connection c =DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			
			ps.setInt(1,u.getId());
			ps.setString(2,u.getFname());
			ps.setString(3,u.getLname());
			ps.setString(4,u.getGender());
			ps.setString(5,u.getEmail());
			ps.setString(6,u.getPassword());
			ps.setLong(7, u.getPhone());
			
			ps.executeUpdate();
			
			c.close();
			
			System.out.println("data inserted");
			
		}
		
		public User getById(int id) throws Exception {

	        Class.forName(driver);

	        Connection c = DriverManager.getConnection(url, username, password);

	        PreparedStatement ps = c.prepareStatement("select * from user where id = ?");
	        ps.setInt(1, id);

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int uid = rs.getInt("id"); //1
	            String fname = rs.getString("fname"); //prem
	            String lname = rs.getString("lname"); //nath
	            String gender = rs.getString("gender"); //male
	            String email = rs.getString("email");  //prem@gmai
	            String password = rs.getString("password"); //ddffg
	            long phone = rs.getLong("phone"); //0987888

	            User u = new User();
	            u.setId(uid);
	            u.setFname(fname);
	            u.setLname(lname);
	            u.setGender(gender);
	            u.setEmail(email);
	            u.setPassword(password);
	            u.setPhone(phone);

	            return u;
	        }

	        return null;
	    }
		
		public void deleteById(int id) throws Exception {
			
			Class.forName(driver);
			
			Connection c =DriverManager.getConnection(url,username,password);
			
			PreparedStatement ps = c.prepareStatement("delete from user where id = ?");
			
			ps.setInt(1,id);
			
			ps.executeUpdate();
			
			c.close();
			
			System.out.println("data deleted");
		}
		
		
		
		public User getByEmail(String email) throws Exception {

	        Class.forName(driver);

	        Connection c = DriverManager.getConnection(url, username, password);

	        PreparedStatement ps = c.prepareStatement("select * from user where email = ?");
	        ps.setString(1, email);

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String fname = rs.getString("fname");
	            String lname = rs.getString("lname");
	            String gender = rs.getString("gender");
	            String emailDb = rs.getString("email");
	            String password = rs.getString("password");
	            long phone = rs.getLong("phone");

	            User u = new User();
	            u.setId(id);
	            u.setFname(fname);
	            u.setLname(lname);
	            u.setGender(gender);
	            u.setEmail(emailDb);
	            u.setPassword(password);
	            u.setPhone(phone);

	            return u;
	        }

	        return null;
	    }
		
		
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
		
	 public void updateUser(User u) throws Exception {
	        Class.forName(driver);
	Connection c = DriverManager.getConnection(url, username, password);

	        PreparedStatement ps = c.prepareStatement("UPDATE user SET fname = ?, lname = ?, gender = ?, email = ?, password = ?, phone = ? WHERE id = ?");
	      
	        ps.setString(1, u.getFname());
	        ps.setString(2, u.getLname());
	        ps.setString(3, u.getGender());
	        ps.setString(4, u.getEmail());
	        ps.setString(5, u.getPassword());
	        ps.setLong(6, u.getPhone());
	        ps.setInt(7, u.getId());

	        ps.executeUpdate();
	        c.close();
	        System.out.println("Data updated");
	    }

       public void deleteUser(User u) throws Exception {
	
    	   Class.forName(driver);
	
    	   Connection c =DriverManager.getConnection(url,username,password);
	
    	   PreparedStatement ps = c.prepareStatement("delete from user where id = ?");
	
    	   ps.setInt(1,u.getId());
	
    	   ps.executeUpdate();
	
    	   c.close();
	
    	   System.out.println("data deleted");
}
       
} 