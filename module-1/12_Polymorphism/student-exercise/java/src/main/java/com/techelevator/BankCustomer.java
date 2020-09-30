package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{
	
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	

	public BankCustomer() {
		
	}
//	public BankCustomer(String name, String address, String phoneNumber) {
//		this.name = name;
//		this.address = address;
//		this.phoneNumber = phoneNumber;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Object[] getAccounts() {
		return accounts.toArray();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	public void addAccount (Accountable newAccount) {
		
		accounts.add(newAccount);
		
	}

	@Override
	public int getBalance() {
		int accountBalance = 0;
		for(Accountable account : accounts) {
			accountBalance += account.getBalance();
			
		}
		
		return accountBalance;
		
	}

	public boolean isVip() {
		boolean isVip = false;
		
		if( getBalance() >= 25000 )
		{
			isVip = true;
		}else {
			isVip = false;
		}
		return isVip;
	}

}
