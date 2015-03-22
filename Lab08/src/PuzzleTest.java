import static org.junit.Assert.*;

import org.junit.Test;


public class PuzzleTest
{
	@Test
	public void testGuessLetterNotFound()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		int count = puzzle.guessLetter('z');
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'z'", "---- -- ---", puzzle.getPuzzle());
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'z'", 0, count);
	}
	
	@Test
	public void testGuessLetterFound()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		int count = puzzle.guessLetter('A');
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'A'", "-A-A -- ---", puzzle.getPuzzle().toUpperCase());
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'A'", 2, count);
	}
	
	@Test
	public void testGuessLetterFoundIgnoreCase()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		int count = puzzle.guessLetter('a');
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'a'", "-A-A -- ---", puzzle.getPuzzle().toUpperCase());
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'a'", 2, count);
	}
	
	@Test
	public void testGuessLetterFoundAgain()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		int count = puzzle.guessLetter('a');
		count = puzzle.guessLetter('A');
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'A'", "-A-A -- ---", puzzle.getPuzzle().toUpperCase());
		assertEquals("Guess letter test with puzzle = 'JAVA IS FUN' and letter = 'A'", 0, count);
	}

	@Test
	public void testGetPuzzleInitialAllLetters()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		assertEquals("Get puzzle test with puzzle = 'JAVA IS FUN' and no letters guessed", "---- -- ---", puzzle.getPuzzle());
	}
	
	@Test
	public void testGetPuzzleInitialWithApostrophe()
	{
		Puzzle puzzle = new Puzzle("IT'S A WONDERFUL LIFE");
		assertEquals("Get puzzle test with puzzle = 'IT'S A WONDERFUL LIFE' and no letters guessed", "--'- - --------- ----", puzzle.getPuzzle());
	}

	@Test
	public void testSolvePuzzleTrue()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		assertTrue("Solve puzzle test with puzzle = 'JAVA IS FUN' and guess = 'JAVA IS FUN'", puzzle.solvePuzzle("JAVA IS FUN"));
	}
	
	@Test
	public void testSolvePuzzleIgnoreCase()
	{
		Puzzle puzzle = new Puzzle("java is fun");
		assertTrue("Solve puzzle test with puzzle = 'java is fun' and guess = 'Java IS FUN'", puzzle.solvePuzzle("Java IS FUN"));
	}
	
	@Test
	public void testSolvePuzzleFalse()
	{
		Puzzle puzzle = new Puzzle("JAVA IS FUN");
		assertFalse("Solve puzzle test with puzzle = 'JAVA IS FUN' and guess = 'JAVAISFUN'", puzzle.solvePuzzle("JAVAISFUN"));
	}
}
