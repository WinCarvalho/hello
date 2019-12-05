package com.thread;

public class Test_Table_Thread {
	public static void main(String[] args) {

		new Thread(new TableThread(2,10)).start();
	}
class TableThread implements Runnable{
	private int tableStart, tableEnd;

	public TableThread(int tableStart, int tableEnd) {
		
		this.tableStart=tableStart;
		this.tableEnd=tableEnd;
	}
	
	public void run()
	{
		for(;tableStart <= tableEnd ; tableStart++ )
		{
			for(int index= 1;index<=10; index++  )
			{
				System.out.print(tableStart *  index +  "\t");
				
			}	
				
			System.out.println();
		}try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
}
