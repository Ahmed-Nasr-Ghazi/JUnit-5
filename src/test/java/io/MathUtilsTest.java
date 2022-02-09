package io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning Up");
	}
	
	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "this method should add the two numbers");
	}

	@Test
	void testDevide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw");
		/*
		double expectedResult = mathUtils.divide(10,0);
		assertEquals(5, expectedResult, "this method should return division result");
		*/
	}
	
	@Test
	void testComputeCircleArea() {
		double expectedArea = mathUtils.computeCircleArea(10);
		assertEquals(314.1592653589793, expectedArea, "this method should return right circle area");
	}
	
	
	
}

