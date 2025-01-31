package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		
		
		List<Integer> al = new LinkedList<Integer>();
		
		al.add(5);
		al.add(7);
		al.add(3);
		al.add(7);
		
		al.remove(1);
		al.set(0,2);
		
		System.out.println(al);
		
//		for(int i : al) {
//			System.out.println(i);
//		}
	
	}

}
