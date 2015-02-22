

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test
	public void testGetAverage() {
		Pair p = new Pair(10.0, 15.0);
		assertEquals(p.getAverage(), 12.5, .001);
	}

	@Test
	public void testGetDistance() {
		Pair p = new Pair(10.0, 15.0);
		assertEquals(p.getDistance(), 5, .001);
	}

	@Test
	public void testGetMaximum() {
		Pair p = new Pair(10.0, 15.0);
		assertEquals(p.getMaximum(), 15, .001);
	}

	@Test
	public void testGetMinimum() {
		Pair p = new Pair(10.0, 15.0);
		assertEquals(p.getMinimum(), 10, .001);
	}

}
