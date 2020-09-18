package com.techelevator.command_line_application_lecture;



public class ParrotHelperClass {
	
	public String TalkLikeAParrot(String plainEnglish) {
		
		String result;
		
		result = ("Squawk, " + plainEnglish);
		
		return result;
	}
	
	public String[] TalkLikeAnAngryParrot(String plainEnglish) {
		
		
		return plainEnglish.split(" "); //since it's split, it knows that it fits into the String[]
	}
}
