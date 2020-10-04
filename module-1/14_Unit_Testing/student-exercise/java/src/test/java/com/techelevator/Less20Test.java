package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class Less20Test {
	
	@Test
	public void less_than_20_by_two_should_return_true() {
		Less20 less20Test = new Less20();
		boolean expected = true;
		int testNum = 18;
		
		Assert.assertEquals("Expected output is incorrect", expected, less20Test.isLessThanMultipleOf20(testNum));
	}

	@Test
	public void less_than_20_by_one_should_return_true() {
		Less20 less20Test = new Less20();
		boolean expected = true;
		int testNum = 19;
		
		Assert.assertEquals("Expected output is incorrect", expected, less20Test.isLessThanMultipleOf20(testNum));
	}
	
	@Test
	public void n_equals_20_should_return_false() {
		Less20 less20Test = new Less20();
		boolean expected = false;
		int testNum = 20;
		
		Assert.assertEquals("Expected output is incorrect", expected, less20Test.isLessThanMultipleOf20(testNum));
	}
}
