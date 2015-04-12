////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab11
//  File:     SequentialGenerator.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A calls that generates numbers in sequence
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class SequentialGenerator implements NumberGenerator
{
	public long start, end;

	public SequentialGenerator(long start, long end)
	{
		this.start = start - 1;
		this.end = end;

	}

	@Override
	public long nextValue()
	{
		if (hasNext())
		{
			start++;
			return start;
		}
		else
			return 0;

	}

	@Override
	public boolean hasNext()
	{
		if (start + 1 > end)
			return false;
		else
			return true;
	}
}
