package io;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	static void before() {
		System.out.println("Before every method");
	}
	
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning Up");
	}
	
	@AfterAll
	static void after() {
		System.out.println("after all methods");
	}
	
	@Test
	@DisplayName("Testing Add")
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
	
	@Test
	@Disabled
	void tdd() {
		fail("tdd method failed");
	}
	
	@Test
	void serverRequest() {
		boolean isServerUp = true;
		
		assumeTrue(isServerUp);
		fail("tdd method failed");
	}
	
}

