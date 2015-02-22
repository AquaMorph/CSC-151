import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsJUnitTest {

	@Test
	public void testPadLeftStringInt() {
		final String S1 = "";
		final String S2 = " ";
		final String S3 = "x";
		
		String s1r = StringUtils.padLeft(S1, 0);
		assertTrue(S1.equals(s1r));
		
		s1r = StringUtils.padLeft(S1, 1);
		assertTrue((" " + S1).equals(s1r));

		s1r = StringUtils.padLeft(S2, 0);
		assertTrue(S2.equals(s1r));

		s1r = StringUtils.padLeft(S2, 1);
		assertTrue("  ".equals(s1r));

		s1r = StringUtils.padLeft(S3, 1);
		assertTrue(s1r.equals(" " + S3));
	}

	@Test
	public void testPadLeftStringIntChar() {
		final String S1 = "";
		final String S2 = " ";
		final String S3 = "x";
		final char pad = 'z';
		
		String s1r = StringUtils.padLeft(S1, 0, pad);
		assertTrue(S1.equals(s1r));
		
		s1r = StringUtils.padLeft(S1, 1, pad);
		assertTrue((pad + S1).equals(s1r));

		s1r = StringUtils.padLeft(S2, 0, pad);
		assertTrue(S2.equals(s1r));

		s1r = StringUtils.padLeft(S2, 1, pad);
		assertTrue((pad + S2).equals(s1r));

		s1r = StringUtils.padLeft(S3, 1, pad);
		assertTrue(s1r.equals(pad + S3));
	}

}
