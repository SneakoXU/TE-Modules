package com.techelevator.controller;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import com.techelevator.services.RestCatFactService;
import com.techelevator.services.RestCatPicService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/api/cards")
public class CatController {


    private CatCardDAO catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }
    
    @RequestMapping(path= "", method = RequestMethod.GET)
    public List<CatCard> list(){
    	return catCardDao.list();
    }
    
    @RequestMapping(path= "/{id}", method = RequestMethod.GET)
    public CatCard get(@Valid @PathVariable long id) throws CatCardNotFoundException {
    	return catCardDao.get(id);
    }
   
    @RequestMapping(path="/random", method = RequestMethod.GET)
    public CatCard random() {

    	CatCard catCard = new CatCard();
    	
    	catCard.setImgUrl(catPicService.getPic().getFile());
    	catCard.setCatFact(catFactService.getFact().getText());
    	return catCard;


    }
    
    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path="", method = RequestMethod.POST)
    public boolean save(@Valid @RequestBody CatCard catCard) {
    	
    	return catCardDao.save(catCard);
    	
    }
    
    
    @RequestMapping(path="", method = RequestMethod.PUT)
    public boolean update(@Valid @RequestBody CatCard catCard)
    {
    	return catCardDao.update(catCard.catCardId, catCard);
	}
    
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public void delete (@Valid @PathVariable long id){
    	catCardDao.delete(id);
	}
    

}
