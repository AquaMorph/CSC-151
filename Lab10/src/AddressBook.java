////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab10
//  File:     AddressBook.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that handles multiple contacts and places them in lists.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.ArrayList;

public class AddressBook
{

	private ArrayList<Contact> contacts;

	public AddressBook()
	{
		contacts = new ArrayList<>();
	}

	public void addContact(Contact c)
	{
		contacts.add(c);
	}

	public ArrayList<String> getEmailList()
	{
		ArrayList<String> emailList = new ArrayList<>();

		for (int i = 0; i < contacts.size(); i++)
		{
			emailList.add(contacts.get(i).getEmail());
		}

		return emailList;
	}

	public ArrayList<String> getFriends()
	{
		ArrayList<String> friendList = new ArrayList<>();

		for (int i = 0; i < contacts.size(); i++)
		{
			if (contacts.get(i) instanceof Friend)
				friendList.add(contacts.get(i).toString());
		}

		return friendList;
	}

	public String toString()
	{
		String text = "";
		for (int i = 0; i < contacts.size(); i++)
		{
			if (i > 0)
				text += "\n";
			text += contacts.get(i).toString();
		}
		return text;
	}
}
