
/**
 * A puzzle is used to represent a word puzzle. A puzzle contains a solution and
 * the current state of the puzzle. The current state of the puzzle is
 * represented with a hyphen for each letter in the puzzle that has not yet been
 * guessed. For example if a puzzle is created like this:
 * 
 * Puzzle puzzle = new Puzzle("BIG JAVA");
 * 
 * a call to puzzle.getPuzzle() should return: --- ----
 * 
 * Notice that all letters in the solution were replaced with hyphens but the
 * space character remained in place.
 * 
 * A call to puzzle.guessLetter('b') should return 1 and a subsequent call to
 * puzzle.getPuzzle() should return: B-- ----
 * 
 * Calling puzzle.guessLetter('b') a second time should return 0 since the
 * letter B has already been guessed and should leave the puzzle unchanged.
 * 
 * <p/>
 * Bugs: (List any known issues or unimplemented features here)
 * 
 */
public class Puzzle
{
	/** The solution is the complete word or phrase that is to be guessed */
	private String solution;

	/**
	 * The puzzle is the word or phrase that is to be guessed with hyphens for
	 * all unguessed letters. Initially the puzzle should include all hyphens
	 * for all letters in the solution. As the user guesses a letter the hyphens
	 * for that letter are replaced with the letter.
	 */
	private StringBuilder puzzle;

	/**
	 * Constructs a new Puzzle object with the given puzzle solution. Puzzles
	 * can contain any character and should be case insensitive. This
	 * constructor should set the current state of the puzzle so the all letters
	 * in the puzzle are set to a hyphen. All non letter values should be left
	 * unchanged in the puzzle. The puzzle should be set to the solution passed
	 * in.
	 * 
	 * @param solution
	 *            the solution to the puzzle
	 */
	public Puzzle(String theSolution)
	{
		
	}

	/**
	 * The guessLetter method is used to determine how many times the letter
	 * that is passed in occurs in the puzzle. If the letter has already been
	 * guessed previously, this method should return zero. This method should be
	 * case insensitive. In other words 'H' is the same as 'h'. After a call to
	 * to this method the puzzle should be updated to remove the hyphen from the
	 * location in the puzzle for each occurrence of the letter.
	 * 
	 * @param letter
	 *            the letter that the user is guessing
	 * @return the number of times the letter occurs in the solution only if the
	 *         letter has not already been guessed. If the letter has been
	 *         previously guessed this method should return 0.
	 */
	public int guessLetter(char letter)
	{	
		int count = 0;
		
		return count;
	}

	/**
	 * 
	 * The getPuzzle method should return the current state of the puzzle. The
	 * puzzle should include a hyphen for any letters that have not been
	 * guessed.
	 * 
	 * @return the current state of the puzzle
	 */
	public String getPuzzle()
	{
		return "";
	}

	/**
	 * The solvePuzzle method is used to verify that a solution passed in
	 * matches the solution to this puzzle. The check for matching solutions
	 * should be case insensitive.
	 * 
	 * @param solution
	 * @return true if the solution passed in matches the solution for the
	 *         puzzle
	 */
	public boolean solvePuzzle(String guess)
	{
		return false;
	}

}
