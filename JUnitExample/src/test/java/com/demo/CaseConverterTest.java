package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;
public class CaseConverterTest {
	CaseConverter c1 = new CaseConverter();
	
	@Test
	public void testCase1() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	@Test
	public void testCase2() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	@Test
	public void testCase3() {
		assertEquals(c1.convertCase(""), "");
	}
	@Test
	public void testCase4() {
		assertEquals(c1.convertCase(null), "");
	}
	@Test
	public void testCase5() {
		assertEquals(c1.convertCase("7"),"7");
	}

}
