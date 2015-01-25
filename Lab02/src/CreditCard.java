
public class CreditCard
{
	private String accountNumber;
	private double creditLimit;
	private double balance;
	
	public void CreditCard(String number, double limit)
	{
		accountNumber = number;
		limit = creditLimit;
		balance = 0;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public double getCreditLimit() 
	{
		return limit;
	}

	public double getBalance(double theBalance) 
	{
		return balance;
	}
	
	public void charge(double amount)
	{
		balance = balance + amount;
		
		return balance;
	}
	
}
