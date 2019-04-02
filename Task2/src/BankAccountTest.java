//**********************************************//
//* Author: 1716208                            *//
//* Week: 4                                    *//
//* Tutorial Task: 2                           *//
//* Description:                               *//
//*                                            *//
//* Date: 18/02/19                             *//
//*                                            *//
//**********************************************//



public class BankAccountTest {

	//create a number of bank account objects
	private static BankAccount account1 = new BankAccount("Anthony", 2700.00);
	private static BankAccount account2 = new BankAccount("Pedro", -120.00);
	
	//declare all instance fields
	private static String objName1;
	private static String objName2;
	
	private static double objBal1;
	private static double objBal2;
	
	public static void main(String args[]) {
		
		//set the name of the account
		account1.setName("Anthony Williams");
		//assign the name of the account to a variable
		objName1 = account1.getName();
		
		//input an amount of money into the account
		account1.payIn(1200.00);
		//add the input a variable
		objBal1 = account1.getBalance();
		
		//set and get the name for the second bank account
		account2.setName("Pedro Pires");
		objName2 = account2.getName();
		
		//input and get an amount for the second bank account
		account2.payIn(100.0);
		objBal2 = account2.getBalance();
		
		
		//display the name and the balance of the account
		System.out.println(objName1 + " " + objBal1);
		System.out.println(objName2 + " " + objBal2);
		}
	
}
