package com.hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddd() {
		StringCalculator.add("1,2");
	}

	@Test(expected = RuntimeException.class)
	public void testIsNumberLengthGreaterThanTwo() {
		StringCalculator.add("x,2");
	}

	/*@Test
	public void testIsNumberEmpty() {
		fail("Not yet implemented");
	}*/

}
