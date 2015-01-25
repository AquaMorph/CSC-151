////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2015
// 
//  Project:  Lab02
//  File:     Product.java
//  
//  Name:     Christian Colglazier
//  Email:    cacoglazier@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program keeps track of objects in an store. Gets product name as well as
 * the price. If a discount is added the price will be changed accordingly
 *
 * <p/>
 * Bugs: No known bugs
 * 
 * @author Christian Colglazier
 *
 */

public class Product
{
	private String productName;
	private double productePrice;

	public Product(String name)
	{
		productName = name;
	}

	public String getName()
	{
		return productName;
	}

	public void setPrice(double price)
	{
		productePrice = price;
	}

	public double getPrice()
	{
		return productePrice;
	}

	public void applyDiscount(double percent)
	{
		productePrice -= productePrice * percent * 0.01;
	}

}
