import static org.junit.Assert.*;

import org.junit.Test;

public class PolygonTest {

	private CartesianPoint p2 = new CartesianPoint(30.3, -40.4);
	private CartesianPoint p3 = new CartesianPoint(35, -34);
	private CartesianPoint p4 = new CartesianPoint(38, -44);
	private CartesianPoint p5 = new CartesianPoint(35, -10);
	private CartesianPoint p6 = new CartesianPoint(10, 10);
	private CartesianPoint p7 = new CartesianPoint(11, 11);
	private CartesianPoint p8 = new CartesianPoint(10, 12);
	private CartesianPoint p9 = new CartesianPoint(9, 11);
	private CartesianPoint p10 = new CartesianPoint(9, 10);

	@Test
	public void testPerimeter() {
		Polygon q1 = new Polygon();
		q1.addPoint(p6);
		q1.addPoint(p7);
		q1.addPoint(p8);
		q1.addPoint(p9);
		q1.addPoint(p10);
		// a second object helps to flush out static data
		Polygon q2 = new Polygon();
		q2.addPoint(p2);
		assertEquals(3 * Math.sqrt(2) + 2, q1.perimeter(), .001);
	}

	@Test
	public void testToString() {
		Polygon q2 = new Polygon();
		q2.addPoint(p2);
		q2.addPoint(p3);
		q2.addPoint(p4);
		assertEquals(
				"[" + p2.toString() + ", " + p3.toString() + ", "
						+ p4.toString() + "]", q2.toString());
	}

}
