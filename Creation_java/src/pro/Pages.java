package pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pages {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> book = new ArrayList<Integer>();
		
		int n=1;
		
		while(n<6) {
			System.out.println("enter the pages of book:");
			int pages =sc.nextInt();
			
			book.add(pages);
			n++;	
		}
		
		int small=book.get(0);
		int big=book.get(0);
		
		for(int i = 1;i<book.size();i++) {
			
			if(book.get(i)<small) {
				small = book.get(i);
			}
			
			if(book.get(i)>big) {
				big = book.get(i);
			}
		}
		System.out.println("least no of pages: "+small);
		System.out.println("max no of pages: "+big);
		
	}

}
