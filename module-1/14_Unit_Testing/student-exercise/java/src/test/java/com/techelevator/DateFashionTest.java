package com.techelevator;

import org.junit.Test;

import org.junit.Assert; 

public class DateFashionTest {

	@Test
	public void either_above_eight_returns_two() {
	DateFashion dateFashionTest = new DateFashion();
	int youTest = 5;
	int dateTest = 10;
	int expectedResult = 2;
	
	Assert.assertEquals("Incorrect output returned", expectedResult, dateFashionTest.getATable(youTest, dateTest));
	}
	
	@Test
	public void both_below_eight_returns_zero() {
	DateFashion dateFashionTest = new DateFashion();
	int youTest = 5;
	int dateTest = 2;
	int expectedResult = 0;
	
	Assert.assertEquals("Incorrect output returned", expectedResult, dateFashionTest.getATable(youTest, dateTest));
	}
	
	@Test
	public void both_above_two_but_below_eight_returns_one() {
	DateFashion dateFashionTest = new DateFashion();
	int youTest = 5;
	int dateTest = 5;
	int expectedResult = 1;
	
	Assert.assertEquals("Incorrect output returned", expectedResult, dateFashionTest.getATable(youTest, dateTest));
	}
	
}
