package com.techelevator;

import org.junit.Test;

import org.junit.Assert; // The Assert class has static assertion methods for validating test results

public class AnimalGroupNameTest {
//	
//	@Before
//	public void setup() {
//		
//	}
	
	@Test
	public void rhino_should_return_crash(){
		AnimalGroupName test = new AnimalGroupName();
//		Map<String, String> testAnimals = new HashMap<>();	
		//String testAnimal = "rhino";

		String testAnimal = "rhino";
		//		testAnimals.put("rhino", "Crash");
//		Set<String> testKeySet = testAnimals.keySet();
//		for (String testKey : testKeySet){
//			testGroup = testAnimals.get(testKey);
//		}
		//test.getHerd(testAmimal);
		
		Assert.assertEquals("Group returned is not correct", "Crash", test.getHerd(testAnimal));
		
	}
	
	@Test
	public void giraffe_should_return_tower() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "giraffe";
		Assert.assertEquals("Group returned is not correct", "Tower", test.getHerd(testAnimal));
	}
	
	@Test
	public void elephant_should_return_herd() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "elephant";
		Assert.assertEquals("Group returned is not correct", "Herd", test.getHerd(testAnimal));
	}

}
