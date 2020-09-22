package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		String hello1 = "Hello PHL[2]";
		String hello2 = "Hello PHL[2]";
		

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String myString = "Hello, World!"; //Instantiating with a literal
		System.out.println("Greeting is: " + myString);
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		
		
		System.out.println("Let's evaluate myString - 'Hello, World!' ");
		
		//Does it end in ! ? 
		System.out.println(myString.endsWith("!"));
		System.out.println(myString.startsWith("G"));
		
		//Does it start with "h"?
		System.out.println(myString.startsWith("h"));
		//How about now?
		System.out.println(myString.toLowerCase().startsWith("h"));
		
		System.out.println(myString.toUpperCase());
		//Remember immutability - won't keep myString to all caps when you call it again
		System.out.println(myString);
		
		System.out.println(myString.length());
		
		int myStringLength = myString.length();
		String firstHalf = myString.substring(0, myStringLength/2);
		String secondHalf = myString.substring(5);
		System.out.println(firstHalf);
		System.out.println(secondHalf);
		myString.replace("H", "");
		System.out.println(myString + "GONE!!!!!!!!");
		
		
		//What if I wanted the last 3 of any string?
		String lastThree = myString.substring(myString.length()-3);
		System.out.println(lastThree);
	
		//What about the index of a character?
		System.out.println(myString.toUpperCase().indexOf("L"));
		System.out.println(myString.lastIndexOf("l"));
		
		//Let's get the characters b/t the first and last "l"
		//can also create new variables for those first and last indexes to shorten up the code below
		System.out.println(myString.substring(myString.indexOf("l"), myString.lastIndexOf("l"))); //starting index is inclusive BUT ending index is exclusive
		
		

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();



		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		String part1 = "Hello ";
		String part2 = "PHL[2]";
		String hello4 = part1 + part2;
		
		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
		
		//Let's compare them when the literal is the same through concatenation
		if (hello1 == hello4) {
			System.out.println("hello1 is the same reference as hello4");
		}else {
			System.out.println(hello4 + "is NOT the same reference as " + hello1 + " even though the literals match");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello4)) {
			System.out.println("They are equal in their VALUE!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
