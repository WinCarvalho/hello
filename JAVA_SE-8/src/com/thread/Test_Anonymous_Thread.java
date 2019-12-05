package com.thread;

public class Test_Anonymous_Thread {
 public static void main(String[] args) {
	new Thread(new GreetingTaskOuter() ).start();
	new Thread(new Test_Anonymous_Thread().new GreetingTaskInner()).start();
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println(getClass().getName());
			System.out.println("Annonymous -- hi");
	
		}
	};
		new Thread(runnable).start();	
		
		//lambda way
		new Thread(()->System.out.println("^^^^^")).start();
			
		
}
 
 
 
 class GreetingTaskInner implements Runnable{
	 @Override
	 public void run() {
		 System.out.println("Greeking inner class");
	 }
 }
}

class GreetingTaskOuter implements Runnable{
	 @Override
	 public void run() {
		 System.out.println("Greeking outer class");
	 }
}

