import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneNumberTest
{

	private PhoneNumber number = new PhoneNumber("919-866-5000");
	
	@Test
	public void testGetAreaCode()
	{
		assertEquals("Area code test w/ phone number = 919-866-5000", "919", number.getAreaCode());
	}

	@Test
	public void testGetExchange()
	{
		assertEquals("Exchange test w/ phone number = 919-866-5000", "866", number.getExchange());
	}

	@Test
	public void testGetSubscriberNumber()
	{
		assertEquals("Subscriber number test w/ phone number = 919-866-5000","5000", number.getSubscriberNumber());
	}

}
