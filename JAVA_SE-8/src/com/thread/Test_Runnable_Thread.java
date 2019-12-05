package com.thread;

public class Test_Runnable_Thread {
public static void main(String[] args) {
	System.out.println("Test_Main_Thread-> start");
	
	//spawn of runnable thread
	
	Thread runnableThread = new Thread(new RunnableTask());
	
	runnableThread.setName("Runnable Thread");
	runnableThread.start();//start is a call back
	
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
	System.out.println("Test_Main_Thread-> end");
}

class RunnableTask implements Runnable{                 //prefered
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
