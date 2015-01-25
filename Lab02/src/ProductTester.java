////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab02
//  File:     ProductTester.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program test the Product class to make sure it proberly adds entreis and
 * can handle price changes
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

import java.util.Scanner;

public class ProductTester
{
	public static void main(String[] args)
	{
		Product product = new Product("“Apple iPod Touch”");
		String formatString = "Product[name = %s, price = $%.2f]\n";
		product.setPrice(177.95);
		System.out.printf(formatString, product.getName(), product.getPrice());
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter discount percentage [0 - 100]: ");
		double discount = scanner.nextInt();
		scanner.close();
		product.applyDiscount(discount);
		System.out.printf(formatString, product.getName(), product.getPrice());
	}
}
