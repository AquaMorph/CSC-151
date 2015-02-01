////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab03
//  File:     RandomGenerator.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This class that allows for a min and max to be set and then will generate a 
 * random interger within that class
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Random;

public class RandomGenerator
{
	private int max, min;

	public RandomGenerator()
	{
	}

	public void setMax(int Max)
	{
		max = Max;
	}

	public void setMin(int Min)
	{
		min = Min;
	}

	public int getRandomNumber()
	{
		Random randomNumber = new Random();
		return Math.abs(randomNumber.nextInt() % (max - min + 1)) + min;
	}

}
