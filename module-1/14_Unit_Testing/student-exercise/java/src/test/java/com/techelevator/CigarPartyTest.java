package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class CigarPartyTest {
	
	@Test
	public void havePartyTest() {
		CigarParty testParty = new CigarParty();
		int cigarTest = 30;
		boolean isWeekendTest = false;
		
		Assert.assertFalse("Incorrect boolean output", testParty.haveParty(cigarTest, isWeekendTest));
		
	}

}
