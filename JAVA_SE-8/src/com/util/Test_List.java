package com.util;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import com.array.Array;

public class Test_List {
	public static void main(String[] args) {

		List<Integer> lstint = Arrays.asList(22,33,44, 55,66);
		
		//ArrayList<String> list = new ArrayList();;            //Generics
		//Vector<String> list = new Vector();;            //Generics
	//	LinkedList<String> list = new LinkedList();;            //Generics
	System.out.println(lstlist);
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
