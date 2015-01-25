
public class CreditCardTester 
{

	
	public static void main(String[] args) 
	{
		CreditCard card = CreditCard("1234-5678-9012-3456", 1000.00);
		
		String formatString = "Credit Card [number = %s, bal = %.2f, limit = %.2f]\n";
		
		System.out.printf(formatString, card.getAccountNumber(), card.getBalance(), card.getCreditLimit());
		
		System.out.println("\nCharging $50.00 to credit card...\n");
		
		card.charge(50.00);
		
		System.out.printf(formatString, card.getAccountNumber(), card.getBalance(), card.getCreditLimit());
	}

}
