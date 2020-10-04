package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class NonStartTest {
	
	@Test
	public void hello_there_should_return_ellohere() {
		NonStart testNonStart = new NonStart();
		String testStringA = "Hello";
		String testStringB = "There";
		String expectedResult = "ellohere";
		
		Assert.assertEquals("String output returned is incorrect", expectedResult, testNonStart.getPartialString(testStringA, testStringB));
	}

}
