package gov.weinberg.romanNumeral;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanizerTest {
	Romanizer romanizer;
	
	@Before
	public void setUp() throws Exception {
		romanizer = new Romanizer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumberToNumeral() {
		assertEquals("C",romanizer.reinterpret("100"));
		assertEquals("MDCCC",romanizer.reinterpret("1800"));
		assertEquals("XCIX",romanizer.reinterpret("99"));
		assertEquals("MMMCMXCIX",romanizer.reinterpret("3999"));
		assertEquals("I",romanizer.reinterpret("1"));
		assertEquals("MCMXCIX",romanizer.reinterpret("1999"));
	}

	@Test
	public void testNumeralToNumber() {
		assertEquals("100",romanizer.reinterpret("C"));
		assertEquals("14",romanizer.reinterpret("XIV"));
		assertEquals("890",romanizer.reinterpret("DCCCXC"));
		assertEquals("39",romanizer.reinterpret("XXXIX"));
		assertEquals("3999",romanizer.reinterpret("MMMCMXCIX"));
		assertEquals("1999",romanizer.reinterpret("MCMXCIX"));
	}
	
	@Test(expected=Exception.class)
	public void testUnparseableException() {
		romanizer.reinterpret("ioadjflia9");
	}

	@Test(expected=Exception.class)
	public void testZeroException() {
		romanizer.reinterpret("0");
	}

	@Test(expected=Exception.class)
	public void testNumberTooLargeException() {
		romanizer.reinterpret("4000");
	}

	@Test(expected=Exception.class)
	public void testAlmostButNotQuiteValidNumeral() {
		romanizer.reinterpret("IXIX");
	}
}
