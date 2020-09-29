package com.techelevator.farm;

import java.math.BigDecimal;

public class Egg implements Sellable{
	
	private String name = "Egg";
	private BigDecimal price = new BigDecimal ("0.25");
	
	
	//CTOR
	public Egg() {
		name = "Jumbo Egg";
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public BigDecimal getPrice() {
		return price;
	}
	
	
	
}
