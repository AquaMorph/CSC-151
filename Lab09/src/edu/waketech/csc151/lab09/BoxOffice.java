package edu.waketech.csc151.lab09;

/**
 * 
 * The BoxOffice class manages individual ticket agents that can sell tickets
 * for the box office. A box office can have one or more ticket agents. When a
 * customer is ready to buy tickets, the nextAgent() method is used to get the
 * next available ticket agent.
 * 
 * <p/>
 * Bugs: None
 * 
 * @author CSC151
 * 
 */
public class BoxOffice
{
	private TicketAgent[] agents;
	private int indexOfNextAgent;

	
	/**
	 * A box office can have one or more ticket agents selling tickets to
	 * customers. This constructor allows you to specify the names of 
	 * each of the ticket agents.
	 * 
	 * @param agentNames the names of each of the ticket agents
	 */
	public BoxOffice(String [] agentNames)
	{
		agents = new TicketAgent[agentNames.length];

		// TODO - Add a repetition structure to instantiate the ticket agents
		//        with the names passed in.

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
		indexOfNextAgent = indexOfNextAgent + 1 == agents.length ? 0 : indexOfNextAgent + 1;
		return agent;
	}
	
	
	/**
	 * 
	 * This method generates a sales report that shows the number of tickets 
	 * and the total sales for each ticket agent in the box office. 
	 *
	 * @return a String representing a table of sales results
	 */
	public String getSalesReport()
	{
		StringBuilder report = new StringBuilder("Sales Report:");
		
		//TODO - Add code that iterates over the array of ticket agents
		//       and creates a table reporting the number of tickets sold
		//       and total sales for each ticket agent
		
		return report.toString();
	}

}
