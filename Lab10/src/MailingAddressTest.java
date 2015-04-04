import static org.junit.Assert.*;

import org.junit.Test;

public class MailingAddressTest {

	private static final String WTCC_STREET = "9101 Fayetteville Rd";

	@Test
	public void testMailingAddress() {
		MailingAddress wakeTechAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		MailingAddress otherAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		assertEquals(wakeTechAddress, otherAddress);
	}

	@Test
	public void testMailingAddress2() {
		MailingAddress wakeTechAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		MailingAddress otherAddress = new MailingAddress(
				"201 South Columbia Street", "Chapel Hill", "NC", "27599");
		assertNotEquals(wakeTechAddress, otherAddress);
	}

	@Test
	public void testMailingAddress3() {
		MailingAddress wakeTechAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		MailingAddress otherAddress = wakeTechAddress;
		assertEquals(wakeTechAddress, otherAddress);
	}

	@Test
	public void testMailingAddress4() {
		MailingAddress wakeTechAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		StringBuilder sb = new StringBuilder();
		sb.append(WTCC_STREET);
		sb.append(" ");
		MailingAddress otherAddress = new MailingAddress(sb.toString().trim(),
				"Raleigh", "NC", "27603");
		assertEquals(wakeTechAddress, otherAddress);
	}

	@Test
	public void testMailingAddress5() {
		String toStr = WTCC_STREET + ", " + "Raleigh, NC 27603 ";
		MailingAddress wakeTechAddress = new MailingAddress(WTCC_STREET,
				"Raleigh", "NC", "27603");
		assertEquals(wakeTechAddress.toString(), toStr.trim());
	}
}
