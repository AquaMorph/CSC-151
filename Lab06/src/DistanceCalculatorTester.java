import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceCalculatorTester {

	@Test
	public void testGetTotalDistance() {
		DistanceCalculator dc = new DistanceCalculator();
		assertEquals(dc.getTotalDistance(), 0.0, .0001);
		
		dc.addPoint(1.0, 1.0);
		assertEquals(dc.getTotalDistance(), 1.414, .001);
		
		dc.addPoint(4.0,  5.0);
		assertEquals(dc.getTotalDistance(), 6.414, .001);
	}

}
