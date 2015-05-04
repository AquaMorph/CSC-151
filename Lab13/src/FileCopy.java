////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
//  Section:  0001
// 
//  Project:  Lab13
//  File:     FileCopy.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Copies a text file to a new text file.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;

		try
		{
			try
			{
				in = new FileInputStream(args[0]);
				out = new FileOutputStream(args[1]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.err
						.printf("Please make sure to have an input and output file");
				System.exit(0);
			}

			int c;
			while ((c = in.read()) != -1)
			{
				out.write(c);
			}
		}
		catch (IOException e)
		{
			System.err.printf("Please make sure that file exists");
			System.exit(0);
		}
		finally
		{
			if (in != null)
			{
				in.close();
			}
			if (out != null)
			{
				out.close();
			}
		}
	}
}
