//**********************************************//
//* Author: 1716208                            *//
//* Week: 4                                    *//
//* Tutorial Task: 1b                          *//
//* Description:                               *//
//*                                            *//
//* Date: 11/02/18                             *//
//*                                            *//
//**********************************************//

import java.util.Scanner;

public class Task1b {
	
	public static void main(String args[]) {
		
		//create scanner object
		Scanner userInput = new Scanner(System.in);
		
		//create variables to hold user input
		int a;
		int b;
		int c;
		
		//create variable to hold the sum of the values
		int sum;
		
		System.out.println("Enter the first number...");
		a = userInput.nextInt();
		
		System.out.println("Enter the second number...");
		b = userInput.nextInt();
		
		System.out.println("Enter the third number...");
		c = userInput.nextInt();
		
		//create a 'hold' variable so that the values of variables can be swapped
		int hold;
		
		//if a is greater than c then swap them, using the hold variable
		if(a>c) {
			hold = a;
			a = c;
			c = hold;
		}
		//if a is greater than b then swap them, using the hold variable
		if(a>b) {
			hold = a;
			a = b;
			b = hold;
		}
		//if b is greater than c then swap them, using the hold variable
		if(b>c) {
			hold = b;
			b = c;
			c = hold;
		}
		
		System.out.println("Ordered: " + "[" + a + ", " + b + ", " + c + "]");
		
		//add the 3 integers together
		sum = a+b+c;
		
		//print out the average of the entered values
		System.out.println("The average of the entered values is: " + (sum/3));
		
	}

}
