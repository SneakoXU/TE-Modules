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

	//private static final String BASE_URL = "http://localhost:8080/api/cards";
    private CatCardDAO catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;
//    private CatFact catFact;
//    private CatPic catPic;
//    private RestCatPicService restPic = new RestCatPicService();
  //  private RestCatFactService restFact = new RestCatFactService();

    //private RestCatPicService restCat;
    public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    
//    @RequestMapping(path="/random", method = RequestMethod.GET)
//    public CatPicService getCatPic(@RequestBody CatPicService catPicService) {
//    	catPicService.getPic();
//    	return null;
//    }
    
    @RequestMapping(path= "", method = RequestMethod.GET)
    public List<CatCard> list(){
    	return catCardDao.list();
    }
    
    @RequestMapping(path= "/{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable long id) throws CatCardNotFoundException {
    	return catCardDao.get(id);
    }
   
    @RequestMapping(path="/random", method = RequestMethod.GET)
    public CatCard random() {
//    	String catFact = restFact.getFact().toString();
    	CatCard catCard = new CatCard();
//    	catCard.setCatFact(catFact);
//    	
//    	String catPic = restPic.getPic().toString();
//    	catCard.setImgUrl(catPic);
//		return catCardDao.save(catCard);
//    	CatCard catCard = new CatCard();
//    	String catFactStr = restFact.getFact().toString();
//    	catCard.setCatFact(catFactStr);
//    	
//    	String catPicURL = restPic.getPic().toString();
//    	catCard.setImgUrl(catPicURL);
//    	String catFactStr = catFactService.getFact().toString();
    	
    	catCard.setImgUrl(catPicService.getPic().getFile());
    	catCard.setCatFact(catFactService.getFact().getText());
    	return catCard;
//    	return catCardDao.getRandom(catPicService, catFactService);
    	
 //   	return catCardDao.get(catCard.getCatCardId());
//    	catCardDao.get(catFactService.getFact());

    }
    
    @RequestMapping(path="", method = RequestMethod.POST)
    public boolean save(@RequestBody CatCard catCard) {
    	
    	return catCardDao.save(catCard);
    	
    }
    
    @RequestMapping(path="", method = RequestMethod.PUT)
    public boolean update(@RequestBody CatCard catCard)
    {
    	return catCardDao.update(catCard.catCardId, catCard);
	}
    
    
    
    @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable long id){
    	catCardDao.delete(id);
	}
    

}
