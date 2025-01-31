package com;

import java.util.Scanner;

public class NumberMethod {
	Scanner sc = new Scanner(System.in);
	public void arithmaticOperation() {
		boolean operation_exit = true;
		do {
			System.out.println("\t\t--Arithmatic Operation--\n1.add\n2.subtract\n3.multiplication\n4.division\n5.exit");
			System.out.print("enter the option:");
			int operationChoice = sc.nextInt();
			
			switch (operationChoice) {
			case 1: {
				
				System.out.print("enter the number of data are you going to add: ");
				int countnum = sc.nextInt();
				int[] data = new int[countnum];
				int sum =0;
				
				for(int i =0;i<countnum;i++) {
					System.out.print("enter the element:");
					data[i]=sc.nextInt();
				}
				for(int i= 0;i<data.length;i++) {
					sum+=data[i];
				}
				System.out.println("Addition of numbers:"+sum);
				System.out.println("-----------------------------------");
				break;
			  }
			case 2:{
				System.out.print("enter the number of elements are you going to subtract: ");
				int countnum = sc.nextInt();
				int[] data = new int[countnum];
				int sub =0;
				
				for(int i =0;i<countnum;i++) {
					System.out.print("enter the element:");
					data[i]=sc.nextInt();
				}
				sub=data[0];
				for(int i= 1;i<data.length;i++) {
					
					sub-=data[i];
				}
				System.out.println("Subtraction of numbers:"+sub);
				System.out.println("-----------------------------------");
				break;
			}
			case 3:{
				System.out.print("enter the number of elements are you going to multiply: ");
				int countnum = sc.nextInt();
				int[] data = new int[countnum];
				int multi =0;
				
				for(int i =0;i<countnum;i++) {
					System.out.print("enter the element:");
					data[i]=sc.nextInt();
				}
				multi=data[0];
				for(int i= 1;i<data.length;i++) {
					
					multi*=data[i];
				}
				System.out.println("Multiplication of numbers:"+multi);
				System.out.println("-----------------------------------");
				break;
				}
			case 4:{
				System.out.print("enter the dividend: ");
				int num1 = sc.nextInt();
				System.out.print("enter the divisor: ");
				int num2 = sc.nextInt();
				int num3= num1/num2;
				int num4 = num1%num2;
				
				System.out.println("Quotient:"+num3);
				System.out.println("Remainder:"+num4);
				System.out.println("-----------------------------------");
				break;
			}
			case 5:
				operation_exit = false;
				break;
		}
			
		} while (operation_exit);
	}
	
	
	

}
