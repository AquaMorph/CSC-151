import static org.junit.Assert.*;

import org.junit.Test;


public class BusinessAssociateTest {

	@Test
	public void testToString() {
		Contact c = new BusinessAssociate("Coach", "Dean", "Smith", "bestcoach@ncaa.org", "Tar Heels Inc", "coach");
		assertEquals(c.toString(), "Coach Dean Smith, bestcoach@ncaa.org, Tar Heels Inc, coach");
	}

}
