package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        for(Bid bid : generalAuction.getAllBids()) {
        	System.out.println(bid.getBidder() + " offers: " + bid.getBidAmount());
        	
        }
        
        System.out.println("Current winner: " + generalAuction.getHighBid().getBidder());
        
        System.out.println();
        System.out.println("-------------");
        System.out.println("Buyout Auction");
        System.out.println();
        System.out.println();
        
        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Travel Mug", 55);
        
        buyoutAuction.placeBid(new Bid ("Rick Astley", 20));
        buyoutAuction.placeBid(new Bid ("Michael Scott", 30));
        buyoutAuction.placeBid(new Bid ("Ryan Howard", 75));
        buyoutAuction.placeBid(new Bid ("Dwight K. Schrute", 31));
        
        for(Bid bid : buyoutAuction.getAllBids()) {
        	System.out.println(bid.getBidder() + " offers: " + bid.getBidAmount());
        }
       
        
        System.out.println("Current Buyout Auction Winner: " + buyoutAuction.getHighBid().getBidder() + " at: " + buyoutAuction.getHighBid().getBidAmount());

    }
}
