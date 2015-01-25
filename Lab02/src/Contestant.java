////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab02
//  File:     Contestant.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program runs a game show for a single contestant and keeps track of his
 * or her total winnings
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Contestant
{
	private String contestantName;
	private double winnings;

	public Contestant(String name)
	{
		contestantName = name;
		winnings = 0;
	}

	public String getName()
	{
		return contestantName;
	}

	public double getWinnings()
	{
		return winnings;
	}

	public void addWinnings(double amt)
	{
		winnings += amt;
	}

	public void bankrupt()
	{
		winnings = 0;
	}

	public String toString()
	{
		return "[name=" + contestantName + ", winnings=$" + winnings + "]";
	}
}
