////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab07
//  File:     ArrayUtilities.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that returns a string of an array with a user selected spacer
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class ArrayUtilities
{

	public static String toString(int[] number, String delim)
	{
		String output = "";
		if (delim == null || delim.equals(""))
			delim = ", ";
		for (int i = 0; i < number.length; i++)
		{
			output += number[i];
			if (number.length != (i + 1))
				output += delim;
		}
		return output;
	}

	public static int[] reverse(int[] numbers)
	{
		for (int i = 0; i < numbers.length / 2; i++)
		{
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - i - 1];
			numbers[numbers.length - i - 1] = temp;
		}
		return numbers;
	}

	public static boolean hasDuplicates(int[] a)
	{
		boolean duplicates = false;
		for (int j = 0; j < a.length; j++)
		{
			for (int k = j + 1; k < a.length; k++)
			{
				if (k != j && a[k] == a[j])
					duplicates = true;
			}
		}
		return duplicates;
	}
}
