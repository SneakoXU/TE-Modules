package com.techelevator;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		int currentBalance = 0;
		int withdrawPlusService = amountToWithdraw + 2;
		
		if(super.getBalance() - amountToWithdraw < 150 && amountToWithdraw < super.getBalance()) {
			currentBalance = super.withdraw(withdrawPlusService);
		}if(amountToWithdraw > super.getBalance()){
			currentBalance = super.getBalance();
		}if(super.getBalance() > 150) {
			currentBalance = super.withdraw(amountToWithdraw);
	}

		return currentBalance;
	}

}
