package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		Scanner inputScanner = new Scanner(System.in);
		String userInput = inputScanner.nextLine();
		
		String[] binaryAnswer = getUserInput(userInput);
		  
  		for(int i = 0; i < binaryAnswer.length; i++) {
  		  
  			System.out.println( "Sqwak! " + angryAnswer[i] + "!"); 
		}
		
	
		
		inputScanner.close();
	}

		public static String[] getUserInput (String decInput) {
	
			
			return decInput.split(" ");
			
		}
		
		
}
