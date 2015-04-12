
/**
 * 
 * This class represents a person who has a name and an age.
 *
 * <p/> Bugs: None
 * 
 * @author hpaul
 *
 */
public class Person
{
	/** The person's name */
	private int age;
	
	/** The person's age */
	private String name;
	
	/**
	 * Constructs a new Person object with the given name and age
	 * 
	 * @param age of the person
	 * @param name of the person
	 */
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	
	/**
	 * 
	 * Returns the age of the person 
	 *
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	
	
	/**
	 * 
	 * Sets the age of the person 
	 *
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	/**
	 * Returns the name of the person
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	

	
	/**
	 * 
	 * Sets the name of the person
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}


	
	/**
	 * Returns a string representation of the person in the form:
	 * Person[name = [name], age = [age]]
	 */
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public Com
}
