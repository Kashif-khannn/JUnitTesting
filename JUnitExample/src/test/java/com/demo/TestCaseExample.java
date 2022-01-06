package com.demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestCaseExample {
	UnitTesting u = new UnitTesting();
	
	@Test // aggregate of JUnit
	public void testConvertCase() {
		assertEquals(u.calculate(100),10); // assert equals method of junit test
		// goes to the calculate method of calculate method and with the parameter it returns the value associated to program
		// the second parameter a dummy value for testing purposes if returned value of calculate method and second one the same the test case will pass
	
		
	}
	
	@Test
	public void testConverCase2() {
		assertEquals(u.calculate(100),10000);
	}
	
	

}
