////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     Pair.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that returns the average, distance, maximum and minimum of two
 * numbers
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Pair
{
	double number1, number2;

	public Pair(double num1, double num2)
	{
		number1 = num1;
		number2 = num2;
	}

	public double getAverage()
	{
		return (number1 + number2) / 2;
	}

	public double getDistance()
	{
		return Math.abs(number1 - number2);
	}

	public double getMaximum()
	{
		return Math.max(number1, number2);
	}

	public double getMinimum()
	{
		return Math.min(number1, number2);
	}

}
