package com.classes;

public class Square {

	private float side;
	
	public float Area() {
		
		return side * side;
				
	}
	
	
	public Square() {
		side=0;
		System.out.println("Default");
		
	}
	
	public Square( float sside)
	{
		side= sside;
		System.out.println("Parameterised");
	}
	//setter method
		public void setSide(float sside)
		{
			side= sside;
		}
		
		//getter method
		public float getSide()
		{
			return side;
		}
	
	
		@Override //java annotation
		public String toString() {
			return "side : "+side;
			
		}
	
}
