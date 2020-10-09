package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert; 

public class WordCountTest {
	
	@Test
	public void ba_ba_black_sheep_test() {
		WordCount testWordCount = new WordCount();
		String[] testWords = new String[] {"ba", "ba", "black", "sheep"};
		Map<String,Integer> expectedOutput = new HashMap<String, Integer>();
				expectedOutput.put("ba", 2);
				expectedOutput.put("black", 1);
				expectedOutput.put("sheep", 1);
				
		Assert.assertEquals("Output returned is incorrect", expectedOutput, testWordCount.getCount(testWords));		
		
	}
	
	@Test
	public void a_b_a_c_b_test() {
		WordCount testWordCount = new WordCount();
		String[] testWords = new String[] {"a", "b", "a", "c", "b"};
		Map<String,Integer> expectedOutput = new HashMap<String, Integer>();
				expectedOutput.put("a", 2);
				expectedOutput.put("b", 2);
				expectedOutput.put("c", 1);
				
		Assert.assertEquals("Output returned is incorrect", expectedOutput, testWordCount.getCount(testWords));		
	}
	
	@Test
	public void c_b_a_test() {
		WordCount testWordCount = new WordCount();
		String[] testWords = new String[] {"c", "b", "a"};
		Map<String,Integer> expectedOutput = new HashMap<String, Integer>();
				expectedOutput.put("c", 1);
				expectedOutput.put("b", 1);
				expectedOutput.put("a", 1);
				
		Assert.assertEquals("Output returned is incorrect", expectedOutput, testWordCount.getCount(testWords));		
		
	}

}
