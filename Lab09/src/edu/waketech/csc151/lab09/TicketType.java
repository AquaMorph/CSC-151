////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab09
//  File:     TicketType.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Handles prices of tickets
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

package edu.waketech.csc151.lab09;

public enum TicketType
{
	Child(6.0), Adult(9.5), Senior(6.5);

	private final double price;

	TicketType(double id)
	{
		this.price = id;
	}

	public double getPrice()
	{
		return price;
	}
}
