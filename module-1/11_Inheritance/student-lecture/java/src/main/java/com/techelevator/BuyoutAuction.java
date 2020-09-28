package com.techelevator;

public class BuyoutAuction extends Auction{
	
	//Private Members
	private int buyoutPrice;

	//Public properties - getters and/or setters
	public int getBuyoutPrice() {
		return buyoutPrice;
	}
	
	//CTOR
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyoutPrice = buyoutPrice;
	}
	
	@Override
	//Method that follows is to be used in place of the superclass method
	/* If the current high bid is less than the buyout price then the auction is still open.
	 *   If the offeredBid meets or exceeds the buyout price, the bid is set
	 *    to the buyout price and all future bids are ignored.
	 */
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		if(getHighBid().getBidAmount() < buyoutPrice) { //getHighBid is inherited from the superclass
			if(offeredBid.getBidAmount() >= buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice); //sets the offeredBid offer to the buyoutPrice
			}
			
			isCurrentWinningBid = super.placeBid(offeredBid); //call the super b/c it will add the bid to the current list of bids
			
		}
		
		return isCurrentWinningBid;
	}

}
