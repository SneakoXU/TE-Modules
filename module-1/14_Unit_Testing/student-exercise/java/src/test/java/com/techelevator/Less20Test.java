package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class Less20Test {
	
	@Test
	public void less_than_20_should_return_true() {
		Less20 less20Test = new Less20();
		boolean actual = true;
		int testNum = 18;
		
		Assert.assertEquals("Expected output is incorrect", actual, less20Test.isLessThanMultipleOf20(testNum));
	}

}
