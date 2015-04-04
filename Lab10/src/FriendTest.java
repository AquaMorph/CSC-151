import static org.junit.Assert.*;

import org.junit.Test;


public class FriendTest {

	@Test
	public void testToString() {
		Contact c = new Friend("Dean", "Smith", "bestcoach@ncaa.org", "1/1/10");
		((Friend)c).setBirthday("2/2/2");
		assertEquals(c.toString(), "Dean Smith, bestcoach@ncaa.org, 2/2/2");
	}

}
