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
	
	@Test
	public void java_code_should_return_avaode() {
		NonStart testNonStart = new NonStart();
		String testStringA = "java";
		String testStringB = "code";
		String expectedResult = "avaode";
		
		Assert.assertEquals("String output returned is incorrect", expectedResult, testNonStart.getPartialString(testStringA, testStringB));
	}
	
	@Test
	public void shotl_java_should_return_hotlava() {
		NonStart testNonStart = new NonStart();
		String testStringA = "shotl";
		String testStringB = "java";
		String expectedResult = "hotlava";
		
		Assert.assertEquals("String output returned is incorrect", expectedResult, testNonStart.getPartialString(testStringA, testStringB));
	}

}
