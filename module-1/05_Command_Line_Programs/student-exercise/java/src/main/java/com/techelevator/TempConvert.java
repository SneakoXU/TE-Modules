package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter the temperature: ");
		Scanner in = new Scanner(System.in);
		Double tempInputDouble = 0D;
		String tempInput = tempInputDouble.toString();
		tempInput = in.nextLine();
		
		
		System.out.println("Is the temperature in (C)elsius or (F)ahrenheit? ");
		//Scanner inSelect = new Scanner(System.in);
		String selection = in.nextLine();
		
		
		if(selection.equalsIgnoreCase("C")) {
			double fahrenheitTemp = 0;
			fahrenheitTemp = tempInputDouble * 1.8 + 32;
			System.out.println(tempInput + "C is " + fahrenheitTemp + "F.");
		}
		
		
		if(selection.equalsIgnoreCase("F")) {
			double celsiusTemp = 0;
			celsiusTemp = celsiusTemp * 1.8 + 32;
			System.out.println(tempInput + "F is " + celsiusTemp + "C.");
		}
		
		in.close();
		//inSelect.close();

	}

}
