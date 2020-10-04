package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class CigarPartyTest {
	
	@Test
	public void less_than_40_cigars_should_return_false() {
		CigarParty testParty = new CigarParty();
		int cigarTest = 30;
		boolean isWeekendTest = false;
		
		Assert.assertFalse("Incorrect boolean output", testParty.haveParty(cigarTest, isWeekendTest));
	}
	
	@Test
	public void more_than_40_cigars_should_return_true() {
		CigarParty testParty = new CigarParty();
		int cigarTest = 50;
		boolean isWeekendTest = false;
		
		Assert.assertTrue("Incorrect boolean output", testParty.haveParty(cigarTest, isWeekendTest));
	}
	
	@Test
	public void more_than_40_cigars_and_weekend_return_true() {
		CigarParty testParty = new CigarParty();
		int cigarTest = 50;
		boolean isWeekendTest = true;
		
		Assert.assertTrue("Incorrect boolean output", testParty.haveParty(cigarTest, isWeekendTest));
	}
	
	

}
