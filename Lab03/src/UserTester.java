////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab03
//  File:     UserTester.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program tests the User class to make sure it sets a first and last name
 * of the user and prints out the users full name and email.
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class UserTester
{

	public static void main(String[] args)
	{
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		user.setFirstName(scanner.next());
		System.out.println("Enter your last name: ");
		user.setLastName(scanner.next());
		scanner.close();
		System.out.println("Hello " + user.getFullName()
				+ ", your email address is: " + user.getEmail());
	}

}
