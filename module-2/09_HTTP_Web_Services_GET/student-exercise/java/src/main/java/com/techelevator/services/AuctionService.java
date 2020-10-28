package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.auction.Auction;


public class AuctionService {

    private final String BASE_URL;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String url) {
        BASE_URL = url;
    }


    public Auction[] getAll() {
    	Auction[] auctions = null;
    	try {
    		auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
    		
    	}catch(Exception ex) {
    		System.out.println("Unable to retrieve auctions.");
    		return new Auction[] {};
    	}
    	return auctions;
    
    }

    public Auction getOne(int id) {
    	
    	try {
    	Auction auction = restTemplate.getForObject(BASE_URL + "/" + id, Auction.class);
    	 return auction;
    	}catch (NumberFormatException nfe) {
    		System.out.println("Invalid input.");
    		return null;
    	}
    }

    public Auction[] getByTitle(String title) {
    	Auction[] searchResults = null;
        
        try {
        	searchResults = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
        	
        }catch(Exception ex) {
        	System.out.println("Error");
        	return new Auction[] {};
        }
        return searchResults;
       
        
    }

    public Auction[] getByPrice(double price) {
 	Auction[] auctionsByPrice = null;
    	
    	try {
    		auctionsByPrice = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
    		
    	}catch (NumberFormatException nfe) {
    		System.out.println("Error");
    	}
        return auctionsByPrice;
        
    }

}
