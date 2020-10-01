package com.techelevator.farm;

public class Cat extends FarmAnimal {
	
	public Cat() {
		super("Kitty", "meow");
		this.snoreOn(true, "Meow");
	}
	
	public String eat() {
		return "nom nom nom";
	}
	
	
	
//	@Override
	//won't work b/c the getSound in the abstract FarmAnimal is final
//	public String getSound() {
//		return "Hisss!";
//	
//	}

}
