package com.techelevator;

public class BankAccount {
	
	//Private Members
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	//CTOR
	public BankAccount(String accountHolderName, String accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		balance = 0;
		
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	//Public properties - getters
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	
	//Public methods
	public int deposit(int amountToDeposit) {
		balance = getBalance() + amountToDeposit;
		return balance;
	}
	
	public int withdraw(int amountToWithdraw) {
		balance = getBalance() - amountToWithdraw;
		return balance;
	}
	
	
	

}
