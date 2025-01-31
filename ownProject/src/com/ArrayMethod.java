package com;

import java.util.Arrays;

public class ArrayMethod {
	
	public int[] removeDuplicate(int[] a) {
		
		for(int i =0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j] && a[i]!=-1) {
					a[j]=-1;
				}
			}
		}
		int index=0;
		for(int j = 0;j<a.length;j++) {
			if(a[j]!=-1) {
				index++;
			}	
		}
		int[] b = new int[index];
		int n=0;
		
		for(int i = 0;i<a.length;i++) {
			if(a[i]!=-1) {
				b[n]=a[i];
				n++;
			}
		}
		return b;
	}
	
	public int[] ascSort(int[] a) {
		
		int [] b = removeDuplicate(a);
		Arrays.sort(b);
		 
		 return b;
	}
	
	public int[] reverse(int[] a) {
		int [] b = new int[a.length];
		
		int n=0;
		for (int i =b.length-1;i>=0;i--) {
			b[n]=a[i];
			n++;
		}
		return b;
	}
	
		public int[] dscSort(int[] a) {
		
		int [] b = removeDuplicate(a);
		int [] c = new int[b.length];
		
		Arrays.sort(b);
		int n=0;
		for (int i =b.length-1;i>=0;i--) {
			c[n]=b[i];
			n++;
		}
		 
		 return c;
		 
	}
		
		public String[] arrayEvenOdd(int[] a) {
			String[] b = new String[a.length];
			
			for(int i = 0;i<a.length;i++) {
				if(a[i]%2==0) {
					b[i]=a[i]+" is "+"even";
				}
				else {
					b[i] = a[i]+" is "+"odd";
				}
			}
			return b;
		}
		
		
}
