////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     StringUtils.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program that adds a selected number of spaces or character to a string
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class StringUtils
{

	public StringUtils()
	{
	}

	public static String padLeft(String orig, int n)
	{
		for (int i = 0; i < n; i++)
		{
			orig = " " + orig;
		}
		return orig;
	}

	public static String padLeft(String orig, int n, char c)
	{
		for (int i = 0; i < n; i++)
		{
			orig = c + orig;
		}
		return orig;
	}
}
