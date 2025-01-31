package javaNew;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "race".toLowerCase();
		String s2 = "care".toLowerCase();
		
		if(anagramCheck(s1,s2)) {
			System.out.println("it is a anagram");
		}
		else {
			System.out.println("it is not a anagram");
		}

	}
	
	public static char[] charArray(String a) {
		char[] res = new char[a.length()];
		
		for(int i=0;i<a.length();i++) {
			res[i]=a.charAt(i);
		}
		return res;
	}
	
	public static void manualSort(char[] b) {
		for(int i=0;i<b.length-1;i++) {
			for(int j = i+1;j<b.length;j++) {
				if(b[j]<b[i]) {
					char temp = b[i];
					b[i] = b[j];
					b[j]=temp;
				}
			}
		}
	}
	
	public static boolean anagramCheck(String a1,String a2) {
		
		if(a1.length()!=a2.length()) {
			System.out.println("not a anagram");
		}
		
		char[] ch1 = charArray(a1);
		char[] ch2 = charArray(a2);
		
		manualSort(ch1);
		manualSort(ch2);
		
		for(int i =0;i<ch1.length;i++) {
			
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
	}

}
