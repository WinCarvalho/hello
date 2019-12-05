package com.thread;

public class Test_Extend_Thread {

	public static void main(String[] args) {
		System.out.println("Test_Main_Thread-> start");
		Thread extendedThread = new Extendedtask();
		
		extendedThread.setName("Extend");
		extendedThread.start();
		System.out.println("Test_Main_Thread-> end");
	}
	
	
	
	class ExtendedTask extends Thread{
		@Override
		public void run()
		{
			for(int index=0;index<=10; index++)
			{
				System.out.println(Thread.currentThread().getName()+"-> "+index);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
			}
		}
	}
}
