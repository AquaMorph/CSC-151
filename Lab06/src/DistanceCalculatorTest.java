////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     DistanceCalculator.java
//  DistanceCalculatorTest
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that tests the class DistanceCalculator which keeps track of new 
 * coordinate entered and adds the distance to the new point.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class DistanceCalculatorTest
{

	public static void main(String[] args)
	{
		double x, y, count = 0;
		Scanner scanner = new Scanner(System.in);
		DistanceCalculator d = new DistanceCalculator();

		System.out.print("Enter number of coordinates: ");
		count = scanner.nextInt();

		for (int i = 0; i < count; i++)
		{
			System.out.print("Enter X: ");
			x = scanner.nextDouble();
			System.out.print("Enter Y: ");
			y = scanner.nextDouble();
			d.addPoint(x, y);
			System.out.println("Distance: " + d.getTotalDistance());
		}
		scanner.close();
	}

}
