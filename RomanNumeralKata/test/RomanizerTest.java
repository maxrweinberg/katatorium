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
		assertEquals(romanizer.reinterpret("100"),"C");
		assertEquals(romanizer.reinterpret("1800"),"MDCCC");
		assertEquals(romanizer.reinterpret("99"),"XCIX");
		assertEquals(romanizer.reinterpret("3999"),"MMMCMXCIX");
		assertEquals(romanizer.reinterpret("1"),"I");
	}

	@Test
	public void testNumeralToNumber() {
		assertEquals(romanizer.reinterpret("C"),"100");
		assertEquals(romanizer.reinterpret("XIV"),"14");
		assertEquals(romanizer.reinterpret("DCCCXC"),"890");
		assertEquals(romanizer.reinterpret("XXXIX"),"39");
		assertEquals(romanizer.reinterpret("MMMCMXCIX"),"3999");
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
}
