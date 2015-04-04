import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is a tester program to demonstrate the MailingAddress class
 * 
 * <p/>
 * Bugs: None
 * 
 * @author Hillary Paul
 * 
 */
public class MailingAddressTester
{

	public static void main(String[] args)
	{

		MailingAddress wakeTechAddress = new MailingAddress("9101 Fayetteville Road", "Raleigh", "NC", "27603");

		Scanner in = new Scanner(System.in);

		System.out.println("-- Enter the Address for Wake Tech --");
		System.out.println("9101 Fayetteville Road, Raleigh, NC 27603");

		System.out.print("Enter the street address: ");
		String addr = in.nextLine();

		System.out.print("Enter the city: ");
		String city = in.next();

		System.out.print("Enter the state: ");
		String state = in.next();

		System.out.print("Enter the zipcode: ");
		String zipcode = in.next();

		MailingAddress enteredAddress = new MailingAddress(addr, city, state, zipcode);

		// QUESTION 1
		// What is the output of the following code when the user correctly enters the
		// wake tech address?

		if (wakeTechAddress.equals(enteredAddress))
		{
			System.out.println("You have correctly entered the Wake Tech address!");
		}
		else
		{
			System.out.println("You have NOT correctly entered the Wake Tech address!");
		}

		
		ArrayList<MailingAddress> addresses = new ArrayList<MailingAddress>();
		addresses.add(wakeTechAddress);

		// QUESTION 2
		// What is the output of the following code when the user correctly enters the
		// wake tech address?
		
		if (addresses.contains(enteredAddress))
		{
			System.out.println("The wake tech address was found in the list of addresses");
		}
		else
		{
			System.out.println("The wake tech address was NOT found in the list of addresses");
		}
		
		in.close();

	}

}
