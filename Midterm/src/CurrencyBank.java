////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Midterm
//  File:     CurrencyBank.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that keeps track of a bank account total in Dollars, Euros and Yen.
 * Also takes input in each of those currencies.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class CurrencyBank
{
	double dollar = 0.0, euro = 0.0, yen = 0.0;

	public CurrencyBank()
	{
	}

	public void addDollars(double amount)
	{
		dollar += amount;
		euro = dollar * 1.13;
		yen = dollar * 0.0084;
	}

	public void addEuros(double amount)
	{
		dollar += (amount * 1.13);
		euro = dollar * 1.13;
		yen = dollar * 0.0084;
	}

	public void addYen(double amount)
	{
		dollar += (amount * 0.0084);
		euro = dollar * 1.13;
		yen = dollar * 0.0084;
	}

	public double countMoney()
	{
		return dollar;
	}

}
