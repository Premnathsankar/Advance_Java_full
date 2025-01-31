package com;

import java.util.*;

public class MainClass {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayMethod array = new ArrayMethod();
		StringMethod string = new StringMethod(); 
		NumberMethod number = new NumberMethod();
		
				
		boolean main_exit=true;
		do {
			System.out.println("Welcome to the java project");
			
			System.out.println("----select the option to perform-----");
			
			System.out.println("\t1.array_number_problem\n\t2.String_problem\n\t3.number_problem\n\t4.exit");
			
			System.out.print("enter the option:");
			int choice = sc.nextInt();

			switch(choice) {
			
			case 1:
				 boolean array_exit = true;
				do {
					System.out.println("***Array programs***");
					System.out.println("1.remove duplicate\n2.ascending order\n3.decending order\n4.reverse\n5.OddEven\n6.exit");
					System.out.print("enter the option:");
					int arrayChoice = sc.nextInt();
					
					if(arrayChoice==6) {
						array_exit=false;
						break;
					}
					else {
					System.out.print("enter the Array size");
					int size = sc.nextInt();
					int[] a = new int[size];
					for(int i = 0;i<a.length;i++) {
						System.out.print("enter element:");
						a[i] = sc.nextInt();
					}
					switch(arrayChoice) {
					
					case 1:
						int[] res = array.removeDuplicate(a);
						System.out.println("non-duplicate array "+Arrays.toString(res));
						System.out.println("---------------------------------------");
						break;
					case 2:
						int[] res1 = array.ascSort(a);
						System.out.println("ascending order "+Arrays.toString(res1));
						System.out.println("---------------------------------------");
						break;
					case 3:
						int[] res2 = array.dscSort(a);
						System.out.println("decending order "+Arrays.toString(res2));
						System.out.println("---------------------------------------");
						break;
					case 4:
						int[] res3 = array.reverse(a);
						System.out.println("reverse order "+Arrays.toString(res3));
						System.out.println("---------------------------------------");
						break;
					case 5:
						String[] res4 = array.arrayEvenOdd(a);
						System.out.println("odd or even array "+Arrays.toString(res4));
						System.out.println("---------------------------------------");
						break;
					}
				}
			}while(array_exit);
				break;
			
			case 2:
				boolean str_exit = true;
				do {
				System.out.println("1.palindromeCheck\n2.anagramCheck\n3.exit");
				System.out.print("enter the option:");
				int stringChoice = sc.nextInt();
				
				switch(stringChoice) {
				
				case 1:
					System.out.print("enter the string:");
					String word = sc.next();
					string.palindrome(word);
					System.out.println("---------------------------------------");
					break;
				
				case 2:
					System.out.print("enter the first string:");
					String s1 = sc.next();
					System.out.print("enter the second string:");
					String s2 = sc.next();
					string.anagram(s1, s2);
					System.out.println("---------------------------------------");
					break;
					
				case 3:
					str_exit=false;
					break;
				}
				
				}while(str_exit);
				break;
				
			case 3:
				boolean number_exit = true;
				do {
					System.out.println("1.arithmatic operation\n2.odd or even check\n3.prime check\n4.");
					System.out.print("enter the option:");
					int numberChoice = sc.nextInt();
					
					switch(numberChoice) {
					case 1:
						number.arithmaticOperation();
						break;
					case 2:
						
					}
					
				} while (number_exit);
			
			case 4:
				main_exit = false;
				System.out.println("thank you for using this application");
				break;
				
			}
		}while(main_exit);
		
		
		
		
		
		
	}

}
