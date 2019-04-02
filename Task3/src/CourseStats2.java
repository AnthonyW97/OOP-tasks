//**********************************************//
//* Author: 1716208                            *//
//* Week:5                                 	   *//
//* Tutorial Task:3b                           *//
//* Description:                               *//
//*                                            *//
//* Date: 01/03/19      	                   *//
//*                                            *//
//**********************************************//

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class CourseStats2 {
	
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		
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
				
		while(entryCounter <20) {
		String grade = JOptionPane.showInputDialog("Enter student result");
		int result = Integer.parseInt(grade);
		
		//1 is a pass. 2 is a fail
		//if the grade is  1, then add 1 to the pass counter
		if(result == 1) {
			passCounter++;
		}
		else if(result == 2) {
			failCounter++;
		}
		
		entryCounter++;
		}
		
		//if the total number of passes is greater than 16, print a message of congratulations to tutors
		if (passCounter >= 16) {
			JOptionPane.showMessageDialog(frame, "pass: " + passCounter + " Well done tutors!");
		}
		else {
			JOptionPane.showMessageDialog(frame, "Fewer than 16 students have passed.");
		}
		
		
		
	}

}
