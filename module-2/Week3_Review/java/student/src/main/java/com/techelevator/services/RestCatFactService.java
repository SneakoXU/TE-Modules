package com.techelevator.services;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.CatFact;

@Component
public class RestCatFactService implements CatFactService {
	
	private final String BASE_URL = "https://cat-fact.herokuapp.com/facts/random";
	//private final String BASE_URL;
	public RestTemplate restTemplate = new RestTemplate();
	
	public RestCatFactService() {
		//BASE_URL = url;
		//getFact();
		
	}
	
	
	@Override
	public CatFact getFact() {
		// TODO Auto-generated method stub
		CatFact catFact = restTemplate.getForObject(BASE_URL, CatFact.class);
		
		return catFact;
		
	}

}
