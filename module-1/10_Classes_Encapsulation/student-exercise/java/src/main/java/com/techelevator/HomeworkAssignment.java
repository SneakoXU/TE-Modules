package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	

	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
		
	}

	public int getEarnedMarks() {
		return this.earnedMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public int getPossibleMarks() {
		return this.possibleMarks;
	}

	public String getSubmitterName() {
		return this.submitterName;
	}

	public String getLetterGrade() {
		letterGrade = "";
		double grade = 100*((double) earnedMarks/(double) possibleMarks);
		
		if(grade >= 90) {
			letterGrade = "A";
		}else if(grade >= 80 && grade < 90) {
			letterGrade = "B";
		}else if(grade >=70 && grade < 80) {
			letterGrade = "C";
		}else if(grade >= 60 && grade < 70) {
			letterGrade = "D";
		}else {
			letterGrade = "F";
		}
		return letterGrade;
	}


}
