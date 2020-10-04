package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class FrontTimesTest {
	
	
	@Test
	public void chocolate_copied_twice_equals_chocho() {
	FrontTimes generateStringTest = new FrontTimes();
	
	String testString = "Chocolate";
	int testAmountOfCopies = 2;
	String expectedOutput = "ChoCho";
	
	Assert.assertEquals("Output returned is incorrect", expectedOutput, generateStringTest.generateString(testString, testAmountOfCopies));
	}
}
