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
	
	@Test
	public void chocolate_copied_three_times_equals_chochocho() {
	FrontTimes generateStringTest = new FrontTimes();
	
	String testString = "Chocolate";
	int testAmountOfCopies = 3;
	String expectedOutput = "ChoChoCho";
	
	Assert.assertEquals("Output returned is incorrect", expectedOutput, generateStringTest.generateString(testString, testAmountOfCopies));
	}
	
	@Test
	public void abc_copied_three_times_equals_abcabcabc() {
	FrontTimes generateStringTest = new FrontTimes();
	
	String testString = "Abc";
	int testAmountOfCopies = 3;
	String expectedOutput = "AbcAbcAbc";
	
	Assert.assertEquals("Output returned is incorrect", expectedOutput, generateStringTest.generateString(testString, testAmountOfCopies));
	}
}
