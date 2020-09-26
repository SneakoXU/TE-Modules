package com.techelevator;

public class Elevator {
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

	
	
	public Elevator(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
		currentFloor = 1;
	}
	
	public int getCurrentFloor() {
		return this.currentFloor;
	}

	public int getNumberOfFloors() {
		return this.numberOfFloors;
	}

	public boolean isDoorOpen() {
		return this.doorOpen;
	}

	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}

	public void goUp (int desiredFloor) {
		if(!doorOpen && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown (int desiredFloor) {
		if(!doorOpen && desiredFloor < currentFloor && desiredFloor >= 0) {
			currentFloor = desiredFloor;
		}
	}
	
}
