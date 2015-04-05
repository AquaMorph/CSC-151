////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab10
//  File:     BusinessAssociate.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that handles a contact with a title, job and position
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class BusinessAssociate extends Contact
{
	private String title, company, position;

	public BusinessAssociate(String title, String firstName, String lastName,
			String email, String company, String position)
	{
		super(firstName, lastName, email);
		this.title = title;
		this.company = company;
		this.position = position;
	}

	@Override
	public String getFullName()
	{
		return title + " " + this.getFirstName() + " " + this.getLastName();
	}

	@Override
	public String toString()
	{
		return this.getFullName() + ", " + this.getEmail() + ", " + company
				+ ", " + position;
	}
}
