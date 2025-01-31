package pro;

import java.util.Random;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user1 = 500;
		int user2 = 500;
		
		System.out.println("enter the number from 1 to 100:");
		int ran = sc.nextInt();
		System.out.println("enter the number from 1 to 100:");
		int ran1 = sc.nextInt();
		
		userCheck(ran,user1);
		userCheck(ran1,user2);
		
			
	}
	
		public static void userCheck(int value,int uv) {
			
		if(value>0 && value<=100) {
			
			Random random = new  Random();
			
			int randomnum = random.nextInt(100);
			
			if(randomnum > 1) {
				for (int i = 2; i <= Math.sqrt(randomnum); i++) {
		            if (randomnum % i == 0) {
		            	int u = randomnum *2;
		            	System.out.println("total value : "+(uv+u));	
		            }
		            else {
		            	System.out.println("total value : "+(uv-50));
		            }
		                
		       }
			}
			else {
				System.out.println("num :"+(randomnum-50));
			}
		}
	}
}
