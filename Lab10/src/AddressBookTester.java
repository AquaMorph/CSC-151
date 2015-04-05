////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab10
//  File:     AddressBookTester.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that tests AddressBook class by creating several contacts and prints
 * them out.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class AddressBookTester
{

	public static void main(String[] args)
	{
		AddressBook book = new AddressBook();

		book.addContact(new Friend("John", "Smith", "jsmith@mail.com",
				"01/14/80"));
		book.addContact(new Friend("Joe", "Adams", "jadams@mail.com",
				"07/10/82"));
		book.addContact(new BusinessAssociate("Mrs.", "Sue", "Johnson",
				"sjohnson@acme.com", "Acme Inc.", "Sales"));

		System.out.println("All Contacts:");
		System.out.println(book.toString());
		System.out.println("\nEmail List:");
		for (int i = 0; i < book.getEmailList().size(); i++)
			System.out.println(book.getEmailList().get(i).toString());
		System.out.println("\nFriends List:");
		for (int i = 0; i < book.getFriends().size(); i++)
			System.out.println(book.getFriends().get(i).toString());
	}

}