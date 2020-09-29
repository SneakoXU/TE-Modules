package com.techelevator;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	@Override
	public int withdraw (int amountToWithdraw) {
		int withdrawPlusOverdraft = amountToWithdraw + 10;
		int currentBalance = 0;
		if(super.getBalance() >= amountToWithdraw) {
			currentBalance = super.withdraw(amountToWithdraw);
		}if (super.getBalance() - amountToWithdraw > -100 && super.getBalance() - amountToWithdraw < 0) {
			currentBalance = super.withdraw(withdrawPlusOverdraft);
			
		}if(super.getBalance() - amountToWithdraw <= -100) {
			currentBalance = super.getBalance();
		}
		
		return currentBalance;
	}
	
}
