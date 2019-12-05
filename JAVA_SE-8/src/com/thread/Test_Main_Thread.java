package com.thread;

public class Test_Main_Thread {
public static void main(String[] args) {
	System.out.println("Test_Main_Thread-> start");
	
	//get the handle of current main thread
	Thread mainThread =  Thread.currentThread();
	//print priority of thread
	System.out.println("Name: "+mainThread.getName()+":"+mainThread.getPriority());
	
	//change naome and priorty of thread
	mainThread.setName("LTI_THREAD");
	mainThread.setPriority(Thread.MAX_PRIORITY);
	
	//print priority of thread
	System.out.println("Name: "+mainThread.getName()+":"+mainThread.getPriority());
		
	
	//control the execution of main thread
	for(int index=0;index<=10; index++)
	{
		System.out.println(mainThread.getName()+"-> "+index);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
	}
	System.out.println("Test_Main_Thread-> end");
	
	
}
}
