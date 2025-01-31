package com;

import java.util.Arrays;

public class StringMethod {
	
	public void palindrome(String a) {
		String b ="";
		for(int i = a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println(a.toLowerCase()+" is a palindrome");
		}
		else {
			System.out.println(a.toLowerCase()+" is a not palindrome");
		}
	}
	
	public void anagram(String a,String b) {
		
		char[] s1 = a.toLowerCase().toCharArray();
		char[] s2 = b.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("it is a anagram");
			System.out.println("-----------------------------------------------");
		}
		else {
			System.out.println("it is not a anagram");
			System.out.println("-----------------------------------------------");
		}
	}

}
