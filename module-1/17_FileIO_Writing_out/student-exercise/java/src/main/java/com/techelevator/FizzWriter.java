package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
	
		String fileName = "FizzBuzz.txt";
		File newFile = new File(fileName);
		newFile.createNewFile();
		
		try (PrintWriter writer = new PrintWriter(newFile)){
			for(Integer i=1; i<=300; i++) {
				String iAsString = Integer.toString(i);
				if(i%3==0 && i%5==0) {
					writer.println("FizzBuzz");
				}else if(iAsString.contains("3") && iAsString.contains("5")) {
					writer.println("FizzBuzz");
				}else if(i%3==0 || iAsString.contains("3")) {
					writer.println("Fizz");
				}else if(i%5==0 || iAsString.contains("5")) {
					writer.println("Buzz");
				}else {
					writer.println(i);
				}	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(newFile.exists()) {
			System.out.println(fileName + " has been created.");
		}else {
			System.out.println("Something went wrong. The file was not created.");
		}
		

	}
}

