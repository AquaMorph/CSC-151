public class Average
{

	public static void main(String[] args)
	{
		int count = 0;
		double sum = 0.0;
		
		for (String s : args)
		{
			try
			{
				sum += Integer.parseInt(s);
				count++;
			}
			catch (NumberFormatException e)
			{
				System.err
						.printf("Error: The argument '" + s + "' is not an integer.");
				System.exit(0);
			}

		}
		System.out.println("AVERAGE = " + sum / count);
	}
}
