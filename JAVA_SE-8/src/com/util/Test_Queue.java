package com.util;


import java.util.*;

public class Test_Queue {
   public static void main(String[] args) {
		
	   List<String> list = new LinkedList<String>();
	   list.add("HW");
	   list.add("SW");
	   list.add("NW");
	   
	   
	   
	   
	   
	   
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
	queue.add("two");
	queue.add("three");
	queue.add("four");
	queue.poll();         //callng queue functions
	queue.peek();
	System.out.println(queue);
		
	queue.remove("three");
	System.out.println(queue);
	System.out.println("Queue Size: " + queue.size());
	System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

	// To empty the queue
	queue.clear();
   }}
