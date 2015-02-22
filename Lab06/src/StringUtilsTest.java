////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab06
//  File:     StringUtilsTest.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program lets a user test the StringUtils class
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class StringUtilsTest
{

	public static void main(String[] args)
	{
		String text;
		int number;
		char character;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		text = scanner.next();
		System.out.println("Enter number of spaces to add:");
		number = scanner.nextInt();
		System.out.println("New String: " + StringUtils.padLeft(text, number));

		scanner.reset();
		System.out.println("Enter a string:");
		text = scanner.next();
		System.out.println("Enter number of characters to add:");
		number = scanner.nextInt();
		System.out.println("Enter number of spaces to add:");
		character = scanner.next().charAt(0);
		System.out.println("New String: " + StringUtils.padLeft(text, number, character));

		scanner.close();
	}

}
