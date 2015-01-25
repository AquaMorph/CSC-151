////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
// 
//  Project:  Lab02
//  File:     ContestantTester.java
//  
//  Name:     Hillary Paul
//  Email:    hpaul@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program is used to test the Contestant class. It constructs a contestant
 * with the name Jon Smith. It adds some cash winnings, tests the toString
 * implementation and tests the bankrupt functionality.
 * 
 * <p/>
 * Bugs: No known issues.
 * 
 * @author hpaul
 * 
 */
public class ContestantTester
{

	/**
	 * This program is used to test the Contestant class and expects no command
	 * line arguments.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Contestant contestant = new Contestant("Jon Smith");

		System.out.print("Expected Name: Jon Smith------------------------------>");
		System.out.println("Actual Name: " + contestant.getName());

		contestant.addWinnings(100.0);
		contestant.addWinnings(200.0);

		System.out.print("Expected Winnings: 300.0------------------------------>");
		System.out.println("Actual Winnings: " + contestant.getWinnings());

		System.out.print("Expected toString: [name=Jon Smith, winnings=$300.0]-->");
		
		// WHEN YOU PASS AN OBJECT REFERENCE TO PRINTLN, THE toString() METHOD
		// FOR THE CLASS (IN THIS CASE CONTESTANT) IS AUTOMATICALLY CALLED
		System.out.println("Actual toString: " + contestant);

		contestant.bankrupt();
		System.out.print("Expected Winnings: 0.0-------------------------------->");
		System.out.println("Actual Winnings: " + contestant.getWinnings());

		contestant.addWinnings(150.0);

		System.out.print("Expected Winnings: 150.0------------------------------>");
		System.out.println("Actual Winnings: " + contestant.getWinnings());

	}

}
