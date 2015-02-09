////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab04
//  File:     RockPaperScissors.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program that plays a game of rock paper scissors and keeps track of the 
 *  score of the user and the computer.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{

	public static void main(String[] args)
	{
		String name;
		int human = 0, humanScore = 0, computerScore = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = scanner.nextLine();

		while (human != -1)
		{
			System.out
					.println("Enter rock (1), paper (2), or scissors (3) [-1 to quit]:");
			human = scanner.nextInt();
			if (human != -1)
			{
				Random random = new Random();
				int computer = random.nextInt((3 - 1) + 1) + 1;

				if (computer == human)
					System.out.println("Computer: " + getObject(computer)
							+ " | " + name + ": " + getObject(human)
							+ " | Winner: TIE");
				else if (computer == 1)
				{
					if (human == 2)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: " + name);
						humanScore++;
					}
					else if (human == 3)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: COMPUTER");
						computerScore++;
					}
				}
				else if (computer == 2)
				{
					if (human == 3)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: " + name);
						humanScore++;
					}
					else if (human == 1)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: COMPUTER");
						computerScore++;
					}
				}
				else if (computer == 3)
				{
					if (human == 1)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: " + name);
						humanScore++;
					}
					else if (human == 2)
					{
						System.out.println("Computer: " + getObject(computer)
								+ " | " + name + ": " + getObject(human)
								+ " | Winner: COMPUTER");
						computerScore++;
					}
				}
				else
					;

			}
		}
		System.out.println("SCORE BOARD");
		System.out.println("--------------------");
		System.out.println("Computer: " + computerScore);
		System.out.println(name + ": " + humanScore);
		scanner.close();
	}

	public static String getObject(int number)
	{
		if (number == 1)
			return "Rock";
		else if (number == 2)
			return "Paper";
		else if (number == 3)
			return "Scissors";
		else
			return "";

	}

}
