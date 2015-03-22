////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab08
//  File:     PhoneNumber.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A program that returns parts of a given phone number
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class PhoneNumber
{
	String number;
	
	
	public PhoneNumber(String phoneNumber)
	{
		number = phoneNumber;
	}
	
	public String getAreaCode()
	{
		return number.substring(0, 3);
	}
	
	public String getExchange()
	{
		return number.substring(4,7);
	}
	
	public String getSubscriberNumber()
	{
		return number.substring(8, 12);
	}

}
