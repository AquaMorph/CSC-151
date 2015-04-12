
import java.util.ArrayList;
import java.util.Collections;

/**
 * This program creates a list of Person objects, sorts the list using the
 * Collections.sort() method, and then prints the newly sorted list to the
 * console.
 * 
 * <p/>
 * Bugs: None
 * 
 * @author hpaul
 */
public class PersonSorter
{
	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("Linda", 63));
		people.add(new Person("Jacob", 5));
		people.add(new Person("Emily", 13));
		people.add(new Person("Jessica", 21));
		people.add(new Person("Emma", 5));
		people.add(new Person("Robert", 80));
		people.add(new Person("Jennifer", 43));

		// PRINT THE LIST OF PEOPLE BEFORE SORTING
		for (Person person : people)
		{
			System.out.println(person);
		}

		Collections.sort(people);
		
		System.out.println("Sorted");

		// PRINT THE LIST OF PEOPLE AFTER SORTING
		for (Person person : people)
		{
			System.out.println(person);
		}
		
		Person alice = new Person("alice", 65);
		Person bob = new Person("bob", 72);
		if(alice.compareTo(bob) > 0)
		{
		System.out.println(alice + " is greater than " + bob);
		}
		else if(alice.compareTo(bob) < 0)
		{
		System.out.println(alice + " is less than " + bob);
		}
		else
		{
		System.out.println(alice + " & " + bob + " are the same");
		}
	}
}

