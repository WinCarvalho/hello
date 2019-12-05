package com.thread;

class Accounts {
	double balance = 10000;

	public synchronized void deposit(double amount) {
		balance = balance + amount;
		notify();
		System.out.println("Deposited amount: " +amount);
	}

	public synchronized void withdraw(double amount) {
		while (balance < amount) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		balance = balance - amount;
		System.out.println("withdrawn amount: " +amount);
		notify();
	}
}

public class Thread_WaitNotify_Accounts {

	public static void main(String[] args) {
		Accounts account = new Accounts();
		Thread thread1 = new Thread() {
		@Override
		public void run() {
			System.out.println(" Thread1 started");
			for (int i = 1; i <= 5; i++) {
			account.deposit(5000);
			System.out.println("amount deposited" + account.balance);
			}
		}	
	};
		Thread thread2 = new Thread() {
		@Override
		public void run() {
		System.out.println("Thread 2 Started");
		for (int i = 1; i <=2; i++) {
			account.withdraw(16000);
			System.out.println("amount withdrawn" + account.balance);
		}
		}	
	
		
		};
		thread2.start();
		thread1.start();
	}
}

