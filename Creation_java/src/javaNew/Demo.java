package javaNew;

import java.util.*;
interface Shape
{
	void draw();
}
class Circle implements Shape
{
	public void draw(){
		System.out.println("circle");
	}
}
class Square implements Shape
{
	public void draw(){
		System.out.println("Square");
	}
}
class Rectangles implements Shape
{
	public void draw(){
		System.out.println("Rectangle");
	}
}

class ShapeFactory
{
	public static Shape getShape(String s){
		if(s.equals("circle"))
		{
			return new Circle();
		}
		else if(s.equals("square"))
		{
			return new Square();
		}
		else if(s.equals("rectangle"))
		{
			return new Rectangles();
		}
		else
		{
			return null;
		}
	}
}

class Demo
{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the shape name:");
		String name = sc.nextLine();
		
		Shape s = ShapeFactory.getShape(name);
		
		s.draw();
		
	}
}