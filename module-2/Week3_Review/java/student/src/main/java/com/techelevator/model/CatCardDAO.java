package com.techelevator.model;

import java.util.List;

import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;

public interface CatCardDAO {

	List<CatCard> list();

	CatCard get(long id);

	boolean save(CatCard cardToSave);

	boolean update(long id, CatCard card);
	
	//CatCard getRandom(String catFactStr, String imgUrl);

	boolean delete(long id);

	CatCard getRandom(CatPicService catPicService, CatFactService catFactService);

}
