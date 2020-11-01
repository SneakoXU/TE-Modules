package com.techelevator.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;

@Component
public class RestCatPicService implements CatPicService {
	
	private final String BASE_URL = "https://random-cat-image.herokuapp.com/";
	public RestTemplate restTemplate = new RestTemplate();
	
	public RestCatPicService() {
		//getPic();
		
	}

	@Override
	public CatPic getPic() {
		CatPic catPic = restTemplate.getForObject(BASE_URL, CatPic.class);
		return catPic;
	}

}	
