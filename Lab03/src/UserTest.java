import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testGetEmail() {
		User usr = new User();
		usr.setFirstName("Fred");
		usr.setLastName("Farble");
		assertTrue("fred.farble@waketech.edu".equals(usr.getEmail()));
	}

	@Test
	public void testGetFullName() {
		User usr = new User();
		usr.setFirstName("Fred");
		usr.setLastName("Farble");
		assertTrue("Fred Farble".equals(usr.getFullName()));
	}

}
