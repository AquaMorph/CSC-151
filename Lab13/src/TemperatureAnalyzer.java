////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab13
//  File:     TemperatureAnalyzer.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Runs through temperature data from a text file and gives numbers of times
 * a given temperature range occurs .
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureAnalyzer
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream in = null;
		int high = 0, low = 0, above = 0, below = 0;

		try
		{
			// Sets the file
			try
			{
				in = new FileInputStream(args[0]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.err.printf("Please make sure to have an input file");
				System.exit(0);
			}

			// Sets the high temp
			try
			{
				high = Integer.parseInt(args[1]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.err.printf("Please set a high");
				System.exit(0);
			}
			catch (NumberFormatException e)
			{
				System.err.printf("Please make sure the high is an interger");
				System.exit(0);
			}

			// Sets the low temp
			try
			{
				low = Integer.parseInt(args[2]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.err.printf("Please set a low");
				System.exit(0);
			}
			catch (NumberFormatException e)
			{
				System.err.printf("Please make sure the low is an interger");
				System.exit(0);
			}

			int year, month, day, highTemp, lowTemp;
			Scanner input = new Scanner(in);
			while (input.hasNextInt())
			{
				year = input.nextInt();
				month = input.nextInt();
				day = input.nextInt();
				highTemp = input.nextInt();
				lowTemp = input.nextInt();
				if (high < highTemp)
					above++;
				if (low > lowTemp)
					below++;
			}
		}
		catch (IOException e)
		{
			System.err.printf("Please make sure that file exists");
			System.exit(0);
		}
		finally
		{
			if (in != null)
			{
				in.close();
				System.out.println("Number of days high temp was " + high + " degrees or above: " + above);
				System.out.println("Number of days low temp was " + low + " degrees or below: " + below);
			}
		}
	}
}
