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
