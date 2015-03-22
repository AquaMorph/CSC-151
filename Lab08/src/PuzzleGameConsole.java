import java.util.Arrays;
import java.util.Scanner;


public class PuzzleGameConsole
{
	private static final String NEWLINE = "\n";
	private static final String MENU = "(1) GUESS A LETTER (2) SOLVE THE PUZZLE (3) QUIT >> ";
	private static final String PROMPT_ENTER_LETTER = "\nENTER A LETTER> ";
	private static final String PROMPT_SOLVE_PUZZLE = "\nSOLVE THE PUZZLE> ";
	
	private static final int SELCTION_ENTER_LETTER = 1;
	private static final int SELCTION_SOLVE_PUZZLE = 2;
	private static final int SELCTION_QUIT = 3;
	
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
	
		
		int selection = 0;
		
		while(selection != SELCTION_QUIT)
		{
			System.out.printf("PUZZLE: %s\n\n", puzzle.getPuzzle());
			
			System.out.print(MENU);
			selection = in.nextInt();
			in.nextLine();
			
			if(selection == SELCTION_ENTER_LETTER)
			{
				System.out.print(PROMPT_ENTER_LETTER);
				char letter = in.next().charAt(0);
				
				int letterCount = puzzle.guessLetter(letter);
				if(letterCount > 0)
				{
					printMessageBox(String.format("YES! The letter %s was found %d time(s).", letter, letterCount));
				}
				else
				{
					printMessageBox(String.format("Sorry, the letter %s is not available in the puzzle.", letter));					
				}
			}
			else if(selection == SELCTION_SOLVE_PUZZLE)
			{
				System.out.print(PROMPT_SOLVE_PUZZLE);
				String guess = in.nextLine();
				
				if(puzzle.solvePuzzle(guess))
				{
					printMessageBox("Congratulations, you solved the puzzle!");	
					selection = 3;
				}
				else
				{
					printMessageBox(String.format("Sorry, '%s' is not the puzzle.  Keep trying!", guess));
				}
			}
			else if (selection != SELCTION_QUIT)
			{
				System.out.println("INVALID MENU OPTION");
			}
		}
		
		System.out.println("\nGood Bye!");
		
		in.close();
	}
	
	public static void printMessageBox(String message)
	{
		char [] border = new char[message.length() + 4];
		Arrays.fill(border, '-');
		
		StringBuilder result = new StringBuilder();
		result.append(NEWLINE);
		result.append(border).append(NEWLINE);
		result.append("| ").append(message).append(" |").append(NEWLINE);
		result.append(border).append(NEWLINE);
		
		System.out.println(result);
	}

}
