package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		String question = "";
		String answer = "";
		String userChoice1 = "";
		String userChoice2 = "";
		String userChoice3 = "";
		String userChoice4 = "";
		
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Where is the quiz file?");
		File inputFile = new File(in.nextLine());
		
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNextLine()) {
			
				//stores each string until the |
				String line = fileScanner.nextLine();
				String[] lines = line.split("\\|");
				
				
				
				//stores first array before the | as the question
				question = lines[0];
				System.out.println(question);
				
				/*
				 * storing remaining arrays separated by | 
				 * and removing asterisk
				*/
				userChoice1 = lines[1];
				userChoice1 = userChoice1.replace("*", "");
				System.out.println("1. " + userChoice1);
				userChoice2 = lines[2];
				userChoice2 = userChoice2.replace("*", "");
				System.out.println("2. " + userChoice2);
				userChoice3 = lines[3];
				userChoice3 = userChoice3.replace("*", "");
				System.out.println("3. " + userChoice3);
				userChoice4 = lines[4];
				userChoice3 = userChoice3.replace("*", "");
				System.out.println("4. " + userChoice4);
				
				
				/* NEED TO GET USER ANSWER FOR QUESTION 1 
				 * AND CHECK IF CORRECT OR INCORRECT
				 */

				
				//reads second line and separates at |
				String lineTwo = fileScanner.nextLine();
				String[] lines2 = lineTwo.split("\\|");
				
				//stores question
				String question2 = lines2[0];
				System.out.println(question2);
				
				/*
				 * storing remaining arrays separated by | 
				 * and removing asterisk
				*/
				userChoice1 = lines2[1];
				userChoice1 = userChoice1.replace("*", "");
				System.out.println("1. " + userChoice1);
				userChoice2 = lines2[2];
				userChoice2 = userChoice2.replace("*", "");
				System.out.println("2. " + userChoice2);
				userChoice3 = lines2[3];
				userChoice3 = userChoice3.replace("*", "");
				System.out.println("3. " + userChoice3);
				userChoice4 = lines2[4];
				userChoice3 = userChoice3.replace("*", "");
				System.out.println("4. " + userChoice4);
				
				/* NEED TO GET USER ANSWER FOR QUESTION 2 
				 * AND CHECK IF CORRECT OR INCORRECT
				 */		
			}			
			
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}

}
}
