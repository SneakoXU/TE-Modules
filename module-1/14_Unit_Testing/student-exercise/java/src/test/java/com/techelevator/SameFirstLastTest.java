package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class SameFirstLastTest {
	
	@Test
	public void array_123_should_return_false() {
		SameFirstLast testSameFirstLast = new SameFirstLast();
		
		int[] testNumArray = new int[] {1,2,3};
		boolean expectedResult = false;
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testSameFirstLast.isItTheSame(testNumArray));
	}
	
	@Test
	public void array_1231_should_return_true() {
		SameFirstLast testSameFirstLast = new SameFirstLast();
		
		int[] testNumArray = new int[] {1,2,3,1};
		boolean expectedResult = true;
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testSameFirstLast.isItTheSame(testNumArray));
	}
	
	@Test
	public void array_121_should_return_true() {
		SameFirstLast testSameFirstLast = new SameFirstLast();
		
		int[] testNumArray = new int[] {1,2,1};
		boolean expectedResult = true;
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testSameFirstLast.isItTheSame(testNumArray));
	}


}
