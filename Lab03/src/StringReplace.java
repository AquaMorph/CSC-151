////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab03
//  File:     StringReplace.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program replaces known abbreviations in a user entered string and 
 * replace with the full text
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class StringReplace
{

	public static void main(String[] args)
	{
		String[] abbreviations = { "WTCC", "CSC 151", "CSC 251" };
		String[] text = { "Wake Tech Community College", "JAVA Programming",
				"Advanced Java Programming" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String input = scanner.nextLine();
		for (int i = 0; i < abbreviations.length; i++)
		{
			input = input.replace(abbreviations[i], text[i]);
		}
		scanner.close();
		System.out.println("Output: " + input);
	}

}
