package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = {1,2,3,4,5};
		
		
		int[] id = new int[5];
		
		//System.out.println(Arrays.toString(num));
		
		for(int i = num.length-1;i>=0;i--){
			System.out.println(num[i]);
		}
		
//		for(int i = 0;i<id.length;i++) {
//			System.out.println("enter the elements:");
//			id[i] = sc.nextInt();
//		}
		
	}

}
