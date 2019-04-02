//**********************************************//
//* Author: 1716208                            *//
//* Week:5                                 	   *//
//* Tutorial Task:3a                           *//
//* Description:                               *//
//*                                            *//
//* Date: 01/03/19      	                   *//
//*                                            *//
//**********************************************//

import java.util.Scanner;

public class CourseStats {
	
	public static void main(String args[]) {
		//create a scanner for user accepting grade inputs
		Scanner userIn = new Scanner(System.in);
		
		//create a variable to count the number of passes and fails
		int passCounter;
		int failCounter;
		//create a variable to count the number of entries
		int entryCounter;
		
		//initialise all variables, make them equal to 0
		passCounter = 0;
		failCounter = 0;
		
		entryCounter = 0;
		
		//there will be 20 entries, so only run as long as the total number of entries are less than or equal to 20
		while(entryCounter <=20) {
			System.out.println("Enter next student's result...");
			int grade = userIn.nextInt();
			//1 is a pass. 2 is a fail
			//if the grade is  1, then add 1 to the pass counter
			if(grade == 1) {
				passCounter++;
			}
			else if(grade == 2) {
				failCounter++;
			}
			
			//after the grade has been assigned, add 1 to the entry counter
			entryCounter++;
		}
		
		//if the total number of passes is greater than 16, print a message of congratulations to tutors
		if (passCounter >= 16) {
			System.out.println("Pass: " + passCounter + " Well done tutors!");
		}
		else {
			System.out.println("Fail: "+failCounter);
		}
		
		userIn.close();
		
	}
}
