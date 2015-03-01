import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayUtilitiesTestJkp {

	@Test
	public void testToStringIntArrayString() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		String d2 = new String("");
		String d3 = new String("--delim--");
		
		String sEmpty = new String("");
		String sOne = new String("13");
		String sTwo1 = new String("14, 15");
		String sTwo2 = new String("14--delim--15");
		String sThree1 =  new String("16, 17, 18");
		String sThree2 =  new String("16--delim--17--delim--18");
		
		// String nulRet = ArrayUtilities.toString(null, null);
//		if (!(nulRet == null || new String("").equals(nulRet))) {
//			fail("returned Value: " + nulRet);
//		}
		assertEquals(sEmpty, ArrayUtilities.toString(empty, d3));
		assertEquals(sOne, ArrayUtilities.toString(one, d3));
		assertEquals(sTwo1, ArrayUtilities.toString(two, null));
		assertEquals(sTwo1, ArrayUtilities.toString(two, d2));
		assertEquals(sTwo2, ArrayUtilities.toString(two, d3));
		assertEquals(sThree1, ArrayUtilities.toString(three, null));
		assertEquals(sThree2, ArrayUtilities.toString(three, d3));
	}
	@Test
	public void testToStringIntArrayString2() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		String d2 = new String("");
		String d3 =new String("--delim--");
		
		String sEmpty = new String("");
		String sOne = "13";
		String sTwo1 = "14, 15";
		String sTwo2 = "14--delim--15";
		String sThree1 = "16, 17, 18";
		String sThree2 = "16--delim--17--delim--18";
		

		assertEquals(sTwo1, ArrayUtilities.toString(two, d2));
		assertEquals(sTwo2, ArrayUtilities.toString(two, d3));
		assertEquals(sThree1, ArrayUtilities.toString(three, null));
		assertEquals(sThree2, ArrayUtilities.toString(three, d3));
	}

	@Test
	public void testToStringIntArrayString3() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		String d2 = new String("");
		String d3 =new String("--delim--");
		
		String sEmpty = new String("");
		String sOne = "13";
		String sTwo1 = "14, 15";
		String sTwo2 = "14--delim--15";
		String sThree1 = "16, 17, 18";
		String sThree2 = "16--delim--17--delim--18";
		
		assertEquals(sTwo2, ArrayUtilities.toString(two, d3));
		assertEquals(sThree1, ArrayUtilities.toString(three, null));
		assertEquals(sThree2, ArrayUtilities.toString(three, d3));
	}


	@Test
	public void testToStringIntArrayString4() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		String d2 = new String("");
		String d3 =new String("--delim--");
		
		String sEmpty = new String("");
		String sOne = "13";
		String sTwo1 = "14, 15";
		String sTwo2 = "14--delim--15";
		String sThree1 = "16, 17, 18";
		String sThree2 = "16--delim--17--delim--18";
		assertEquals(sThree1, ArrayUtilities.toString(three, null));
		assertEquals(sThree2, ArrayUtilities.toString(three, d3));
	}
	

	@Test
	public void testToStringIntArrayString5() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		String d2 = new String("");
		String d3 =new String("--delim--");
		
		String sEmpty = new String("");
		String sOne = "13";
		String sTwo1 = "14, 15";
		String sTwo2 = "14--delim--15";
		String sThree1 = "16, 17, 18";
		String sThree2 = new String("16--delim--17--delim--18");
		
		assertEquals(sThree2, ArrayUtilities.toString(three, d3));
	}
	
	@Test
	public void testReverse() {
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		int[] twoR = {15, 14};
		int[] threeR = {18, 17, 16};
		
		assertArrayEquals(empty, ArrayUtilities.reverse(empty));
		assertArrayEquals(one, ArrayUtilities.reverse(one));
		assertArrayEquals(twoR, ArrayUtilities.reverse(two));
		assertArrayEquals(threeR, ArrayUtilities.reverse(three));
	}

	@Test
	public void testHasDuplicates() {
		// int[] nul = null;
		int[] empty = new int[0];
		int[] one = {13};
		int[] two = {14, 15};
		int[] three = {16, 17, 18};
		
		// assertFalse(ArrayUtilities.hasDuplicates(nul));
		assertFalse(ArrayUtilities.hasDuplicates(empty));
		assertFalse(ArrayUtilities.hasDuplicates(one));
		assertFalse(ArrayUtilities.hasDuplicates(two));
		assertFalse(ArrayUtilities.hasDuplicates(three));

		int[] twoD = {15, 15};
		int[] threeD = {18, 17, 18};
		assertTrue(ArrayUtilities.hasDuplicates(twoD));
		assertTrue(ArrayUtilities.hasDuplicates(threeD));
	}

}
