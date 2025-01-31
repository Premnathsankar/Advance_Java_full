package com;

public class User {
	
	int id;
	String name;
	double mark;
	
	public User(int id, String name, double mark) {

		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	

}
