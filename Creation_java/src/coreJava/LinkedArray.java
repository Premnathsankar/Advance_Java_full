package coreJava;

import java.util.*;

public class LinkedArray {

	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(2,3);
		System.out.println(a);
		b.add(4);
		b.add(5);
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		a.set(4,6);
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		System.out.println("5 is present in the array a:"+a.contains(5));
		System.out.println("4 is present in the array a:"+a.contains(4));	
	}

}
