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
		String userChoice = "";
		int correct = 0;

		
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Where is the quiz file?");
		File inputFile = new File(in.nextLine());
		
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNextLine()) {
			
				//reads first line and stores each string until the |
				
				String line = fileScanner.nextLine();
				String[] lines = line.split("\\|");
			
				
				//stores first array before the | as the question
				question = lines[0];
				System.out.println(question);
				
				
				for(Integer i=1; i<lines.length; i++) {
					/*
					 * storing remaining arrays separated by | 
					 * and removing asterisk
					*/
					userChoice = lines[i];
					if(userChoice.contains("*")) {
						answer = i.toString();
						answer = answer.replace("*", "");
						//System.out.println("This is the correct choice: " + answer);
					}
					userChoice = userChoice.replace("*", "");
					System.out.println(i + ". " + userChoice);
				}		
				
				
				//Gets user answer and checks if correct
				System.out.println("Your answer: ");
				String userAnswer = in.nextLine();
				if(userAnswer.equals(answer)) {
					System.out.println("\nCorrect!\n");
					correct++;
				}else {
					System.out.println("\nSorry that isn't correct!\n");
				}
			}System.out.println("You got " + correct + " answer(s) correct out of a total 2 questions asked.");			
			
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}in.close();

}
	
	
}
