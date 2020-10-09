package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in); 
		System.out.println("What is the file that should be searched?");
		File inputFile = new File(in.nextLine());
		if(inputFile.exists()) {
		
			System.out.println("What is the word you want to replace?");
			String wordToBeReplaced = in.nextLine();
			System.out.println("What word do you want to replace " + wordToBeReplaced + " with?");
			String replacementWord = in.nextLine();
			System.out.println("What is the name of the destination file?");
			String destinationFile = in.nextLine();
			File newFile = new File(destinationFile);
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			try (
					Scanner dataInput = new Scanner(inputFile);	
					PrintWriter dataOutput = new PrintWriter(newFile)	
					
					){
					while(dataInput.hasNextLine()) {
						String lineOfInput = dataInput.nextLine();
//						String newLine = lineOfInput.replaceAll(wordToBeReplaced, replacementWord);
						if(lineOfInput.contains(wordToBeReplaced)) {
							lineOfInput = lineOfInput.replaceAll(wordToBeReplaced, replacementWord);
						
						}
						dataOutput.println(lineOfInput);
					}		
			}
		}else {
			System.exit(1);
		}
		in.close();
	}

}
