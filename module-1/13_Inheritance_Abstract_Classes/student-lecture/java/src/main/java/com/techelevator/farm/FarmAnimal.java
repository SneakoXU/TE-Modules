package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	
	public final String getSound( ) {
		if(isAsleep) {
			return "Zzzzzzz";
		}else {
		return sound;
		}
	}
	
	public void sleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
		}
		
	public abstract String eat();
	
	protected void snoreOn(boolean snoring, String baseSound) {
		if(snoring) {
			this.sound = "Ripsaw Zzzzz";
		}else {
			sound = baseSound;
		}
	}
	

}