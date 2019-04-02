//**********************************************//
//* Author: 1716208                            *//
//* Week: 4                                    *//
//* Tutorial Task: 2                           *//
//* Description:                               *//
//*                                            *//
//* Date: 18/02/19                             *//
//*                                            *//
//**********************************************//

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BankAccount2 {
	
	//create a number of bank account objects
		private static BankAccount account1 = new BankAccount("Anthony", 2700.00);
		private static BankAccount account2 = new BankAccount("Pedro", -120.00);
		
		//declare all instance fields
		private static String objName1;
		private static String objName2;
		
		private static double objBal1;
		private static double objBal2;
		

	public static void main(String[] args){
		
	JFrame frame = new JFrame("JOptionPane showMessageDialog example");


	 String nameIn = JOptionPane.showInputDialog("Enter your name...");
	 String balIn = JOptionPane.showInputDialog("Enter amount you want to deposit...");
	 
	 //convert the string into a double so that it can be used 
	 
	 double balInConvert = Double.parseDouble(balIn);
	 
	//set the name of the account
			account1.setName(nameIn);
			//assign the name of the account to a variable
			objName1 = account1.getName();
			
			//input an amount of money into the account
			account1.payIn(balInConvert);
			//add the input a variable
			objBal1 = account1.getBalance();
		
			
			
			//display the name and the balance of the account
			JOptionPane.showMessageDialog(frame, "account name: " + objName1 + " account balance: £" + objBal1); 
}
}