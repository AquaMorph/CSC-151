////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab04
//  File:     RomanNumeralHelper.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program that  get input of a user in roman numerals and converts it to
 *  an interger.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class RomanNumeralHelper
{

	public static void main(String[] args)
	{
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (!input.equals("Q"))
		{
			System.out.println("Enter a roman numeral [Q | q to quit]:");
			input = scanner.nextLine();
			input = input.toUpperCase();
			if (!input.equals("Q"))
				System.out.println(">> " + convert(input));
		}
		System.out.println("Good Bye!");
		scanner.close();
	}

	public static int convert(String roman)
	{
		int number = 0;

		String romanNumeral = roman.toUpperCase();
		for (int x = 0; x < romanNumeral.length(); x++)
		{
			char convertTonumber = roman.charAt(x);

			if (convertTonumber == 'M')
			{
				number += 1000;
			}
			else if (convertTonumber == 'D')
			{
				number += 500;
			}
			else if (convertTonumber == 'C')
			{
				number += 100;
			}
			else if (convertTonumber == 'L')
			{
				number += 50;
			}
			else if (convertTonumber == 'X')
			{
				number += 10;
			}
			else if (convertTonumber == 'V')
			{
				number += 5;
			}
			else if (convertTonumber == 'I')
			{
				number += 1;
			}
		}
		if (romanNumeral.contains("IV"))
		{
			number -= 2;
		}
		if (romanNumeral.contains("IX"))
		{
			number -= 2;
		}
		if (romanNumeral.contains("XL"))
		{
			number -= 10;
		}
		if (romanNumeral.contains("XC"))
		{
			number -= 10;
		}
		if (romanNumeral.contains("CD"))
		{
			number -= 100;
		}
		if (romanNumeral.contains("CM"))
		{
			number -= 100;
		}
		return number;
	}

}
