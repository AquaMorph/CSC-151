
import java.util.ArrayList;

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
		

		// PRINT THE LIST OF PEOPLE AFTER SORTING
		for (Person person : people)
		{
			System.out.println(person);
		}
	}
}

