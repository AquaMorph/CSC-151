////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab09
//  File:     TicketAgent.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that handles ticket orders by an agent
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

package edu.waketech.csc151.lab09;

public class TicketAgent
{
	private String name;
	private int numberSold = 0;
	private double sales = 0;

	TicketAgent(String agentName)
	{
		name = agentName;
	}

	public void sale(TicketType ticket, int quantity)
	{
		numberSold += quantity;
		sales += ticket.getPrice()*quantity;
	}

	public String getName()
	{
		return name;
	}

	public int getNumberSold()
	{
		return numberSold;
	}

	public double getSales()
	{
		return sales;
	}
}
