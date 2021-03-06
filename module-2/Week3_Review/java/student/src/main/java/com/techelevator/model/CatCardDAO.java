package com.techelevator.model;

import java.util.List;

import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;

public interface CatCardDAO {

	List<CatCard> list();

	CatCard get(long id);

	boolean save(CatCard cardToSave);

	boolean update(long id, CatCard card);

	boolean delete(long id);

}
