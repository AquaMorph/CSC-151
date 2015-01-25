/**
*	Converts temperature from celsius to fahrenheit
*
*	<p/> Bugs: none
*
*	@author Christian Colglazier
*
*/

import java.util.Scanner;

public class TemperatureConverter
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Quantity: ");
		double celsius = scanner.nextInt();
		scanner.close();
		double fahrenheit = 1.8 * celsius + 32;
		System.out.printf(celsius + " degrees celsius is " + fahrenheit
				+ " degrees Fahrenheit.");
	}
}
