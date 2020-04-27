package com.ualbany.hw1.problem3;

/* Problem 3: Bank simulation	

	For simplicity we will assume there is only one instance of each classes described above. Ex. Bank only
	has 1 account, an account is only linked to 1 person and a person only has single address.
	
	The “has-a” relationship here shows aggregation. Example a person “has-an” address - meaning you can
	use the Address class within the person class to represent the address for a person.
 
 */

/*1. CheckingBankAccount – A checking bank account has value, a person can withdraw, deposit
money to the account*/


public class CheckingBankAccount 
{

	private static double value; //a checking account has a value

	public CheckingBankAccount(double val)
	{
		value = val;
	}

	//Setters
	public static void setValue(double v)
	{
		value = v;
	}

	//Getters
	public static double getValue()
	{
		return value;
	}

	//Deposit to bank account
	public static String deposit(double money)
	{
		System.out.println("\nAccount value: $" + value);
		System.out.println("Deposit Amount: $" + money);

		//can't deposit no or negative money
		if(money <= 0)
			return "\nInvalid transaction";

		value = value + money;
		return "Transaction complete. \nAccount value: $" + value;
	}

	//Withdraw from bank account
	public static String withdraw(double money)
	{
		System.out.println("\nAccount value: $" + value);
		System.out.println("Withdrawal Amount: $" + money);

		//can't withdraw more money or negative money
		if(money > value || money <= 0)
			return "Invalid transaction";

		value = value - money;
		return "Transaction complete. \nAccount value: $" + value;
	}
}
