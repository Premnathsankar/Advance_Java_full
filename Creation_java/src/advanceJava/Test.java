package advanceJava;

public class Test {

	public static void main(String[] args) {
		
		try {
			//1.load or register driver
			//2nd way
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Register successfull");
	    	}catch(ClassNotFoundException e) {
			     e.printStackTrace();
		    }
	}  

}
