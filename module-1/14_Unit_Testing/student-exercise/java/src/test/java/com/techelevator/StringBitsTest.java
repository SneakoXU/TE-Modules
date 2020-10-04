package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class StringBitsTest {
	
	@Test
	public void hello_should_return_hlo() {
		StringBits testBits = new StringBits();
		String testString = "Hello";
		String expectedResult = "Hlo";
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testBits.getBits(testString));
	}

}
