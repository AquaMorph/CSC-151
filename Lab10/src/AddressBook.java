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

		// TODO - Complete this method by adding the email of each contact to the emailList

		return emailList;
	}

	public ArrayList<String> getFriends()
	{
		ArrayList<String> friendList = new ArrayList<>();

		// TODO - Complete this method by adding the string representation of each
		//        friend in the contacts list to the friend list.
		//        Use the instanceof operator to determine if a contact is a Friend

		return friendList;
	}
}
