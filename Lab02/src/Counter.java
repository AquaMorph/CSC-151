////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab02
//  File:     Counter.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program gets a step count amount and increased or decreases the total
 * count by the step amount
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Counter
{
	private int count, stepAmount;

	public Counter(int step)
	{
		stepAmount = step;
		count = 0;
	}

	public void increase()
	{
		count += stepAmount;
	}

	public void decrease()
	{
		count -= stepAmount;
	}

	public int getCount()
	{
		return count;
	}
}
