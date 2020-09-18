package com.techelevator.command_line_application_lecture;

import java.util.Scanner;

public class CommandLineApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a new instance of the Scanner class to watch the System.in input stream
		Scanner inputScanner = new Scanner(System.in);
		
		//create a new instance of the ParrotHelperClass to work with
		ParrotHelperClass polly = new ParrotHelperClass();
		
		
		boolean running = true;
		
		while(running) {
			printMenu();
			String menuChoice = inputScanner.nextLine();
			
			int selection = Integer.parseInt(menuChoice);
			
			//start interacting with the user
			//LOOK AT getUserInput METHOD BELOW!!!!
			/*System.out.print("What do you want me to say?: ");
			String userInput = inputScanner.nextLine();
			*/
			
			if(selection == 1) {
				
				//interact with user w/in if statement check
				//put into the polly. object method - getUserInput(inputScanner);
				
				
				//give the response from a friendly parrot
				System.out.println( polly.TalkLikeAParrot( getUserInput(inputScanner)) );
			}else if(selection == 2) {
				
				//interact with user w/in if statement check
				//put into the polly. object method - getUserInput(inputScanner);
				
				
				//give the response from the angry parrot
				String[] angryAnswer = polly.TalkLikeAnAngryParrot( getUserInput(inputScanner) );
				
				for(int i=0; i < angryAnswer.length; i++){
					
					System.out.println( "Sqwuak! " + angryAnswer[i] + "!" );
				}
			}else {
				running = false;
			}
		}
		printFarewell();
		
		
		
		//---------------------------------- ORIGINAL CODE -------------------------------------//
		
		
		
		//give the response from a friendly parrot
		//System.out.println("Okay, fine: " + userInput);
		/*System.out.println( polly.TalkLikeAParrot(userInput) );
		*/
		//this prints out the hex instead of the strings - not good.
		/*System.out.println( polly.TalkLikeAnAngryParrot(userInput) );
		*/
		//System.out.println("-----------------");
		
		
		//this works b/c the return type of this method is a String array (String[]) so you need to call an index
		//let's try this again
		/*String[] angryAnswer = polly.TalkLikeAnAngryParrot(userInput);
		for(int i=0; i < angryAnswer.length; i++){
			System.out.println( "Sqwuak! " + angryAnswer[i] + "!" );
	}
		
	*/
	}
	public static void printMenu() {
		
		System.out.println("-------------------------------");
		System.out.println("     WELCOME TO PARROT SIM");
		System.out.println("-------------------------------");
		System.out.println("Please make a selection");
		System.out.println("(1) Friendly Parrot");
		System.out.println("(2) Angry Parrot");
		System.out.println("(0) EXIT");
		System.out.println("-------------------------------");
		System.out.print("?");
		
		
	}
	
	public static void printFarewell() {
		
		System.out.println("-------------------------------");
		System.out.println("     GOODBYE!");
		System.out.println("-------------------------------");
		
	}
	
	public static String getUserInput(Scanner appScanner) {
		System.out.print("What do you want me to say?: ");
		return appScanner.nextLine();	
	}

}
