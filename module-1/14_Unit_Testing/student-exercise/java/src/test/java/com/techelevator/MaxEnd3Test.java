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
	
	@Test
	public void array_with_first_value_largest() {
		MaxEnd3 test = new MaxEnd3();
		
		int[] testArray = new int[] {11,5,9};
		int[] expectedResultArray = new int[] {11,11,11};

		Assert.assertArrayEquals(expectedResultArray, test.makeArray(testArray));
	}
	
	@Test
	public void array_with_largest_value_in_middle_should_return_with_end_values() {
		MaxEnd3 test = new MaxEnd3();
		
		int[] testArray = new int[] {2,22,3};
		int[] expectedResultArray = new int[] {3,3,3};

		Assert.assertArrayEquals(expectedResultArray, test.makeArray(testArray));
	}

}
