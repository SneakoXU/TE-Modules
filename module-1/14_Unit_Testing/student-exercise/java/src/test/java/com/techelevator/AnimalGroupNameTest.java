package com.techelevator;

import org.junit.Test;

import org.junit.Assert; // The Assert class has static assertion methods for validating test results

public class AnimalGroupNameTest {

	
	@Test
	public void rhino_should_return_crash(){
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "rhino";
		String expectedString = "Crash";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));	
	}
	
	@Test
	public void Rhino_should_return_crash(){
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "Rhino";
		String expectedString = "Crash";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));	
	}
	
	@Test
	public void giraffe_should_return_tower() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "giraffe";
		String expectedString = "Tower";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));
		
	}
	
	@Test
	public void elephants_should_return_unknown() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "elephants";
		String expectedString = "unknown";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));
	}
	
	@Test
	public void empty_should_return_unknown() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "";
		String expectedString = "unknown";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));
	}
	
	@Test
	public void walrus_should_return_unknown() {
		AnimalGroupName test = new AnimalGroupName();
		String testAnimal = "walrus";
		String expectedString = "unknown";
		Assert.assertEquals("Group returned is not correct", expectedString, test.getHerd(testAnimal));
	}
	
	

}
