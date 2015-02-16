
public class Product 
{
	private String name;
	private double price;
	
	public Product(String theName, double thePrice)
	{
		name = theName;
		price = thePrice;
	}

	public String getName() 
	{
		return name;
	}

	public double getPrice() 
	{
		return price;
	}

	@Override
	public String toString() 
	{
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}
