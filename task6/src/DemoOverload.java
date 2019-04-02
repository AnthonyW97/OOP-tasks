//**********************************************//
//* Author: 1716208                            *//
//* Week:7                                     *//
//* Tutorial Task:5                            *//
//* Description:                               *//
//*                                            *//
//* Date: 02/04/19                             *//
//*                                            *//
//**********************************************//
public class DemoOverload {

	//this is the first example of a sum method, specifically for ints
	public static int sum(int a, int b) {
		int sum = 0;
		//sum is the first int plus the second int
		sum = a + b;
		//display result
		return sum;
	}
	
	//this is the second example of a sum method for doubles
	public static double sum(double a, double b) {
		double sum = 0;
		//the sum of the doubles is both of the doubles added together
		sum = a + b;
		//display the results of the sum
		return sum;
	}
	
	//this is the first method for getting the average of 2 integers
	public static int average(int a, int b) {
		int avg = 0;
		//the average is the sum of the 2 integers divided by the total number of integers
		avg = (a+b)/2;
		//display the results of the calculation
		return avg;
		}
	
	//this is the second of the average methods, this is for doubles
	public static double average(double a, double b) {
		double avg = 0;
		avg = (a+b)/2;
		//display the results of the calculation
		return avg;
	}
	
	//this is the first of the 'square' methods for integers
	public static int square(int a) {
		int sqr = 0;
		//the square is the number multiplied by itself
		sqr = a * a;
		
		//display the results of the calculation
		return sqr;
	}
	
	//this is the second of the 'square' methods for doubles
	public static double square(double a) {
		double sqr = 0;
		//the square is the double multiplied by itself
		sqr = a * a;
		
		//display the results of the calculation
		return sqr;
	}
	
	public static void main(String args[]) {
		//testing the methods and overloading
		
		//test the sum methods 
		System.out.printf("%d",sum(2,3));
		System.out.println("");
		System.out.printf("%f", sum(2.2, 6.5));
		
		//test the average methods
		System.out.println("");
		System.out.printf("%d", average(3, 9));
		System.out.println("");
		System.out.printf("%f", average(3.9, 2.9));
		
		//test the square methods
		System.out.println("");
		System.out.printf("%d", square(3));
		System.out.println("");
		System.out.printf("%f", square(3.8));
		
		
	}
	
}
