package com.project.bank;

import java.util.Scanner;

interface BankAccountOperations {
	public void deposit(double ammout);

	public void withdraw(double ammout);

}

 abstract class BankAccount implements BankAccountOperations {

	// feilds
	private int accountID;
	private String accountName;
	private double balance;

	// constructor

	public BankAccount() {
		super();
		accountID = 101;
		accountName = null;
		balance = 0.00;
		System.out.println("defaut");
	}

	public BankAccount(int paccountID, String paccountName, double pbalance) {
		super();
		accountID = paccountID;
		accountName = paccountName;
		balance = pbalance;
		System.out.println("parameterised");
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "acountID " + accountID + "\t accountName " + accountName + "\t balance" + balance;

		// return super.toString() + "acountID "+ accountID +"\t accountName "+
		// accountName +"\t balance" + balance;
	}
}

	class SavingBankAccount extends BankAccount {

		final double MIN_BALANCE_LIMIT = 5000;
		final double MAX_DEPOSIT_LIMIT = 5000;
		final double MAX_WITHDRAW_LIMIT = 5000;

		public SavingBankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}

		public SavingBankAccount(int paccountID, String paccountName, double pbalance) {
			// super will call parm const of banckaccount
			super(paccountID, paccountName, pbalance);
			System.out.println("SavingBankAccount ...parm");
		}

		@Override
		public void deposit(double amount) {
			// TODO Auto-generated method stub
			if (amount <= MIN_BALANCE_LIMIT) {
				setBalance(getBalance() + amount);
				System.out.println("Deposite.. " + amount);
			}

		}

		@Override
		public void withdraw(double amount) {
			// TODO Auto-generated method stub
			if (amount <= MIN_BALANCE_LIMIT && amount <= MAX_WITHDRAW_LIMIT) {
				setBalance( getBalance() - amount);
				System.out.println("Withdraw.. " + amount);
			}

		}

	
/*
	public void deposit(double amount) {
		double accountbalance = 00;
		accountbalance = accountbalance +  amount;
		//System.out.println("Present balance: "+accountbalance);
		setBalance(accountbalance);
	}

	public void withdraw(double amount) {
		double accountbalance = getBalance();
		accountbalance = accountbalance -  amount;
		System.out.println("Present balance: "+ (accountbalance -  amount));
		

	}
*/	
	public static void main(String[] args) {
		
		int choice, id ;
		String name;
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Option");
		System.out.println( "1. create account\n 2. deposit \n3.withdraw\n4.Balance\n5.ListAll\n 6.Exit  ");
		choice = sc.nextInt();
		//int account_list[]=new int[5];
		SavingBankAccount savingAccount = new SavingBankAccount();
		SavingBankAccount[] savingAccounts = new SavingBankAccount[3];
		//for(int index=0;index< savingAccounts.length; index++)
		
		switch(choice) {
		
		case 1:
			
			
			System.out.println("Enter details");
			System.out.println("id");
			System.out.println("name");
			System.out.println("amount");
			id = sc.nextInt();
			name = sc.next();
			amount= sc.nextDouble();
			savingAccount=new SavingBankAccount(id, name , amount);
			break;
			
		case 2 :	
		savingAccount.deposit(3000);
		System.out.println("Balance"+ savingAccount.getBalance());
		break;
		case 3:
		savingAccount.withdraw(3000);
		System.out.println("Balance"+ savingAccount.getBalance());
		break;
		default : 
			break;
		}
	}
	}
	


