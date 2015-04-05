////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab10
//  File:     Friend.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that handles a contact with a birthday
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Friend extends Contact
{
	private String birthday;

	public Friend(String firstName, String lastName, String email,
			String birthday)
	{
		super(firstName, lastName, email);
		this.birthday = birthday;
	}

	public void setBirthday(String string)
	{
		birthday = string;
	}

	public String getBirthday()
	{
		return birthday;
	}

	public String toString()
	{
		return this.getFullName() + ", " + this.getEmail() + ", " + birthday;
	}

}
