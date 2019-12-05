package com.classes;

public class Test_Object_Compare {
public static void main(String[] args) {
	Circle c1,c2;
	 c1=new Circle(3.5f);
	 c2=new Circle(3.5f);
	 
	 //compare obj refrence and not their values
	 
	 if(c1==c2) {
		 
		 System.out.println("C1==C2");
	 }
	 else {
		 System.out.println("C1 !=C2");
		 
	 }
	 if(c1.equals(c2))
	 {
		 System.out.println("C1==C2");
	 }
	 else {
		 System.out.println("C1 !=C2");
		 
	 }
	 
	 
	 
}
}
