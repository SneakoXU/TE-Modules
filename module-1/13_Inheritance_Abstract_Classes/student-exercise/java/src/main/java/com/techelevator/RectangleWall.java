package com.techelevator;

public class RectangleWall extends Wall {
	
	private int length;
	private int height;
	
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.height = height;
		this.length = length;
	}


	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return length * height;
	}
	
	public String toString() {
		String outputString = String.format("%s (%dx%d) rectangle", super.getName(), this.length, this.height);
		return outputString;
	}


	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
}
