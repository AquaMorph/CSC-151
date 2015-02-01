////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab03
//  File:     RandomGeneratorTester.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program tests the RandomGenerator class to make sure it sets a max and 
 * min for a random number to be generated. 
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class RandomGeneratorTester
{

	public static void main(String[] args)
	{
		RandomGenerator rg = new RandomGenerator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Max: ");
		rg.setMax(scanner.nextInt());
		System.out.println("Enter Min: ");
		rg.setMin(scanner.nextInt());
		scanner.close();
		System.out.println(rg.getRandomNumber());
	}

}
