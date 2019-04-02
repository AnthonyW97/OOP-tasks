//**********************************************//
//* Author: 1716208                            *//
//* Week: 4                                    *//
//* Tutorial Task: 1a                          *//
//* Description:                               *//
//*                                            *//
//* Date: 11/02/18                             *//
//*                                            *//
//**********************************************//

import java.util.Scanner;

public class task1 {
	
	public static void main(String args[]) {
		
		Scanner userIn = new Scanner(System.in);
	
		//create variables to hold the user input
		int a;
		int b;
	
		//create variable to hold the sum of the entered values
		int sum;
	
		//get the user input
		System.out.println("Enter first number...");
		a = userIn.nextInt();
	
		System.out.println("Enter second number...");
		b = userIn.nextInt();
	
		sum = a + b;
		
		//print the sum of the 2 values
		System.out.println(sum);
		
		userIn.close();
	
	}
}
