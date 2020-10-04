package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class Lucky13Test {
	
	@Test
	public void getLuckyTest() {
		Lucky13 test = new Lucky13();
		
		int[] testArray = new int[] {0 ,2, 4};
		boolean actualResult = true;
		
		Assert.assertEquals("Output is incorrect", actualResult, test.getLucky(testArray));
		
		
		
	}

}
