////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     PairTest.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program that test the class Pair. Asks the user to enter to number and
 *  then returns the average, distance, maximum and minimum of two
 *  numbers
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class PairTest
{

	public static void main(String[] args)
	{
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		num2 = scanner.nextDouble();
		Pair pair = new Pair(num1, num2);

		System.out.println("\nAverage: " + pair.getAverage());
		System.out.println("Distance: " + pair.getDistance());
		System.out.println("Maximum: " + pair.getMaximum());
		System.out.println("Minimum: " + pair.getMinimum());
		scanner.close();
	}

}
