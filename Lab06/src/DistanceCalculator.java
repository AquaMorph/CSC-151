////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     DistanceCalculator.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that keeps track of new coordinate entered and adds the distance to
 * the new point.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class DistanceCalculator
{
	double x = 0, y = 0, distance = 0;

	public void addPoint(double newX, double newY)
	{
		double newDistance = Math.sqrt(Math.pow((newX - x), 2)
				+ Math.pow((newY - y), 2));
		distance += newDistance;
		x = newX;
		y = newY;
	}

	public double getTotalDistance()
	{
		return distance;
	}

}
