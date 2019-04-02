//**********************************************//
//* Author: 1716208                            *//
//* Week: 4                                    *//
//* Tutorial Task: 2                           *//
//* Description:                               *//
//*                                            *//
//* Date: 18/02/19                             *//
//*                                            *//
//**********************************************//


public class BankAccount {
	
	//create name and balance variables
	//make them private and static 
	private static String name;
	private double balance;

	public BankAccount(String accName, double accBalance){
		
		name = accName;
		balance = 0.0;
		
		//balance must be greater than or equal to zero.
		
		if(accBalance >= 0) {
			balance = accBalance;
		} 
		else {
			System.out.println("Balance cannot be less than 0");
		}
	}
	
	//create a method to pay into the bank account
	/*if the input amount is greater than or equal to zero, 
 	add it to the balance, else make it 0 and do nothing to the balance*/
	
	public void payIn(double newBalance){
		if(newBalance >=0) {
			balance+= newBalance;
		}
		else {
			System.out.println("Amount entered cannot be less than 0");
			newBalance = 0;
			balance+= newBalance;
		}
	}
	
	//create a get balance method to return the current value of the account
	public double getBalance() {
		return balance;
	}
	
	//create a set name method to change the name of the account
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
}
