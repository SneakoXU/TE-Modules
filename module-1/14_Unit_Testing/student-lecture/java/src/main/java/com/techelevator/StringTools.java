package com.techelevator;

public class StringTools {
	
	public int numberOfCharacters(String inputString, String characterMatch) {
		
		int result = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.substring(i, i+1).equals(characterMatch)) {
				result++;
			}
		}
		
		return result;
	}

}
