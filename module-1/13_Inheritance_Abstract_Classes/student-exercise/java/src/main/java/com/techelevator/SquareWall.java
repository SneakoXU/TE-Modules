package com.techelevator;

public class SquareWall extends RectangleWall {
	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		//this.sideLength = sideLength;
	}
	

	public String toString() {
		String outputString = String.format("%s (%dx%d) square", super.getName(), super.getHeight(), super.getHeight());
		return outputString;
	}

}
