package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert; 

public class WordCountTest {
	
	@Test
	public void test() {
		WordCount testWordCount = new WordCount();
		String[] testWords = new String[] {"ba", "ba", "black", "sheep"};
		Map<String,Integer> expectedOutput = new HashMap<String, Integer>();
				expectedOutput.put("ba", 2);
				expectedOutput.put("black", 1);
				expectedOutput.put("sheep", 1);
				
		Assert.assertEquals("Output returned is incorrect", expectedOutput, testWordCount.getCount(testWords));		
		
	}

}
