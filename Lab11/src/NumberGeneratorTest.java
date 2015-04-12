import java.util.Scanner;

public class NumberGeneratorTest
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a minimum: ");
		int minimum = in.nextInt();
		
		System.out.print("Enter a maximum: ");
		int maximum = in.nextInt();
		
		NumberGenerator generator = new SequentialGenerator(minimum, maximum);
		
		String output = "";
		while (generator.hasNext())
		{
			if (output.length() > 0)
			{
				output += ",";
			}
			output += generator.nextValue();
		}
		System.out.println(output);
		
		in.close();
	}
}
