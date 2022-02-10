package io;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;
	
	@Nested
	@DisplayName("Add Method")
	class TestAdd{
		
		@Test
		@DisplayName("Testing Add negative")
		void testAddNegative() {
			assertEquals(9, mathUtils.add(1, 1), "this method should add the two numbers");

		}
		
		@Test
		@DisplayName("Testing Add positive")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "this method should add the two numbers");
		}
		
	}
	
	
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
	@DisplayName("Testing Multiply Method")
	void testMultiply() {
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1)) 
			);
	}
	
	
	@Disabled
	void tdd() {
		fail("tdd method failed");
	}
	
	@Test
	void serverRequest() {
		boolean isServerUp = true;
		
		assumeTrue(isServerUp);
		//fail("tdd method failed");
	}
	
}

