package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws IOException {
		
		int linesOfText = 0;
		int fileNumber = 1;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Where is the input file (please include the path to the file)?");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		
		System.out.println("How many lines of text (max) should there be in the split files?");
		String maxLines = userInput.nextLine();
		
		try (
			Scanner dataInput = new Scanner(inputFile);	
			PrintWriter dataOutput = new PrintWriter("input-1.txt")	
			){
				while(dataInput.hasNext()) {
					linesOfText++;
					String lineOfInput = dataInput.nextLine();
					dataOutput.println(lineOfInput);
				}
		
				

					
					
				
			
				
				//fileNumber++;
			//}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("The input file has " + linesOfText + " lines of text.");
		
		System.out.println("\n**GENERATING OUTPUT**\n");
		
//		int numberOfFiles = 0;
		
//		numberOfFiles = linesOfText/intMaxLines;
		

		
		userInput.close();
	}

}
