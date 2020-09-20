package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		
		printPrompt();
		Scanner in = new Scanner(System.in);
		
		String tempInput = in.nextLine();
		Double tempInputDouble = Double.parseDouble(tempInput); 
		
		
		printTempChoice();
		//Scanner inSelect = new Scanner(System.in);
		String selection = in.nextLine();
		
		
		if(selection.equalsIgnoreCase("C")) {
//			double fahrenheitTemp = 0;
//			fahrenheitTemp = tempInputDouble * 1.8 + 32;
			System.out.println(celToF(tempInputDouble));
		}
//		
//		
		if(selection.equalsIgnoreCase("F")) {
//			double celsiusTemp = 0;
//			celsiusTemp = tempInputDouble * 1.8 + 32;
			System.out.println(fahrenheitToC(tempInputDouble));
		}
		
		in.close();
		//inSelect.close();

	}
	
	public static void printPrompt() {
		System.out.println("Please enter the temperature: ");
		
	}
	
	public static void printTempChoice() {
		System.out.println("Is the temperature in (C)elsius or (F)ahrenheit? ");
	}
	
	public static String celToF(double celsiusInput) {
		double fahrenheitTemp = 0;
		fahrenheitTemp = celsiusInput * 1.8 + 32; //tempInpuTDouble
		return (celsiusInput + "C is " + fahrenheitTemp + "F.");

	}
	
	public static String fahrenheitToC (double fahrenheitInput) {
		double celsiusTemp = 0;
		celsiusTemp = (fahrenheitInput - 32) / 1.8;
		return (fahrenheitInput + "F is " + celsiusTemp + "C.");
	
		}
	}
	
		
