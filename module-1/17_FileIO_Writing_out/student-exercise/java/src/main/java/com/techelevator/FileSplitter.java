package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws IOException {
		
		int linesOfText = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Where is the input file (please include the path to the file)?");
		String path = userInput.nextLine();
		File userFile = new File(path);
		
		System.out.println("How many lines of text (max) should there be in the split files?");
		String maxLines = userInput.nextLine();
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(userFile);
			while(fileScanner.hasNextLine()) {
				linesOfText++;
				String lines = fileScanner.nextLine();
				String[] lineArrays = lines.split("\n");
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("The input file has " + linesOfText + " lines of text.");
		
		int numberOfFiles = 0;
		Integer intMaxLines = Integer.parseInt(maxLines);
		numberOfFiles = linesOfText/intMaxLines;
		
		System.out.println("\n**GENERATING OUTPUT**\n");
		
		for(int i = 1; i<=numberOfFiles; i++) {
			File splitFile = new File("input-" + i + ".txt");
			splitFile.createNewFile();
			try(PrintWriter writer = new PrintWriter(splitFile)){
				
			}
					
		}
		
		
	}

}
