import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void testGetMonth() {
		Date d = new Date(1, 1);
		assertTrue("january".equalsIgnoreCase(d.getMonth()));
		
		d = new Date(0, 1);
		assertTrue("unknown".equalsIgnoreCase(d.getMonth()));
		
		d = new Date(12, 31);
		assertTrue("december".equalsIgnoreCase(d.getMonth()));
		
		d = new Date(13, 1);
		assertTrue("unknown".equalsIgnoreCase(d.getMonth()));
		
	}

	@Test
	public void testGetSeason() {
		Date d = new Date(13, 1);
		assertTrue("unknown".equalsIgnoreCase(d.getSeason()));

		d = new Date(12, 21);
		assertTrue("winter".equalsIgnoreCase(d.getSeason()));
		d = new Date(3, 20);
		assertTrue("winter".equalsIgnoreCase(d.getSeason()));
		
		d = new Date(3, 21);
		assertTrue("spring".equalsIgnoreCase(d.getSeason()));
		d = new Date(6, 20);
		assertTrue("spring".equalsIgnoreCase(d.getSeason()));
		
		d = new Date(6, 21);
		assertTrue("summer".equalsIgnoreCase(d.getSeason()));
		d = new Date(9, 22);
		assertTrue("summer".equalsIgnoreCase(d.getSeason()));
		
		d = new Date(9, 23);
		assertTrue("fall".equalsIgnoreCase(d.getSeason()));
		d = new Date(12, 20);
		assertTrue("fall".equalsIgnoreCase(d.getSeason()));
	}

	@Test
	public void testIsValidDay() {
		Date d = new Date(1, 1);
		assertTrue(d.isValidDay());
		
		d = new Date(0, 1);
		assertFalse(d.isValidDay());
		
		d = new Date(12, 31);
		assertTrue(d.isValidDay());
		
		d = new Date(2, 29);
		assertTrue(d.isValidDay());
		
		d = new Date(2, 30);
		assertFalse(d.isValidDay());
	}

	@Test
	public void testIsValidMonth() {
		Date d = new Date(1, 1);
		assertTrue(d.isValidMonth());
		
		d = new Date(0, 1);
		assertFalse(d.isValidMonth());
		
		d = new Date(12, 31);
		assertTrue(d.isValidMonth());
	}

}
