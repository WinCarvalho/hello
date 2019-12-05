package com.inheretance;

import java.util.Scanner;
//abstract,extends,super
abstract class Shape {

	public abstract void draw();
	public abstract double calcArea();

}

class Circle extends Shape {

	private float radius;

	public Circle() {
		super(); // will call def const of super class
		radius = 0.0f;
		System.out.println("circle-->def");
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
		System.out.println("circle-->parm");
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return radius * radius * Math.PI;

	}

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
	}

}

class Square extends Shape {

	private float size;

	public Square() {
		super(); // will call def const of super class
		size = 0.0f;
		System.out.println("square-->def");
	}

	public Square(float size) {
		super();
		this.size = size;
		System.out.println("square-->parm");
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	@Override
	public double calcArea() {
		return size * size;
	}

	@Override
	public void draw() {
		System.out.println("square is drawn");
	}

}

public class Test_Shape {
	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		// decleration
		Shape shape;
		System.out.println("Enter Choice");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		choice = sc.nextInt();
		// initiation object

		shape= new Circle(5.5f);
		shape.draw();
		System.out.println("CArea:" + shape.calcArea());


		shape = new Square(5.5f);
		shape.draw();
		System.out.println("CArea:" + shape.calcArea());

	}

}