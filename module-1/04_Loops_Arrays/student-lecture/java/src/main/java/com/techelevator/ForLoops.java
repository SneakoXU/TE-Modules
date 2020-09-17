package com.techelevator;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how many times do I want to do my work?
		int iterations = 10;
		
		//do my work # of iterations times
		for(int i = 0; i<iterations;i++) {
			System.out.println("Number of iterations: " + i);
		}	
		
		boolean run = true;
		int counter = 10;
		while(run) {
			
			
			System.out.println("I am whiling #" + counter);
			
			if(counter == 10) {
				run = false;
			}else 
			{
				counter++;
			}
			
		}
		run = true;
		counter = 0;
		do {
			
			counter++;
			System.out.println("I am doing #" + counter);
			
			if(counter == 10) {
				run = false;
			}
			
		}while(run);
		
	}

}
