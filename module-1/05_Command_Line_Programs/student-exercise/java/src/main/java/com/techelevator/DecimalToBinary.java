package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		//create input scanner, print prompt and store input
		Scanner inputScanner = new Scanner(System.in);
		printPrompt();
		String userInput = inputScanner.nextLine();

		//store input into a string array
		String[] userArray = getUserInput(userInput);
		
		//convert string[] to int[] in order to calculate
		int[] intUserArray = changeToIntArray(userArray);
			
//		int[]intUserArray = new int[userArray.length]; 
//  		for(int i = 0; i < userArray.length; i++) {
//  			intUserArray[i] = Integer.parseInt(userArray[i]);	  
//  		}	
 		binaryConvert(intUserArray);
//  		binaryConvert(changeToIntArray(userArray));

  		
//			prints out items in int[]
//  		for(int a = 0; a < intBinaryArray.length; a++) {
//  		System.out.println(intBinaryArray[a]); 
//		}
//		
//  		
//	
		inputScanner.close();
	}

		public static void printPrompt(){
			System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		}
	
	
		public static String[] getUserInput (String decInput) {
			return decInput.split(" ");
			
		}
		
		public static int[] changeToIntArray (String[] passedInArray){
			int[] newIntArray = new int[passedInArray.length]; 
			for(int i = 0; i < passedInArray.length; i++) {
	  			newIntArray[i] = Integer.parseInt(passedInArray[i]);	  
	  		}
			return newIntArray;
		}
		
		
		//pass in array, calc binary and store it in array
		public static void binaryConvert(int[] passedInArray) {
			for(int n=0; n<passedInArray.length; n++) {
				System.out.println(passedInArray[n] + " in binary is " + Integer.toBinaryString(passedInArray[n]));
		
			}
	
		}
}
