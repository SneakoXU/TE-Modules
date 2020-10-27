package com.techelevator.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Location;

public class LocationService {

    private String BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public LocationService(String url) {
        BASE_URL = url.lastIndexOf('/') == url.length() ? url : url + "/";
    }

    public Location[] getAll() {
    	Location[] location = restTemplate.getForObject(BASE_URL, Location[].class);
        return location;
    }

    public Location getOne(int id) {
        return null;
    }

}
