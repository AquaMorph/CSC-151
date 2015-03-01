import static org.junit.Assert.*;

import org.junit.Test;


public class QuadrangleTest {
	
	private CartesianPoint p2 = new CartesianPoint(30.3, -40.4);
	private CartesianPoint p3 = new CartesianPoint(35, -34);
	private CartesianPoint p4 = new CartesianPoint(38, -44);
	private CartesianPoint p5 = new CartesianPoint(35, -10);
	private CartesianPoint p6 = new CartesianPoint(10, 10);
	private CartesianPoint p7 = new CartesianPoint(11, 11);
	private CartesianPoint p8 = new CartesianPoint(10, 12);
	private CartesianPoint p9 = new CartesianPoint(9, 11);

	@Test
	public void testPerimeter() {
		Quadrangle q1 = new Quadrangle(p6, p7, p8, p9);
		// a second Quadrangle helps to flush out static data
		Quadrangle q2 = new Quadrangle(p2, p3, p4, p5);
		assertEquals(4*Math.sqrt(2), q1.perimeter(), .001);
	}

	@Test
	public void testToString() {
		Quadrangle q2 = new Quadrangle(p2, p3, p4, p5);
		assertEquals("[" + p2.toString() + ", " + p3.toString()
				+ ", " + p4.toString() + ", " + p5.toString()
				+ "]", q2.toString());
		System.out.println(q2.toString());
	}
	
	

}
