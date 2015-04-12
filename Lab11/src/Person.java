////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab11
//  File:     Person.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class for tracking people's name and age
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Person implements Comparable<Object>
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

	@Override
	public int compareTo(Object compare)
	{
		int compareage=((Person)compare).getAge();
		if(this.age==compareage)
			return this.name.compareTo(((Person)compare).getName());
		else
			return this.age-compareage;
	}
	
}
