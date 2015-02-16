////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  0001
// 
//  Project:  Lab05
//  File:     ProductCatalog.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * 
 *  A program lets user enter a list of of products and prices and it will return
 *  the highist priced product.
 *
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class ProductCatalog
{

	public static void main(String[] args)
	{
		int numProducts;
		String max = "";
		double maxPrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of products: ");
		numProducts = scanner.nextInt();

		for (int i = 0; i < numProducts; i++)
		{
			String name;
			double price;
			System.out.println("Enter the name of product " + (i + 1) + ": ");
			name = scanner.next();
			System.out.println("Enter the price of product " + (i + 1) + ": ");
			price = scanner.nextDouble();

			Product product = new Product(name, price);
			if (product.getPrice() > maxPrice)
			{
				max = product.toString();
				maxPrice = product.getPrice();
			}

		}

		System.out.println("Most Expensive: " + max);

		scanner.close();
	}

}
