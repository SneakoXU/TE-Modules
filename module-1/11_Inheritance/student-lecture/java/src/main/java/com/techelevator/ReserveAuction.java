package com.techelevator;

public class ReserveAuction extends Auction {
	
	//Private members
	private int reservePrice;
	
	//CTOR
	public ReserveAuction(String priceForSale, int reservePrice) {
		super(priceForSale);
		this.reservePrice = reservePrice;
	}
	
	
	@Override
	// If the bid does not meet or exceed the reserve price then it is ignored and not added to the bid list.
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		if(offeredBid.getBidAmount() >= reservePrice) {
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		return isCurrentWinningBid;
	}

}
