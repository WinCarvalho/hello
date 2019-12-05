package com.generic;

import java.util.ArrayList;

import com.classes.Circle;
import com.classes.Student;

class Generic<E>{
	ArrayList<E> arraylist;
	
	public Generic() {
		new ArrayList<E>();
	}
}
public class Test_Generic {
public static void main(String[] args) {
	Generic<Circle> genCircle;
	Generic<Student> genstudent;
	
}
}