package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printPrompt();
		String fibString = in.nextLine();
		//Integer fibInt = changeToInt(fibString);
		
		fibonacci(changeToInt(fibString));
		//fibonacci(fibInt);
		
		
		//boolean running = true;
		
		//while(running) {
		
		//}
		in.close();

	}
	
	public static void printPrompt() {
		System.out.println("Please enter the Fibonacci number: ");
	}
	
	public static void fibonacci(int fibNum) {
		int firstFib = 0;
		int secondFib = 1;
		while(firstFib <= fibNum) {
			System.out.print(firstFib + " ");
			int sum = firstFib + secondFib;
			firstFib = secondFib;
			secondFib = sum;
			}	
	}
	
	public static int changeToInt(String stringPassed) {
		Integer changedInt = Integer.parseInt(stringPassed);
		return changedInt;
	}

}
