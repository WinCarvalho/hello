package com.exception;

class InsufficientbalanceException extends Exception {

	public InsufficientbalanceException(String message) {
		super(message);
	}

}

public class BankAccount {
	private int accountID;
	private String accountName;
	private double balance;

	public void deposit(double amount) {
		balance += amount;

	}

	// public void withdraw(double amount)
	// {
	public void withdraw(double amount) throws InsufficientbalanceException {
		if (balance < amount)
			throw new InsufficientbalanceException("Balance less");
		balance -= amount;
	}

	public BankAccount() {
		super();
	}

	public BankAccount(int accountID, String accountName, double balance) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.balance = balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		System.out.println("Account started");
		BankAccount bankaccount = new BankAccount(101, "enjoy", 5000);
		try {
			bankaccount.withdraw(6000);
		} catch (InsufficientbalanceException e) {
			e.printStackTrace();
		}
		System.out.println(bankaccount.getBalance());
		System.out.println("account ended");
	}

}
