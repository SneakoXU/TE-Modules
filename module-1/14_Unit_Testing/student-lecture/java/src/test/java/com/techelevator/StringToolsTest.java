package com.techelevator;

import org.junit.Test;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.AfterClass;
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.BeforeClass;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;



public class StringToolsTest {

	@Test
	public void aba_find_a_returns_two() {
		StringTools st = new StringTools();
		String inputString = "aba";
		String characterMatch = "a";
		
		Assert.assertEquals(2, st.numberOfCharacters(inputString, characterMatch));
	}
}
