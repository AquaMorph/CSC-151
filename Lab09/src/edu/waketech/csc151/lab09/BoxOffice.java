////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab09
//  File:     BoxOffice.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * A class that handles multiple agents
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

package edu.waketech.csc151.lab09;

public class BoxOffice
{
	private TicketAgent[] agents;
	private int indexOfNextAgent;

	/**
	 * A box office can have one or more ticket agents selling tickets to
	 * customers. This constructor allows you to specify the names of each of
	 * the ticket agents.
	 * 
	 * @param agentNames
	 *            the names of each of the ticket agents
	 */
	public BoxOffice(String[] agentNames)
	{
		agents = new TicketAgent[agentNames.length];

		for (int i = 0; i < agentNames.length; i++)
		{
			agents[i] = new TicketAgent(agentNames[i]);
		}
		indexOfNextAgent = 0;
	}

	/**
	 * 
	 * Returns the next available ticket agent that is available to server
	 * customers.
	 * 
	 * @return the next available ticket agent
	 */
	public TicketAgent nextAgent()
	{
		TicketAgent agent = agents[indexOfNextAgent];
		indexOfNextAgent = indexOfNextAgent + 1 == agents.length ? 0
				: indexOfNextAgent + 1;
		return agent;
	}

	/**
	 * 
	 * This method generates a sales report that shows the number of tickets and
	 * the total sales for each ticket agent in the box office.
	 *
	 * @return a String representing a table of sales results
	 */
	public String getSalesReport()
	{
		StringBuilder report = new StringBuilder("Sales Report:");

		int number = 0;
		double total = 0;
		for (int i = 0; i < agents.length; i++)
		{
			report.append("\n" + agents[i].getName() + ": Number Sold "
					+ agents[i].getNumberSold() + " Sales $"
					+ agents[i].getSales());
			number += agents[i].getNumberSold();
			total += agents[i].getSales();
		}

		report.append("\n\nTotal Number Sold " + number + " Total Sales $"
				+ total);

		return report.toString();
	}

}
