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
	
	@Test
	public void hi_should_return_h() {
		StringBits testBits = new StringBits();
		String testString = "Hi";
		String expectedResult = "H";
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testBits.getBits(testString));
	}
	
	@Test
	public void heeololeo_should_return_hello() {
		StringBits testBits = new StringBits();
		String testString = "Heeololeo";
		String expectedResult = "Hello";
		
		Assert.assertEquals("Output returned is incorrect", expectedResult, testBits.getBits(testString));
	}


}
