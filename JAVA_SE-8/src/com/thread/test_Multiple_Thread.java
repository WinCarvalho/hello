package com.thread;

import com.thread.Test_Runnable_Thread.RunnableTask;

public class test_Multiple_Thread {
	public static void main(String[] args) {
		System.out.println("stqart");
		Thread runnableThread = new Thread(new RunnableTask());
		runnableThread.setName("Runnable Thread");
		runnableThread.start();// start is a call back

		Thread extendedThread = Extendedtask();
		extendedThread.setName("Extend");
		extendedThread.start();

		for (int index = 0; index <= 10; index++) {
			System.out.println(Thread.currentThread().getName() + "-> " + index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

		System.out.println("end");

	}

	private static Thread Extendedtask() {
		// TODO Auto-generated method stub
		return null;
	}
}
