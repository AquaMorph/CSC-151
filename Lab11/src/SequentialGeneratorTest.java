import static org.junit.Assert.*;

import org.junit.Test;


public class SequentialGeneratorTest {

	@Test
	public void testNextValue() {
		NumberGenerator ng = new SequentialGenerator(-1, -1);
		assertEquals(-1, ng.nextValue());
	}
	
	@Test
	public void testNextValue2() {
		NumberGenerator ng = new SequentialGenerator(2, 3);
		ng.nextValue();
		assertEquals(3, ng.nextValue());
	}
	
	@Test
	public void testNextValue3() {
		long l = Integer.MAX_VALUE;
		l += l;
		NumberGenerator ng = new SequentialGenerator(l, l+1);
		ng.nextValue();
		assertEquals(l+1, ng.nextValue());
	}

	@Test
	public void testHasNext() {
		long l = Integer.MAX_VALUE;
		l += l;
		NumberGenerator ng = new SequentialGenerator(l, l+1);
		ng.nextValue();
		assertTrue(ng.hasNext());
	}

	@Test
	public void testHasNext2() {
		long l = Integer.MAX_VALUE;
		l += l;
		NumberGenerator ng = new SequentialGenerator(l, l-1);
		assertFalse(ng.hasNext());
	}

	@Test
	public void testHasNext3() {
		long l = Integer.MAX_VALUE;
		l += l;
		NumberGenerator ng = new SequentialGenerator(l, l+1);
		assertTrue(ng.hasNext());
		assertTrue(ng.hasNext());
		assertTrue(ng.hasNext());
		ng.nextValue();
		assertTrue(ng.hasNext());
		ng.nextValue();
		assertFalse(ng.hasNext());
	}

	@Test
	public void testHasNext4() {
		long l = Integer.MAX_VALUE;
		l += l;
		NumberGenerator ng = new SequentialGenerator(l, l);
		assertTrue(ng.hasNext());
		ng.nextValue();
		assertFalse(ng.hasNext());
	}


}
