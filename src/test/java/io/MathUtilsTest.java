package io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	int cachedValue = 0;
	
	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		cachedValue = 10;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "this method should add the two numbers");
	}

	@Test
	void testDevide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw");
		/*
		double expectedResult = mathUtils.divide(10,0);
		assertEquals(5, expectedResult, "this method should return division result");
		*/
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		double expectedArea = mathUtils.computeCircleArea(10);
		assertEquals(314.1592653589793, expectedArea, "this method should return right circle area");
	}
	
	
	
}

