package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class DateFashionTest {

	@Test
	public void either_above_ten_returns_two() {
	DateFashion dateFashionTest = new DateFashion();
	int youTest = 5;
	int dateTest = 10;
	
	Assert.assertEquals("Incorrect output returned", 2, dateFashionTest.getATable(youTest, dateTest));
	}
}
