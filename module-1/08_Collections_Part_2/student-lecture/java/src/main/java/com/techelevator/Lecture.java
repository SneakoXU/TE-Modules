package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//Declaring and initializing a map
		Map<String, String> nameToZipCode = new HashMap<String, String>();
		
		//Adding item(s) to a map
		nameToZipCode.put("Bob", "19001");
		nameToZipCode.put("Mary", "19003");
		nameToZipCode.put("Frank", "19002");
		
		//Retrieve item(s) from the map
		System.out.println("Mary lives in: " + nameToZipCode.get("Mary"));
		System.out.println("Bob lives in: " + nameToZipCode.get("Bob"));
		
		//We can also retrieve the values from a map using a for...each loop! - No HARD CODING!
		
		System.out.println(" --- For Each used to retrieve values from a map using keys and a set to get the value --- ");
		
		Set<String> names = nameToZipCode.keySet();
		for(String name : names) {
			//System.out.println(name);
			
			System.out.println(name + " lives in: " + nameToZipCode.get(name));
		}
		
		//Let's check to see if a key exists
		
		System.out.println(" --- Adding a new entry and checking for existence --- ");
		
		String newKey = "David";
		String newValue = "19101";
		
		if(nameToZipCode.containsKey(newKey)) {
			System.out.println(newKey + " already exists!");
		}else
		{
			System.out.println("Adding value for " + newKey);
			nameToZipCode.put(newKey, newValue);		
		}
		
		
		//Second run
		
		System.out.println(" --- Trying to add the same entry with the same key and checking for existence --- ");
		
		newKey = "David";
		newValue = "19107";
		
		if(nameToZipCode.containsKey(newKey)) {
			System.out.println(newKey + " already exists!");
		}else
		{
			System.out.println("Adding value for " + newKey);
			nameToZipCode.put(newKey, newValue);		
		}
		
		
		System.out.println(" --- Checking the contents of my Map --- ");
		names = nameToZipCode.keySet(); //don't need to re-declare names since it already was above
		for(String name : names) {
			
			System.out.println(name + " lives in: " + nameToZipCode.get(name));
		}
		
		System.out.println(" --- Let's take the \"contains\" condition back out of the put() & enter in David's new zipcode --- ");

		System.out.println("Adding value for " + newKey);
		nameToZipCode.put(newKey, newValue);
		
		names = nameToZipCode.keySet(); 
		for(String name : names) {
			
			System.out.println(name + " lives in: " + nameToZipCode.get(name));
		}
		
		
		//Let's remove David
		System.out.println(" --- Let's remove David's entry --- ");
		nameToZipCode.remove("David");
		if(!nameToZipCode.containsKey("David")) {
			System.out.println("David has been removed.");
		}else {
			System.out.println("Something went horribly wrong!");
		}
		
		names = nameToZipCode.keySet(); 
		for(String name : names) {
			
			System.out.println(name + " lives in: " + nameToZipCode.get(name));
		}
		
		
		//Maps can also be iterated through over the KVP
		System.out.println("\n --- Let's iterate though the entry set/the key value pairs --- ");
		
		for(Map.Entry<String, String> nameZipEntry : nameToZipCode.entrySet()) {
			System.out.println(nameZipEntry.getKey() + " lives in zip code: " + nameZipEntry.getValue());
		} 
		
		
	}

}
