package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class Lucky13Test {
	
	@Test
	public void array_024_should_return_true() {
		Lucky13 test = new Lucky13();
		
		int[] testArray = new int[] {0 ,2, 4};
		boolean expectedResult = true;
		
		Assert.assertEquals("Output is incorrect", expectedResult, test.getLucky(testArray));
	}
	
	@Test
	public void array_123_should_return_false() {
		Lucky13 test = new Lucky13();
		
		int[] testArray = new int[] {1,2,3};
		boolean expectedResult = false;
		
		Assert.assertEquals("Output is incorrect", expectedResult, test.getLucky(testArray));
	}
	
	@Test
	public void array_124_should_return_false() {
		Lucky13 test = new Lucky13();
		
		int[] testArray = new int[] {1,2,4};
		boolean expectedResult = false;
		
		Assert.assertEquals("Output is incorrect", expectedResult, test.getLucky(testArray));
	}

}
