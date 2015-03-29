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
