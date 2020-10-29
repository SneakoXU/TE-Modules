package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;
   // private List<Auction> auctions = new ArrayList<>();

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    @RequestMapping(path="/auctions", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false) String title_like, @RequestParam(required=false) Double currentBid_lte){
    	
    	List<Auction> auction = dao.list();
    	//currentBid_lte = 0;
    	
    	if(title_like != null && currentBid_lte != null) {
    		auction = dao.searchByTitleAndPrice(title_like, currentBid_lte);
    	}else if(title_like != null)
    	{
    		auction = dao.searchByTitle(title_like);
    		
    	}else if(currentBid_lte != null) {
    		auction = dao.searchByPrice(currentBid_lte);
    	}
    	
    	else {
    		return auction;
    	}
    	
    	return auction;
    }

    @RequestMapping(path="/auctions/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
    	return dao.get(id);
    }
    
    @RequestMapping(path="/auctions", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
    	Auction result = null;
    	if(auction != null) {
    		result = dao.create(auction);
    	
    	}
    	return result;
    }
    
  

    
    
    
}
