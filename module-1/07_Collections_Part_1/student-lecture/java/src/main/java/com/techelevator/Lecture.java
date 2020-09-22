package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Mary");
		names.add("Frank");
		names.add("Jen");
		
		System.out.println("There are " + names.size() + " names in my list.");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		
		Collections.sort(names);
		for(String name : names) {
			System.out.println(name);
		}
	

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Bob");
		for(String name : names) {
			System.out.println(name);
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "Dude");
		for(String name : names) {
			System.out.println(name);
		}
		
		

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(2);
		for(String name : names) {
			System.out.println(name);
		}
		
		//Let's put Dude back
		names.add("Dude");
		for(String name : names) {
			System.out.println(name);
		}
		
		
	

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean inList = names.contains("Dude");
		System.out.println("Is Dude back? " + inList);


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		int dudeIndex = names.indexOf("Dude");
		System.out.println("The index of Dude is: " + dudeIndex);
		
		//How does that help for removing by index?
		
		System.out.println("I can combine indexOf and remove to remove something by its value: ");
		
		names.remove(names.indexOf("Dude"));
		for(String name : names) {
			System.out.println(name);
		}
		
		
		//What about the Bobs?
		System.out.println("--What about the Bobs?");
		
		names.remove("Bob");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Let's put the second Bob back
		names.add(2, "Bob");
		
		System.out.println("--putting Bob#2 back");
		for(String name : names) {
			System.out.println(name);
		}
		
		
		System.out.println("--What could you do to remove all the Bobs?");
		
		
		//NOPE, CAN'T DO IT THIS WAY
		//this will NOT work because you cannot modify elements while cycling through them in a foreach loop
		/*
		 * String nameToRemove = "Bob";
		 * 
		 * int counter = 0;
		 * 
		 * 
		 * 
		 * for(String name : names) { counter++; System.out.println("Iteration " +
		 * counter); if(name.equals(nameToRemove)) { names.remove(nameToRemove); } }
		 * 
		 * for(String name : names) { System.out.println(name); }
		 */


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		//this works the same as the second way below
		String[] listToArray = names.toArray(new String[0]);
		System.out.println(listToArray.length);
		
		//this works the same as the new String[0] way
		String[] listToArray2 = names.toArray(new String[names.size()]);
		System.out.println(listToArray2.length);




		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		
		

		int reverseCounter = 0;
		for(String name : names) {
			
			reverseCounter++;
			System.out.println(reverseCounter + ": " + name);
		}

		
		reverseCounter = 0;
		
		System.out.println("--Let's reverse it and see the new order of items");
		
		//reversing reverses the index, it does not do a sequential or alphabetical reversing
		Collections.reverse(names);
		for(String name : names) {
			reverseCounter++;
			System.out.println(reverseCounter + ": " + name);
		}
		

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//for each name in names
		for(String name : names) {
			//print the name
			System.out.println(name);
		}

	}
}
