////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab13
//  File:     Average.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Computes an average of a list of intergers.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Average
{

	public static void main(String[] args)
	{
		int count = 0;
		double sum = 0.0;
		
		for (String s : args)
		{
			try
			{
				sum += Integer.parseInt(s);
				count++;
			}
			catch (NumberFormatException e)
			{
				System.err
						.printf("Error: The argument '" + s + "' is not an integer.");
				System.exit(0);
			}

		}
		System.out.println("AVERAGE = " + sum / count);
	}
}
