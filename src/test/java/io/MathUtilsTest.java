package io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "this method should add the two numbers");
	}

	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		double expectedArea = mathUtils.computeCircleArea(10);
		assertEquals(314.1592653589793, expectedArea, "this method should return right circle area");
	}
	
	
}

