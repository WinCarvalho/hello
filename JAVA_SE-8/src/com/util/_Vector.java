package com.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class _Vector {

	public static void main(String[] args) {
		
	Vector<String> list;            //Generics
	list = new Vector();
	
	System.out.println("size"+list.size()+" "+list);
	
	list.add("one");
	//list.add(1);
	list.add("two");
	list.add("three");
	//System.out.println("size"+list.size()+" +list");

	list.add("four");
	list.add("five");
	list.add("Sixs");
	System.out.println("size"+list.size()+" "+list);
	
	list.remove("four");
	list.set(1,"six");
	System.out.println("size"+list.size()+" "+list);
	
	System.out.println("Contains three ; "+list.contains("three"));

	//traversing into list 
	//Iterator itr=list.iterator();
	Iterator<String> itr=list.iterator();
	while (itr.hasNext()) {
		//System.out.println(itr.next());
		String value = (String)itr.next();
		if(value.equals("one")) {
			itr.remove();
		}
		
	
	}
	System.out.println("size"+list.size()+" "+list);


	
	
	
	
	
	
	
	
	
}
}
