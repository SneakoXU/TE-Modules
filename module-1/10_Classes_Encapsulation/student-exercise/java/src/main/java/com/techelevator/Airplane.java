package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public String getPlaneNumber() {
		return this.planeNumber;
	}

	public int getTotalFirstClassSeats() {
		return this.totalFirstClassSeats;
	}

	public int getBookedFirstClassSeats() {
		return this.bookedFirstClassSeats;
	}

	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}

	public int getTotalCoachSeats() {
		return this.totalCoachSeats;
	}

	public int getBookedCoachSeats() {
		return this.bookedCoachSeats;
	}

	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		boolean result = true;
		if(forFirstClass) {
			
			if(totalNumberOfSeats > getAvailableFirstClassSeats()) {
				result = false;
				
			}else {
				bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
				result = true;
			}
				
		}if(!forFirstClass) {
			
			if(totalNumberOfSeats > getAvailableCoachSeats()) {
				result = false;
				
			}else {
				bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
				result = true;
			}
		} 
		return result;
	}
	
}
