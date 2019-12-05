

public class Thread_waitNotify_Account {

	public static void main(String[] args) {

		System.out.println("Thread_WaitNotify_Account->started...");

		Account account = new Account();

		new Thread() {
			public void run() {
				account.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				account.deposit(10000);
			}
		}.start();

		//new Dad(account).start();	// account.deposit
		//new Son(account).start();	// account.withdraw

		System.out.println("Thread_WaitNotify_Account->ended...");
	}
}

class Dad extends Thread {
	Account account;

	public Dad(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(10000);
	}
}

class Son extends Thread {
	Account account;

	public Son(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(15000);
	}
}

class Account {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
		notify();
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}
