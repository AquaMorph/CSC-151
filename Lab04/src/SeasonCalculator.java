////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  Lab04
//  File:     SeasonCalculator.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

/**
 * (Insert a comment that briefly describes the purpose of this class
 * definition.)
 *
 * <p/>
 * Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
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
