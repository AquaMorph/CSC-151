////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab04
//  File:     SeasonCalculator.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program gets the month and the day and returns the season of the day
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class SeasonCalculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month = in.nextInt();

		System.out.print("Enter the day: ");
		int day = in.nextInt();

		Date date = new Date(month, day);

		if (!date.isValidMonth())
			System.out.println("Sorry, " + month + " is not a valid month.");
		else if (!date.isValidDay())
			System.out.println("Sorry, " + day + " is not a valid date in " + date.getMonth() + ".");
		else 
			System.out.println(date.getMonth() + " " + day + " is in the " + date.getSeason());
		

		in.close();

	}

}
