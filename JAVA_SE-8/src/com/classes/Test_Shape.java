package com.classes;

import java.util.Scanner;

public class Test_Shape {
	public static void main(String[] args) {

		// menu
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("Enter choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			// CIRCLE
			// decleration
			
			System.out.println("Enter radius");
			float radius;
			radius = sc.nextFloat();
			
			Circle c1, c2; // user defined class

			// object creation, object instanciation
			c1 = new Circle();
			// c2 = new Circle(5.5f);

			// initializinf=g feild of an object
			// c1.radius = 3.4f;
			
			c1.setRadius(radius);
			// System.out.println(c1.getRadius());
			System.out.println("radius: " + c1.toString());
			// calling method
			System.out.println("Area circle=" + c1.calcArea());
			// System.out.println("Area="+ c2.calcArea());

			/*
			 * c2= new Circle();
			 * 
			 * c2.radius=3.5f;
			 * 
			 * System.out.println("Circumference="+ c2.circumference());
			 */
			break;
		case 2:
			// SQUARE
			System.out.println("Enter side");
			float side;
			side = sc.nextFloat();
			
			Square s1, s2;
			s1 = new Square();

			s1.setSide(side);
			// System.out.println(s1.getSide());
			System.out.println("radius: " + s1.toString());
			System.out.println("Area square=" + s1.Area());
			break;
		case 3:
			// TRIANGLE
			System.out.println("Enter Length and Breadth");
			float length,breadth;
			length = sc.nextFloat();
			breadth = sc.nextFloat();
			Triangle t1;

			t1 = new Triangle();

			t1.setLength(length);
			// System.out.println(t1.getLength());
			t1.setBreadth(breadth);
			// System.out.println(t1.getBreadth());
			System.out.println("radius: " + t1.toString());
			System.out.println("Area triangle=" + t1.TriArea());
		default:
			break;
		}
	}

}
