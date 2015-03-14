////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Midterm
//  File:     CurrencyBankTester.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A test program for the class CurrencyBank the runs in a loop until the users
 * exits the program. On exit will return the total amount in the account.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class CurrencyBankTester
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		CurrencyBank cb = new CurrencyBank();
		char type = 'q';
		double add = 0.0;

		do
		{
			System.out
					.println("What type of currency to add (Y, E, D or X to exit)?");
			type = scanner.next().toUpperCase().charAt(0);

			if (type == 'Y')
			{
				System.out.println("What value do you wish to add?");
				add = scanner.nextDouble();
				cb.addYen(add);
			}
			if (type == 'E')
			{
				System.out.println("What value do you wish to add?");
				add = scanner.nextDouble();
				cb.addEuros(add);
			}
			if (type == 'D')
			{
				System.out.println("What value do you wish to add?");
				add = scanner.nextDouble();
				cb.addDollars(add);
			}
		}
		while (type != 'X');

		System.out.println("The CurrencyBank now contains $" + cb.countMoney()
				+ ".");
		System.out.println("Goodbye!");

		scanner.close();
	}

}
