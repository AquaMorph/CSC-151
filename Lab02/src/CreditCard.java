////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab02
//  File:     CreditCard.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program keeps track of a users credit card limit and balance
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class CreditCard
{
	private String accountNumber;
	private double creditLimit;
	private double balance;
	
	public CreditCard(String number, double limit)
	{
		accountNumber = number;
		creditLimit = limit;
		balance = 0;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public double getCreditLimit() 
	{
		return creditLimit;
	}

	public double getBalance() 
	{
		return balance;
	}
	
	public void charge(double amount)
	{
		balance += amount;
	}
	
	public String toString()
	{
		return "Credit Card [number = " + accountNumber + ", bal = " + balance + ", limit = " + creditLimit + "]\n";
	}
	
}
