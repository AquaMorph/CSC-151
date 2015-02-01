////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab03
//  File:     User.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This is a class that gets a users first and last name and will return their
 * email address to them.
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class User
{
	private String firstName, lastName;

	public User()
	{
	}

	public void setFirstName(String name)
	{
		firstName = name;
	}

	public void setLastName(String name)
	{
		lastName = name;
	}

	public String getEmail()
	{
		return firstName.toLowerCase() + "." + lastName.toLowerCase()
				+ "@waketech.edu";
	}

	public String getFullName()
	{
		return firstName + " " + lastName;
	}

}
