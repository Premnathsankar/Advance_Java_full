package com;

import java.util.*;

public class MainClass2{

	public static void main(String[] args)  {
		
		UserDao Dao = new UserDao();
		
		try {
			System.out.println(Dao.getById(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
	}

}
