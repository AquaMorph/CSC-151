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
	
	public void sale(TicketType ticket)
	{
		numberSold++;
		sales += ticket.getPrice();
	}

	public String getName()
	{
		return name;
	}

	public double getNumberSold()
	{
		return numberSold;
	}

	public double getSales()
	{
		return sales;
	}
}
