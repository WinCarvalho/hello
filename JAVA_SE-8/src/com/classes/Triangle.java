package com.classes;

public class Triangle {
	private float length;
	private float breadth;
	
	public double TriArea() {
		
		return 0.5 * length* breadth;

	}
	
	
	public Triangle() {
		length= 0;
		breadth=0;
		System.out.println("triangle---> default");
	}
	
	public Triangle(float llength, float bbreadth) {
		length= llength;
		breadth= bbreadth;
		System.out.println("triangle---> default");
	}
	


//setter method
	public void setLength(float llength )
	{
		length= llength;
		
	}
	
	//getter method
	public float getLength()
	{
		return length;
	}

	//setter method
		public void setBreadth( float bbreadth)
		{
			
			breadth = bbreadth; 
		}
		
		//getter method
		public float getBreadth()
		{
			return breadth;
		}
	
		@Override //java annotation
		public String toString() {
			return "Length : "+length+"\t Breadth" + breadth;
			
		}
}