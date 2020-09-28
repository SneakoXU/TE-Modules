package com.techelevator;

public class Bid {

	//Private Members
	private String bidder;
	private int bidAmount;

	//CTOR
	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}
	
	//Public Properties aka Accessors (Getters and Setters)
	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}
}
