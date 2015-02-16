////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab05
//  File:     Multiples.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  Moves through a given range be a user selected step amount
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class Multiples
{

	public static void main(String[] args)
	{
		int start, end, step;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		start = scanner.nextInt();
		System.out.println("Enter the ending number: ");
		end = scanner.nextInt();
		System.out.println("Enter a whole number N: ");
		step = scanner.nextInt();
		System.out.print("Multiples of " + step + " between " + start + " and "
				+ end + ": ");

		if (end > start)
		{
			for (start += step; end > start; start += step)
			{
				System.out.print(start + " ");
			}
		}
		else
		{
			for (start -= step; end < start; start -= step)
			{
					System.out.print(start + " ");
			}
		}

		scanner.close();

	}

}
