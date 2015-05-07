////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Project02
//  File:     FileUtilities.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Shifts letters in a text file by a user given amount and saves it.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilities
{

	public static void main(String[] args) throws IOException
	{
		Boolean encrypt = null, verbose = false;
		FileInputStream in = null;
		FileOutputStream out = null;
		String file = null, text = "";;
		int shift = 0;

		try
		{

			// Handle encrypt command
			try
			{
				if (args[0].toLowerCase().equals("encrypt"))
					encrypt = true;
				else if (args[0].toLowerCase().equals("decrypt"))
					encrypt = false;
				else
				{
					BadCommand(args[0]);
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				BadCommand(args[0]);
			}

			// Sets the shift amount
			try
			{
				shift = Integer.parseInt(args[1]) % 26;
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				BadCommand(args[1]);
			}
			catch (NumberFormatException e)
			{
				BadCommand(args[1]);
			}

			// Sets the file input
			try
			{
				file = args[2];
				in = new FileInputStream(file);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				BadCommand(args[0]);
			}
			catch (FileNotFoundException e)
			{
				System.out.println("File Not Found: " + args[2]);
				System.exit(0);
			}

			// Handle encrypt command
			try
			{
				if (args[3].toLowerCase().equals("-verbose"))
					verbose = true;

			}
			catch (ArrayIndexOutOfBoundsException e)
			{
			}

			Scanner scanner = new Scanner(in);
			while (scanner.hasNextLine())
				text += scanner.nextLine();

			if (in != null)
			{
				in.close();
			}
			if (verbose)
				System.out.println("Before: " + text);
			text = Caesar(encrypt, shift, text);
			if (verbose)
				System.out.println("After: " + text);
			byte[] contentInBytes = text.getBytes();
			try
			{
				out = new FileOutputStream(file);
				out.write(contentInBytes);
			}
			catch (FileNotFoundException e)
			{

			}
		}
		finally
		{
			if (in != null)
			{
				in.close();
			}
			if (encrypt)
				System.out.println("File encryption complete.");
			else
				System.out.println("File decryption complete.");
		}
	}

	private static String Caesar(Boolean encrypt, int shift, String text)
	{
		if (!encrypt)
			shift *= -1;
		char[] buffer = text.toCharArray();
		for (int i = 0; i < buffer.length; i++)
		{
			char c = buffer[i];
			if (c >= 'a' && c <= 'z')
			{
				if (shift > 0)
				{

					if (c + shift >= 'a' && c + shift <= 'z')
						buffer[i] = (char) (c + shift);
					else
						buffer[i] = (char) ((c - 26) + shift);
				}
				else
				{
					if (c + shift >= 'a' && c + shift <= 'z')
						buffer[i] = (char) (c + shift);
					else
						buffer[i] = (char) ((c + 26) + shift);
				}
			}
			if (c >= 'A' && c <= 'Z')
			{
				if (shift > 0)
				{

					if (c + shift >= 'A' && c + shift <= 'Z')
						buffer[i] = (char) (c + shift);
					else
						buffer[i] = (char) ((c - 26) + shift);
				}
				else
				{
					if (c >= 'A' && c <= 'Z')
						if (c + shift >= 'A' && c + shift <= 'Z')
							buffer[i] = (char) (c + shift);
						else
							buffer[i] = (char) ((c + 26) + shift);
				}
			}
		}
		return new String(buffer);
	}

	private static void BadCommand(String command)
	{
		System.out.println("Unrecognized command: " + command);
		System.out
				.println("Usage: java FileUtilities command shift filename [-verbose]");
		System.exit(0);
	}
}
