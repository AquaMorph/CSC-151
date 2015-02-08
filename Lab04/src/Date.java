////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab04
//  File:     Date.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * This class represents a date given the month and the day of the month. For
 * the given date, this class provides a method for determining the season in
 * the northern hemisphere for the date.
 *
 * For example, the given code fragment the output to the console should be
 * WINTER.
 * 
 * Date jan1 = new Date(1, 1); String season = jan1.getSeason();
 * System.out.println(season);
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */
public class Date
{
	private int month;
	private int day;
	private String[] months = { "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November",
			"December" };

	/**
	 * Constructs a new Date object. The month should be a value from 1 -12 and
	 * the day from 1 - 31.
	 * 
	 * @param theMonth
	 *            the month
	 * @param theDay
	 *            the day
	 */
	public Date(int theMonth, int theDay)
	{
		month = theMonth;
		day = theDay;
	}

	public String getMonth()
	{
		if (month >= 1 && month <= 12)
			return months[month - 1];
		else
			return "UNKNOWN";
	}

	/**
	 * Returns the season that this days falls in based on the following chart:
	 * 
	 * SEASON RETURNED FROM TO SPRING March 21 June 20 SUMMER June 21 September
	 * 22 FALL September 23 December 20 WINTER December 21 March 20
	 * 
	 * If the day does not represent a valid day it will return UNKNOWN
	 * 
	 * @return the string representation for the season: WINTER | SPRING |
	 *         SUMMER | FALL | UNKNOWN
	 */
	public String getSeason()
	{
		String result = "UNKNOWN";

		if (month < 3)
			result = "WINTER";
		else if (month == 3)
		{
			if (day <= 20)
				result = "WINTER";
			else
				result = "SPRING";
		}
		else if (month < 6)
			result = "SPRING";
		else if (month == 6)
		{
			if (day <= 20)
				result = "SPRING";
			else
				result = "SUMMER";
		}
		else if (month < 9)
			result = "SUMMER";
		else if (month == 9)
		{
			if (day <= 22)
				result = "SUMMER";
			else
				result = "FALL";
		}
		else if (month < 9)
			result = "SUMMER";
		else if (month == 9)
		{
			if (day <= 22)
				result = "SUMMER";
			else
				result = "FALL";
		}
		else if (month < 12)
			result = "FALL";
		else if (month == 12)
		{
			if (day <= 20)
				result = "FALL";
			else
				result = "WINTER";
		}

		return result;
	}

	public boolean isValidDay()
	{
		if (isValidMonth())
		{
			if (month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10 || month == 12)
			{
				if (day >= 1 && day <= 31)
					return true;
				else
					return false;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				if (day >= 1 && day <= 30)
					return true;
				else
					return false;
			}
			else if (month == 2)
			{
				if (day >= 1 && day <= 29)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

	public boolean isValidMonth()
	{
		if (month >= 1 && month <= 12)
			return true;
		else
			return false;
	}
}
