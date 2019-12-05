package com.classes;


//user defined class
public class Circle {

	//feild
	private float radius;    //variable
	
	//default constructor
	public Circle() {
		radius = 0;
		System.out.println("circle---> default");
	}
	
	//parameter constructor ( userdefined  )
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("circle---> parameter");
	}
	//setter method
	public void setRadius(float pradius)
	{
		radius=pradius;
	}
	
	//getter method
	public float getRadius()
	{
		return radius;
	}
	//method
	
	public double calcArea() {                   //function
		return radius*radius*Math.PI;
			}
	
	public double circumference() {
		return 2 * Math.PI * radius;
	}
	
	@Override //java annotation
	public String toString() {
		return "Radius : "+radius;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("circle-> equals...");
		Circle otherCircle = (Circle) obj;
		
		if (radius == otherCircle.getRadius())
			{
			return true;
			}
		else {
			return false;
		}
	}


}



