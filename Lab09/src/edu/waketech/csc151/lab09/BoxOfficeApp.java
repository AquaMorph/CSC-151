////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab09
//  File:     BoxOfficeApp.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Client for agents to order tickets from.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

package edu.waketech.csc151.lab09;

import java.util.Scanner;

public class BoxOfficeApp
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		BoxOffice boxOffice = new BoxOffice(new String [] {"John", "Sue", "Beth"});
		
		boolean done = false;
		
		while(!done)
		{
			System.out.print("Enter selection: (1) Order tickets  >> ");
			int selection = in.nextInt();
			if(selection != -1)
			{
				System.out.println("\n---------------------- ORDER TICKETS ----------------------");
				
				//GET THE NEXT TICKET AGENT
				TicketAgent agent = boxOffice.nextAgent();
				
				boolean orderMoreTickets = true;
				
				do
				{
					
					System.out.print("\nEnter the ticket type: (1) Child (2) Adult (3) Senior >> ");
					int type = in.nextInt();
					
					System.out.print("Enter the number of tickets >> ");
					int quantity = in.nextInt();
					
					boolean validTicketType = type > 0 && type < 4;
					boolean validQuantity = quantity > 0;
					
					if(validQuantity && validTicketType)
					{
						TicketType ticketType = TicketType.values()[type - 1];
						
						agent.sale(ticketType, quantity);
					}
					else
					{
						System.out.println("INVALID TICKET ORDER");
					}
					
					System.out.print("\nDo you want to continue ordering tickets? (y | n) ");
					char answer = in.next().charAt(0);
					if(answer == 'n')
					{
						orderMoreTickets = false;
					}
					
				} while(orderMoreTickets);
				
				System.out.println("\n------------------------------------------------------------\n");
			}
			else
			{
				done = true;
			}
		}
		System.out.println();
		System.out.println(boxOffice.getSalesReport());
		
		in.close();
	}

}
