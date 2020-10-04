package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class MaxEnd3Test {
	
	@Test
	public void array_123_should_return_333() {
		MaxEnd3 test = new MaxEnd3();
		
		int[] testArray = new int[] {1,2,3};
		int[] expectedResultArray = new int[] {3,3,3};

		Assert.assertArrayEquals(expectedResultArray, test.makeArray(testArray));

		
	}

}
