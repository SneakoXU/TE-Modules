package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		

		int lineNumber = 0;
		
		
		Scanner in = new Scanner(System.in); 
		System.out.println("What is the file that should be searched?");
		File inputFile = new File(in.nextLine());
		
		System.out.println("What is the search word you are looking for?");
		String wordToBeSearched = in.nextLine();
		System.out.println("Should the search be case sensitive? (Y/N)");
		String userAnswer = in.nextLine();
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inputFile);
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineNumber++;
				String noPunctuation = line.replaceAll("\\p{Punct}", "");
				String[] word = noPunctuation.split(" ");
				
				for(String wordCount: word) {
					if(userAnswer.equalsIgnoreCase("y")) {
						if(wordCount.equals(wordToBeSearched)) {
							System.out.println(lineNumber + ") " + line);
					}
					}		
					if(userAnswer.equalsIgnoreCase("n")){		
						if(wordCount.contains(wordToBeSearched.toLowerCase())) {
							System.out.println(lineNumber + ") " + line);
					}
					}	
			}
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
			in.close();
	}
	

}
