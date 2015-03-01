import static org.junit.Assert.*;

import org.junit.Test;


public class CartesianPointTest {

	@Test
	public void testDistance() {
		CartesianPoint p1 = new CartesianPoint(33.3, -44.4);
		CartesianPoint p2 = new CartesianPoint(30.3, -40.4);
		assertEquals(5.0, p1.distance(p2), .0001);
	}

	@Test
	public void testToString() {
		CartesianPoint p = new CartesianPoint(33.3, -44.4);
		assertEquals("(33.3, -44.4)", p.toString());
	}

}
