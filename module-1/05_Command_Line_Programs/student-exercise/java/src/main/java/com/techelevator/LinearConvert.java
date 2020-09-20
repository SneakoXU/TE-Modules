package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		String userLength = in.nextLine();
		double userLengthParse = Double.parseDouble(userLength);
		
		
		System.out.println("Is the measurement in (m)eter or (f)eet? ");
		//Scanner inSelect = new Scanner(System.in);
		String selection = in.nextLine();
		
		if(selection.equalsIgnoreCase("m")) {
			System.out.println(meterToFeet(userLengthParse));
			
		}if(selection.equalsIgnoreCase("f")) {
			System.out.println(footToMeter(userLengthParse));
		}
		in.close();
		//inSelect.close();

	}
	
	public static String footToMeter(double feetInput) {
		double meter = 0D;
		meter = feetInput * 0.3048;
		return (feetInput + "f is " + meter +"m");
		
	}
	
	public static String meterToFeet(double meterInput) {
		double feet = 0D;
		feet = meterInput * 3.2808399;
		return (meterInput + "m is " + feet +"f");
	}

}
